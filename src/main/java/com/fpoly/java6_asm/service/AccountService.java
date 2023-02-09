package com.fpoly.java6_asm.service;

import com.fpoly.java6_asm.dao.AccountDAO;
import com.fpoly.java6_asm.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {
    Account findById(String username);

    List<Account> getAdministrators();

    List<Account> findAll();
}
