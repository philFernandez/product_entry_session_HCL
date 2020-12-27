package com.hcl.session.pojo;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private static int count = 0;
    private final int id;
    private String name;
    private double price;
    private int quantity;
    final private static List<Product> products = new ArrayList<>();

    public Product() {
        count ++;
        id = count;
        products.add(this);
    }

    public Product(String name, double price, int quantity) {
        count ++;
        id = count;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        products.add(this);
    }

    public String getFormattedPrice() {
        return "$" + String.format("%.2f", price);
    }

    public static List<Product> getProducts() {
        return products;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price
                + ", quantity=" + quantity + "]";
    }
    
}
