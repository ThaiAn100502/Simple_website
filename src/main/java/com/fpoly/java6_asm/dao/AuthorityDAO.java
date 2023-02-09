package com.fpoly.java6_asm.dao;


import com.fpoly.java6_asm.entity.Account;
import com.fpoly.java6_asm.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorityDAO extends JpaRepository<Authority,Integer> {
   @Query("select distinct a from Authority a where a.account in ?1")
    List<Authority> authoritiesOf(List<Account> accounts);
}
