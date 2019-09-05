package cn.dksy.dao;

import cn.dksy.domain.Customer;
import cn.dksy.domain.Industry;
import cn.dksy.domain.Level;
import cn.dksy.domain.Source;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.jdbc.Sql;

import javax.annotation.Resource;
import java.util.List;

public interface CustomerDao {

    @Select("SELECT count(*) FROM customer ")
    Integer findTotal();
    /**
     * 查询所有
     * @return
     */

    @Select("SELECT c.*, b.dict_item_name source, b1.dict_item_name industry, b2.dict_item_name level, c.cust_phone phone, c.cust_mobile mobile FROM customer c, base_dict b, base_dict b1, base_dict b2 WHERE c.cust_source = b.dict_id AND c.cust_industry = b1.dict_id AND c.cust_level = b2.dict_id LIMIT #{start},#{pageSize}")
    @Results(id = "customer",value = {
            @Result(id = true,column = "cust_id",property = "id"),
            @Result(column = "cust_name",property = "name"),
            @Result(column = "cust_source",property = "sid"),
            @Result(column = "cust_industry",property = "indusid"),
            @Result(column = "cust_level",property = "leid"),
            @Result(column = "dict_item_name",property = "source"),
            @Result(column = "dict_item_name1",property = "industry"),
            @Result(column = "dict_item_name2",property = "level"),
            @Result(column = "cust_phone",property = "phone"),
            @Result(column = "cust_mobile",property = "mobile")
    })
    List<Customer> findAll(@Param("start") Integer start, @Param("pageSize")Integer pageSize);


    /**
     *查询所有来源
     */
    @Select("SELECT b.dict_id ,b.dict_item_name from base_dict b where b.dict_type_code = 002")
    @Results(id = "source",value = {
            @Result(column = "dict_id",property ="id" ),
            @Result(column = "dict_item_name",property = "name")
    })
    List<Source> findAllSource();
    /**
     *查询所有行业
     */
    @Select("SELECT b.dict_id ,b.dict_item_name from base_dict b where b.dict_type_code = 001")
    @Results(id = "industry",value = {
            @Result(column = "dict_id",property ="id" ),
            @Result(column = "dict_item_name",property = "name")
    })
    List<Industry> findAllIndustry();
    /**
     *查询所有级别
     */
    @Select("SELECT b.dict_id ,b.dict_item_name from base_dict b where b.dict_type_code = 006")
    @Results(id = "level",value = {
            @Result(column = "dict_id",property ="id" ),
            @Result(column = "dict_item_name",property = "name")
    })
    List<Level> findAllLevel();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @Select("SELECT c.*, b.dict_item_name source, b1.dict_item_name industry, b2.dict_item_name level, c.cust_phone phone, c.cust_mobile mobile FROM customer c, base_dict b, base_dict b1, base_dict b2 WHERE c.cust_source = b.dict_id AND c.cust_industry = b1.dict_id AND c.cust_level = b2.dict_id and c.cust_id = #{id}")
    @ResultMap(value = "customer")
    Customer findById(@Param("id") Integer id);

    /**
     * 保存修改
     * @param customer
     */
    @Update("update customer set cust_name = #{name},cust_source = #{sid},cust_industry = #{indusid},cust_level = #{leid},cust_phone=#{phone},cust_mobile=#{mobile} where cust_id = #{id}")
    void saveCustomer(Customer customer);

    /**
     * 删除
     * @param id
     */
    @Delete("delete from customer where cust_id = #{id}")
    void deleteById(@Param("id") Integer id);
}
