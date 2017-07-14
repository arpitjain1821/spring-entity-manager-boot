package com.jarpit.dao.impl;

import com.jarpit.dao.ProductDao;
import com.jarpit.entities.Product;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Arpit
 */
@Transactional
@Component
public class ProductDaoImpl implements ProductDao {

    @PersistenceContext
    private EntityManager entityManager;

    public Product create(Product product) {
        return null;
    }

    public Product findById(Long id) {
        return entityManager.find(Product.class, id);
    }

    public Product update(Long id, String name) {
        return null;
    }
}
