package com.k8s.controller;

import com.k8s.entity.Account;
import com.k8s.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public String Login(@RequestParam("account")String account, @RequestParam("passwork") String passwork){
        return loginService.login(account, passwork);
    }

    @GetMapping("/account")
    public List<Account> listAccount(){
        return loginService.listAccount();
    }
}
