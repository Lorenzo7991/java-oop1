package org.exercise.javashop;

public class Product {
    // Atributes
    private int productCode;
    private String name;
    private String description;
    private double price;
    private double vat;

    // Builder
    public Product(String name, int productCode, String description, double price, double vat) {
        this.name = name;
        this.productCode = productCode;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }
}
