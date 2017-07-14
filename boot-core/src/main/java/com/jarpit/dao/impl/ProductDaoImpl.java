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

    // This is being done so that transaction management can be manual. Else, transaction closure
    // in itself can end up doing random updates for you (was happening). Hence maintaining very
    // string transaction boundaries. More details here https://stackoverflow.com/a/32552558/5404805
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
