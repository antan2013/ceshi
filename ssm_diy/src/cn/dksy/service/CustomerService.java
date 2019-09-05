package cn.dksy.service;

import cn.dksy.domain.Customer;
import cn.dksy.domain.Industry;
import cn.dksy.domain.Level;
import cn.dksy.domain.Source;
import cn.dksy.utils.PageBean;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CustomerService {

    /**
     * 查询
     * @return
     */
    PageBean findAll(String currentPage, String pageSize);

    /**
     *查询所有来源
     */
    List<Source> findAllSource();
    /**
     *查询所有行业
     */
    List<Industry> findAllIndustry();
    /**
     *查询所有级别
     */
    List<Level> findAllLevel();

    /**
     * 根据id查询客户
     * @param id
     */
    Customer findById(Integer id);

    /**
     * 保存修改
     * @param customer
     */
    void saveCustomer(Customer customer);

    /**
     * id删除
     */
    void deleteById(Integer id);
}
