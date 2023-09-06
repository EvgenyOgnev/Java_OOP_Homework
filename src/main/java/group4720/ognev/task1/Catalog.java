package group4720.ognev.task1;

import java.util.ArrayList;

public class Catalog {
    private ArrayList<Category> catalog;


    public Catalog() {
        this.catalog = new ArrayList<>();
    }

    public void addCategory(Category category){
        catalog.add(category);
    }

    public void printCatalog(){
        System.out.println("Каталог товаров:");
        for (Category category : catalog) {
            category.printCategory();
        }
    }


    public ArrayList<Category> getCatalog() {
        return catalog;
    }
}





