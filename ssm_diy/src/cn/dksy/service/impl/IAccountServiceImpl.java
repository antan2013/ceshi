package cn.dksy.service.impl;

import cn.dksy.dao.IAccountDao;

import cn.dksy.domain.Account;
import cn.dksy.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author JAVASM
 * @title: IAccountDaoImpl
 * @projectName ssm_diy
 * @description: 业务层实现类
 * @date 2019/8/21 20:37
 */
@Service("iAccountServiceImpl")
@Transactional
public class IAccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;
    /**
     * 保存账户
     *
     * @param account
     */
    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);

    }

    /**
     * 查询所有账户
     *
     * @return
     */
    @Override
    public List<Account> findAll() {
       return accountDao.findAll();

    }
}