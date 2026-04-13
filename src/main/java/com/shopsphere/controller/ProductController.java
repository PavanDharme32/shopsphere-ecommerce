package com.shopsphere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopsphere.entity.Product;
import com.shopsphere.repository.ProductRepository;
import com.shopsphere.service.ProductService;

@RestController
@RequestMapping("/api/products") // This must match the Postman URL
public class ProductController {

    private final ProductRepository productRepository;
	@Autowired

    private ProductService productService;

	ProductController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	@PostMapping  // these handles the "Post " Request in postman
	public List<Product> add(@RequestBody Product product){
		productService.addProduct(product);
		return null;
	}
    @GetMapping // This handles the "GET" method you used in Postman
    public List<Product> getAll() {
        return productService.getAllProducts();
    }

    @DeleteMapping("/delete/{id}") // This handles the "DELETE" method you used in Postman
    public String deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
        return "Product deleted successfully";
    }

    @PutMapping("/update/{id}") // This handles the "Update" method you used in Postman
    public Product updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        Product product = productRepository.findById(id).orElseThrow();
        product.setName(productDetails.getName());
        product.setPrice(productDetails.getPrice());
        return productRepository.save(product);
    }
}