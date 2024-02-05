package com.example.baitap.service;

import com.example.baitap.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private List<Product> productList = new ArrayList<>();

    @Override
    public List<Product> getAllProducts() {
        return productList;
    }
    @Override
    public Product getProductById(Long id) {
        return null;
    }
    @Override
    public Product createProduct(Product product) {
        return product;
    }

    @Override
    public Product updateProduct(Long id, Product updatedProduct) {
        return null;
    }
}
