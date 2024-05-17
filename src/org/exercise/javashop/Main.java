package org.exercise.javashop;

public class Main {
    public static void main(String[] args) {
        // Creating new products
        Product firstProduct = new Product("Banana","Yellow tropical fruit", 9.99, 22.0);
        Product secondProduct = new Product("Meet", "Pork Meet", 7.99, 22.0);

        // Testing class Product get methods firstProduct
        System.out.println("Product Code: " + firstProduct.getCode());
        System.out.println("Name: " + firstProduct.getName());
        System.out.println("Coded name: " + firstProduct.getExtendedName());
        System.out.println("Description: " + firstProduct.getDescription());
        System.out.printf("Price: %.2f€\n", firstProduct.getPrice());
        System.out.println("VAT: " + firstProduct.getVat());
        System.out.printf("Price/VAT: %.2f€\n", firstProduct.getVatPrice());

        // Divider
        System.out.println("******************************");

        // Testing class Product get methods secondProduct
        System.out.println("Product Code: " + secondProduct.getCode());
        System.out.println("Name: " + secondProduct.getName());
        System.out.println("Coded name: " + secondProduct.getExtendedName());
        System.out.println("Description: " + secondProduct.getDescription());
        System.out.printf("Price: %.2f€\n", secondProduct.getPrice());
        System.out.println("VAT: " + secondProduct.getVat());
        System.out.printf("Price/VAT: %.2f€\n", secondProduct.getVatPrice());

        // Divider
        System.out.println("******************************");


        // Testing class Produt set methods secondProduct
        secondProduct.setName("Orange");
        secondProduct.setDescription("Orange fruit originating from Asia");
        secondProduct.setPrice(5.505);

        // Testing class Produt set methods secondProduct after new set
        System.out.println("Product Code: " + secondProduct.getCode());
        System.out.println("Name: " + secondProduct.getName());
        System.out.println("Coded name: " + secondProduct.getExtendedName());
        System.out.println("Description: " + secondProduct.getDescription());
        System.out.printf("Price: %.2f€\n", secondProduct.getPrice());
        System.out.println("VAT: " + secondProduct.getVat());
        System.out.printf("Price/VAT: %.2f€\n", secondProduct.getVatPrice());


    }
}
