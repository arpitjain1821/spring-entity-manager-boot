package com.jarpit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Arpit
 */
@Entity
@Table(name="product_details")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "product")
    private String product;

    @Column(name = "url")
    private String url;

    @Column(name = "price")
    private double price;

    @Column(name = "discounted_price")
    private double discountedPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ProductDetails [id=");
        builder.append(id);
        builder.append(", brand=");
        builder.append(brand);
        builder.append(", product=");
        builder.append(product);
        builder.append(", url=");
        builder.append(url);
        builder.append(", price=");
        builder.append(price);
        builder.append(", discountedPrice=");
        builder.append(discountedPrice);
        builder.append("]");
        return builder.toString();
    }
}
