package com.example.baitap.service;
import com.example.baitap.model.Product;

import java.util.List;

public interface ProductService {

        List<Product>getAllProducts();
        Product getProductById(Long id);
        Product createProduct(Product product);
        Product updateProduct(Long id, Product updatedProduct);
}

