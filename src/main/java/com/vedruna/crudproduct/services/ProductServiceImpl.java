package com.vedruna.crudproduct.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.crudproduct.persistance.models.Product;
import com.vedruna.crudproduct.persistance.repository.ProductRepositoryI;

@Service
public class ProductServiceImpl implements ProductServiceI {

    @Autowired
    ProductRepositoryI productRepo;

    @Override
    public List<Product> showAllProdcuts() {
        return productRepo.findAll();
    }

    @Override
    public void insertProduct(Product product) {
       productRepo.save(product);
    }

    @Override
    public void updateProduct(int id, Product product) {
        product.setProductId((id));
        productRepo.save(product);
    }

    @Override
    public void deleteProduct(int id) {
       productRepo.deleteById(id);
    }

    @Override
    public Product showProductByName(String productName) {
        return productRepo.findByProductName(productName);
    }
    
}
