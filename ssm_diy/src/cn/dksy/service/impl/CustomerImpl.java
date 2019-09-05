package cn.dksy.service.impl;

import cn.dksy.dao.CustomerDao;
import cn.dksy.domain.Customer;
import cn.dksy.domain.Industry;
import cn.dksy.domain.Level;
import cn.dksy.domain.Source;
import cn.dksy.service.CustomerService;
import cn.dksy.utils.PageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author JAVASM
 * @title: CustomerImpl
 * @projectName ssm_diy
 * @description: TODO
 * @date 2019/8/22 16:36
 */
@Service
@Transactional
public class CustomerImpl implements CustomerService {
    @Autowired
    private CustomerDao  customerDao;

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public PageBean findAll(String currentPage,String pageSize) {
        if(currentPage == null || "".equals(currentPage)){
            currentPage= "1";
        }
        if(pageSize == null || "".equals(pageSize)){
            pageSize= "10";
        }
        Integer total = customerDao.findTotal();
        PageBean pageBean = new PageBean(total,Integer.parseInt(currentPage),Integer.parseInt(pageSize));
        List<Customer> customers = customerDao.findAll(pageBean.getStart(), pageBean.getRows());
        pageBean.setList(customers);
        return pageBean;
    }

    /**
     * 查询所有来源
     */
    @Override
    public List<Source> findAllSource() {
        return customerDao.findAllSource();
    }

    /**
     * 查询所有行业
     */
    @Override
    public List<Industry> findAllIndustry() {
        return customerDao.findAllIndustry();
    }

    /**
     * 查询所有级别
     */
    @Override
    public List<Level> findAllLevel() {
        return customerDao.findAllLevel();
    }

    /**
     * 根据id查询客户
     *
     * @param id
     */
    @Override
    public Customer findById(Integer id) {
        return customerDao.findById(id);
    }

    /**
     * 保存修改
     *
     * @param customer
     */
    @Override
    public void saveCustomer(Customer customer) {
        customerDao.saveCustomer(customer);
    }

    /**
     * id删除
     *
     * @param id
     */
    @Override
    public void deleteById(Integer id) {
        customerDao.deleteById(id);
        System.out.println(id);
    }
}