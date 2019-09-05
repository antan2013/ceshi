package cn.dksy.service;

import cn.dksy.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务层接口
 */
@Service("iAccountService")
public interface IAccountService {
    /**
     * 保存账户
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 查询所有账户
     * @return
     */
    List<Account> findAll();
}
