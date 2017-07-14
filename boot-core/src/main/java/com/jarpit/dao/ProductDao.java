package com.jarpit.dao;

import com.jarpit.entities.Product;

/**
 * @author Arpit
 */
public interface ProductDao {

    Product create(Product product);

    Product findById(Long id);

    Product update(Long id, String name);
}
