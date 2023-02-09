package com.fpoly.java6_asm.impl;

import com.fpoly.java6_asm.dao.CategoryDAO;
import com.fpoly.java6_asm.entity.Category;
import com.fpoly.java6_asm.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryDAO cdao;

    @Override
    public List<Category> findAll() {
        return cdao.findAll();
    }
}
