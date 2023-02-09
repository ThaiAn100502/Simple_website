package com.fpoly.java6_asm.dao;



import com.fpoly.java6_asm.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailDAO extends JpaRepository<OrderDetail,Long> {
}
