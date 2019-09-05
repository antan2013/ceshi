package cn.dksy.dao;

import cn.dksy.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 业务层接口
 */
@Repository
public interface IAccountDao {
    /**
     * 保存账户
     * @param account
     */
    @Insert("INSERT INTO account (name,money) values (#{name},#{money})")
    void saveAccount(Account account);

    /**
     * 查询所有账户
     * @return
     */
    @Select("select * from account")
    List<Account> findAll();
}
