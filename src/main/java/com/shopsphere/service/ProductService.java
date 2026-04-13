package com.shopsphere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopsphere.entity.Product;
import com.shopsphere.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Method to get all products for your GET request
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Method to add a new product via POST request
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}