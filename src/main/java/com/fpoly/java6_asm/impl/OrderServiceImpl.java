package com.fpoly.java6_asm.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fpoly.java6_asm.dao.OrderDAO;
import com.fpoly.java6_asm.dao.OrderDetailDAO;
import com.fpoly.java6_asm.entity.Order;
import com.fpoly.java6_asm.entity.OrderDetail;
import com.fpoly.java6_asm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDAO dao;
    OrderDetailDAO orderDetailDAO;

    @Override
    public Order create(JsonNode orderData) {
        ObjectMapper mapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Order order = mapper.convertValue(orderData,Order.class);
        try{

            dao.save(order);

            TypeReference<List<OrderDetail>> type = new TypeReference<>() {};
            List<OrderDetail> details = mapper.convertValue(orderData.get("orderDetails"),type)
                    .stream().peek(d -> d.setOrder(order)).collect(Collectors.toList());
            orderDetailDAO.saveAll(details);

        }catch (NullPointerException ex){
            System.out.println(ex);
        }
        return order;
    }

    @Override
    public Order findById(Long id) {
        return dao.findById(id).get();
    }

    @Override
    public List<Order> findByUsername(String username) {
        return dao.findByUsername(username);
    }
}
