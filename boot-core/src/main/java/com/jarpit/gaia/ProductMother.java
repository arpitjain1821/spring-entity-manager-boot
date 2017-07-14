package com.jarpit.gaia;

import com.jarpit.entities.Product;

/**
 * @author Arpit
 */
public class ProductMother {

    public static Product getBasicProduct() {
        Product product = new Product();
        product.setId(1l);
        product.setBrand("Nike");
        product.setProduct("Casual Shoes");
        product.setUrl("Img URL");
        product.setPrice(899.00d);
        product.setDiscountedPrice(400.00d);
        return product;
    }
}
