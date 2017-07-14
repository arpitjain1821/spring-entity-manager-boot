package com.jarpit;

import com.jarpit.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Arpit
 */

@SpringBootApplication
//@ComponentScan(basePackages = {"com.jarpit"})
public class Application implements CommandLineRunner {

    @Autowired
    private ProductDao dao;

    public static void main(String[] args) {
        // Used to bootstrap and run Spring application from Java main method
        SpringApplication.run(Application.class, args);
    }

    // Provided by CommandLineRunner, will be called just before SpringApplication.run() completes.
    public void run(String... strings) throws Exception {
        System.out.println(dao.findById(1l));
    }
}
