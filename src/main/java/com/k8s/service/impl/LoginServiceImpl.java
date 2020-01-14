package com.k8s.service.impl;

import com.k8s.dao.LoginDao;
import com.k8s.entity.Account;
import com.k8s.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;

    @Override
    public String login(String account, String passwork) {
        Optional<Account> result = loginDao.findById(account);
        if (result.isPresent()){
            if (result.get().getPassword()== passwork){
                System.out.println(result.toString());
                return "1";
            }
            else return "-1";
        }
        return "0";
    }

    @Override
    public List<Account> listAccount() {
        return loginDao.findAll();
    }

}
