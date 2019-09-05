package cn.dksy.controller;

import cn.dksy.domain.*;
import cn.dksy.service.CustomerService;
import cn.dksy.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author JAVASM
 * @title: CustomerController
 * @projectName ssm_diy
 * @description: TODO
 * @date 2019/8/22 16:29
 */
@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    /**
     * 查询显示

     * @return
     */
    @RequestMapping("findAll")
    public ResponseEntity<Map<String,Object>> findAll(CustomerVo customerVo){
        Map<String,Object> map = new HashMap<>(16);
        PageBean pageBean = customerService.findAll(customerVo.getCurrentPage(),customerVo.getPageSize());
        List<Source> sources = customerService.findAllSource();
        List<Industry> industries = customerService.findAllIndustry();
        List<Level> levels = customerService.findAllLevel();
        map.put("pageBean",pageBean);
        map.put("sources",sources);
        map.put("industries",industries);
        map.put("levels",levels);
        return ResponseEntity.ok(map);
    }

    /**
     * 根据id查询客户 回显修改
     */
    @GetMapping("findById")

    public ResponseEntity<Customer> findById(Integer id){
        Customer customer = customerService.findById(id);
        return ResponseEntity.ok(customer);
    }

    /**
     * 保存用户修改的信息
     *
     */
    @GetMapping("saveCustomer")
    @ResponseBody
    public String saveCustomer(Customer customer){
        customerService.saveCustomer(customer);
        return "success";
    }

    @RequestMapping("deleteCustomer")
    @ResponseBody
    public String deleteCustomer(Integer id){
        customerService.deleteById(id);
        return "success";
    }


}
