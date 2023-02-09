package com.fpoly.java6_asm.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fpoly.java6_asm.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    Order create(JsonNode orderData);

    Order findById(Long id);

    List<Order> findByUsername(String username);
}
