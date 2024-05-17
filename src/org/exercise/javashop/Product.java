package org.exercise.javashop;
// Import java util random
import java.util.Random;

public class Product {
    // Atributes
    private int productCode;
    private String name;
    private String description;
    private double price;
    private double vat;

    // Builder
    public Product(String name, int productCode, String description, double price, double vat) {
        // Assignment of the random object to create the product code as randomized number
        this.productCode = new Random().nextInt(1000000);
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }

    // Getter and Setter methods
    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }

    public double getVat(){
        return vat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }


}
