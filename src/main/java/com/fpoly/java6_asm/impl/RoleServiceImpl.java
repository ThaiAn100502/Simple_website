package com.fpoly.java6_asm.impl;

import com.fpoly.java6_asm.dao.RoleDAO;
import com.fpoly.java6_asm.entity.Role;
import com.fpoly.java6_asm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleDAO rdao;
    @Override
    public List<Role> findAll() {
        return rdao.findAll();
    }
}
