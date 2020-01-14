package com.k8s.service;

import com.k8s.entity.Account;

import java.util.List;

public interface LoginService {
    String login(String account, String passwork);
    List<Account> listAccount();
}