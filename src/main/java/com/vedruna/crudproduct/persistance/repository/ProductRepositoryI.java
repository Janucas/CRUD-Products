package com.vedruna.crudproduct.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vedruna.crudproduct.persistance.models.Product;

@Repository
public interface ProductRepositoryI extends JpaRepository<Product, Integer> {
    /*crear una api rest que tenga los siguientes endpoints:
    1. Consultar todos los productos
    2. Consultar un producto por nombre
    3. Crear nuevo producto
    4. Actualizar un producto por id
    5. Borrar producto */
Product findByProductName(String productName);
Product findByProductPrice(Double productPrice);
Product findByProductNameAndProductPrice(String productName, Double productPrice );

}
