package group4720.ognev.task1;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> productsBasket;


    public Basket() {
        this.productsBasket = new ArrayList<>();
    }


    public ArrayList<Product> getProductsBasket() {
        return productsBasket;
    }

    public void addProduct(Category category, Product product) {
        productsBasket.add(product);
        category.removeProduct(product);
    }

    public void printProductsBasket() {
        System.out.println("Список купленных товаров:");
        for (Product product : productsBasket) {
            System.out.println(" - " + product.toString());
        }
    }

}

