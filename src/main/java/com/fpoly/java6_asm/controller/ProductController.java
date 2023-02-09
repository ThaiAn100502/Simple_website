package com.fpoly.java6_asm.controller;

import com.fpoly.java6_asm.entity.Product;
import com.fpoly.java6_asm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    // tra ve trang list sp
    @RequestMapping("/product/list")
    public String list(Model model, Optional<String> cid){
        if (cid.isPresent()){
            List<Product> list= productService.findByCategoryId(cid.get());
            model.addAttribute("items",list);
        }else {
            List<Product> list= productService.findAll();
            model.addAttribute("items",list);
        }
        return "product/list";
    }
    // tra ve trang chi tiet san pham
    @RequestMapping("/product/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id){
        Product item = productService.findById(id);
        model.addAttribute("item",item);
        return "product/detail";
    }
}
