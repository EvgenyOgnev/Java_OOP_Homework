package group4720.ognev.task1;

import java.util.ArrayList;

public class Category {
    private String nameCategory;
    private ArrayList<Product> productsCategory;


    public Category(String nameCategory) {
        this.nameCategory = nameCategory;
        this.productsCategory = new ArrayList<>();
    }


    public String getNameCategory() {
        return nameCategory;
    }


    public ArrayList<Product> getProductsCategory() {
        return productsCategory;
    }


    public void addProduct(Product product) {
        productsCategory.add(product);
    }

    public void removeProduct(Product product) {
        productsCategory.remove(product);
    }

    public void printCategory() {
        System.out.println(nameCategory + ":");
        for (Product product : productsCategory) {
            System.out.println(" - " + product.toString());
        }
    }
}
