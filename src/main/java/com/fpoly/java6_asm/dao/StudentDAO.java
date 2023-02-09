package com.fpoly.java6_asm.dao;

import com.fpoly.java6_asm.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDAO extends JpaRepository<Student,String> {
}
