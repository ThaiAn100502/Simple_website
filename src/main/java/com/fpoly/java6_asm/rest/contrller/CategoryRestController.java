package com.fpoly.java6_asm.rest.contrller;

import com.fpoly.java6_asm.entity.Category;
import com.fpoly.java6_asm.entity.Product;
import com.fpoly.java6_asm.service.CategoryService;
import com.fpoly.java6_asm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/categories")
public class CategoryRestController {
    @Autowired
    CategoryService categoryService;

    @GetMapping()
    public List<Category> getAll(){
        return categoryService.findAll();
    }
}
