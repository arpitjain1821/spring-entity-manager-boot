package com.jarpit;

import com.jarpit.dao.ProductDao;
import com.jarpit.entities.Product;
import com.jarpit.gaia.ProductMother;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Arpit
 */

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private ProductDao dao;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    public void run(String... strings) throws Exception {

        // To be called once, for creation of a row in the DB
//        createProduct();

//        persistTransientBeanWithId();
//        persistTransientBeanWithoutId();
        persistPersistentBean();

    }

    private void persistTransientBeanWithId() {

        // Get a non managed (Transient) product object - Having id set
        Product transientProductWithId = ProductMother.getBasicProduct();
        dao.update(transientProductWithId, "New Brand Name");
    }

    private void persistTransientBeanWithoutId() {

        // Get a non managed (Transient) product object - And reset ID to null
        // This will result in creation of product
        Product transientProductWithoutId = ProductMother.getBasicProduct();
        transientProductWithoutId.setId(null);
        dao.update(transientProductWithoutId, "New Brand Name");
    }

    private void persistPersistentBean() {
        // Will internally get a managed (Persistent) product object
        // This will have NO AFFECT on the object at all
        dao.update(1l, "New Brand Name");
    }

    private void createProduct() {
        Product product = ProductMother.getBasicProduct();
        dao.create(product);
        System.out.println("Product created successfully");
    }
}
