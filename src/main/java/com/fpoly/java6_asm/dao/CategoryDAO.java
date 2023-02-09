package com.fpoly.java6_asm.dao;


import com.fpoly.java6_asm.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDAO extends JpaRepository<Category,String> {
}
