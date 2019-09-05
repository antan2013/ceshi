package cn.dksy.controller;

import cn.dksy.domain.Account;
import cn.dksy.service.IAccountService;
import cn.dksy.service.impl.IAccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author JAVASM
 * @title: AccountController
 * @projectName ssm_diy
 * @description: TODO
 * @date 2019/8/21 21:15
 */
@Controller("accountController")
@Component
@RequestMapping("/account/")
public class AccountController {
    @Autowired
    @Qualifier("iAccountServiceImpl")
    private IAccountService accountService;

    @RequestMapping("finaAll")
    public ModelAndView finaAll(){
        ModelAndView mv = new ModelAndView();
        List<Account> accounts = accountService.findAll();
        mv.addObject("accounts",accounts);
        mv.setViewName("list");
        return mv;
    }

    @RequestMapping("finaAllJson")
    public ResponseEntity<List<Account>> finaAllJson(){

        List<Account> accounts = accountService.findAll();

        return ResponseEntity.ok(accounts);
    }

    @RequestMapping("saveAccount")
    public String saveAccount(Account account){
        accountService.saveAccount(account);
        return "redirect:finaAll";
    }
}