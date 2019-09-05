package cn.dksy;

import cn.dksy.dao.IAccountDao;
import cn.dksy.domain.Account;
import cn.dksy.service.IAccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.List;

/**
 * @author JAVASM
 * @title: Test
 * @projectName ssm_diy
 * @description: 测试环境搭建
 * @date 2019/8/21 20:56
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class TestSsm {
//    @Autowired
//private IAccountService accountService;

    @Test
    public void testSpring(){
        System.out.println("测试spring");
        ApplicationContext ac = new  ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = ac.getBean(IAccountService.class);
        accountService.findAll();
    }

    @Test
    public void testMyBatis() throws IOException {
        System.out.println("testMyBatis...");
        //通过配置文件创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("WEB-INF/SqlMapConfig.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        IAccountDao accountDao = sqlSession.getMapper(IAccountDao.class);
        List<Account> accounts = accountDao.findAll();
        accounts.forEach(account -> System.out.println(account));
    }
@Test
    public void testSpringMyBatis(){
        System.out.println("测试spring整合mybatis...");
        //List<Account> accounts = accountService.findAll();
       //accounts.forEach(account -> System.out.println(account));
        //accountService.saveAccount(new Account("wangwu",1111f));

    }
}