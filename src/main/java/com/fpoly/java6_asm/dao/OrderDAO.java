package com.fpoly.java6_asm.dao;

import com.fpoly.java6_asm.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderDAO extends JpaRepository<Order,Long> {
   @Query("select o from Order o where o.account.username=?1")
   List<Order> findByUsername(String username);
}
