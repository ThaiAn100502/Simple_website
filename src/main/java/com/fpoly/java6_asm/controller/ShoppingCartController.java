package com.fpoly.java6_asm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShoppingCartController {
    // tra ve trang cart/view
    @RequestMapping("/cart/view")
    public String view(Model model){
        return "cart/view";
    }

}
