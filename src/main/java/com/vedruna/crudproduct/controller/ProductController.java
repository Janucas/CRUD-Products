package com.vedruna.crudproduct.controller;

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

import com.vedruna.crudproduct.persistance.models.Product;
import com.vedruna.crudproduct.services.ProductServiceI;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    ProductServiceI productService;


    @GetMapping
    public List<Product> getAllProducts() {
        return productService.showAllProdcuts();
    }

    @GetMapping("/name/{product}")
    public Product showUserByName(@PathVariable String product){
        return productService.showProductByName(product);
    }
    //Añadir un producto
    @PostMapping("/insert")
    public void postProduct(@RequestBody Product product){
         productService.insertProduct(product);
    }

    // Editar un producto
	@PutMapping("/edit/{id}")
	public void editProduct(@PathVariable int id, @RequestBody Product product) {
		productService.updateProduct(id, product);
	}
	
	// Eliminar un producto
	@DeleteMapping("/delete/{id}")
	public void deleteProduct(@PathVariable int id) {
		productService.deleteProduct(id);
	}


    
}
