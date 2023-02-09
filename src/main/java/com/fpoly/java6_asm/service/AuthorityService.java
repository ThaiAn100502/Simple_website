package com.fpoly.java6_asm.service;

import com.fpoly.java6_asm.entity.Authority;

import java.util.List;

public interface AuthorityService {
    List<Authority> findAuthoritiesOfAdministrators();

    List<Authority> findAll();

    public void delete(Integer id);

    public Authority create(Authority auth);
}
