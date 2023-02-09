package com.fpoly.java6_asm.dao;


import com.fpoly.java6_asm.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountDAO extends JpaRepository<Account,String> {
@Query("select distinct ar.account from Authority  ar where  ar.role.id in ('DIRE','STAF')")
    List<Account> getAdministrators();
}
