package com.vedruna.crudproduct.services;

import java.util.List;



import com.vedruna.crudproduct.persistance.models.Product;

public interface ProductServiceI {
    List <Product> showAllProdcuts();
    Product showProductByName (String productName);
    void insertProduct (Product product);
    void updateProduct (int id, Product product);
    void deleteProduct (int id);


    
}
