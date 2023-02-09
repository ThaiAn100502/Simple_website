package com.fpoly.java6_asm.rest.contrller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fpoly.java6_asm.entity.Order;
import com.fpoly.java6_asm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/orders")
public class OrderRestController {
    @Autowired
    OrderService orderService;

    @PostMapping
    public Order create(@RequestBody JsonNode orderData){
        return orderService.create(orderData);
    }
}
