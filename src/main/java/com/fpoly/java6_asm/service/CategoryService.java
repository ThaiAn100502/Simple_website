package com.fpoly.java6_asm.service;

import com.fpoly.java6_asm.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    List<Category> findAll();
}
