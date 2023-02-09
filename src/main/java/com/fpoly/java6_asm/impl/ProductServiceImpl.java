package com.fpoly.java6_asm.impl;

import com.fpoly.java6_asm.dao.ProductDAO;
import com.fpoly.java6_asm.entity.Product;
import com.fpoly.java6_asm.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductDAO pdao;

    @Override
    public List<Product> findAll() {
        return pdao.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return pdao.findById(id).get();
    }

    @Override
    public List<Product> findByCategoryId(String cid) {
        return pdao.findByCategoryId(cid);
    }

    @Override
    public Product create(Product product) {
        log.info(">> Create new product: {}", product);
        return pdao.save(product);
    }

    @Override
    public Product update(Product product) {
        return pdao.save(product);
    }

    @Override
    public void delete(Integer id) {
        pdao.deleteById(id);
    }

}
