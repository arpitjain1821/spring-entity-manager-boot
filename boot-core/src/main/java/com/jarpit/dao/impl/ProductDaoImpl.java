package com.jarpit.dao.impl;

import com.jarpit.dao.ProductDao;
import com.jarpit.entities.Product;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

/**
 * @author Arpit
 */
@Component
public class ProductDaoImpl implements ProductDao {

    @PersistenceContext(type = PersistenceContextType.EXTENDED)
    private EntityManager entityManager;

    public Product create(Product product) {
        product.setId(null);
        entityManager.persist(product);
        return product;
    }

    public Product findById(Long id) {
        return entityManager.find(Product.class, id);
    }

    @Transactional
    public Product update(Product product, String updatedBrandName) {

        product.setBrand(updatedBrandName);
        entityManager.persist(product);
        return product;
    }

    public Product update(Long id, String updatedBrandName) {
        return this.update(this.findById(id), updatedBrandName);
    }


}
