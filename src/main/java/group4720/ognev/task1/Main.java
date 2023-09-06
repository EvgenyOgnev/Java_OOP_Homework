package group4720.ognev.task1;


public class Main {
    public static void main(String[] args) {

        Catalog catalog = new Catalog();

        Product milk = new Product("молоко 1 литр", 72.5, 9);
        Product cheese = new Product("сыр", 272.5, 7);
        Product kefir = new Product("кефир 0.5 литра", 36.8, 11);

        Product tshirt = new Product("Футболка", 856.33, 33);
        Product shirt = new Product("рубашка", 1856.93, 53);
        Product trousers = new Product("брюки", 2877.99, 12);

        Category dairy = new Category("Молочные продукты");
        Category cloth = new Category("Oдежда");


        dairy.addProduct(milk);
        dairy.addProduct(cheese);
        dairy.addProduct(kefir);

        cloth.addProduct(tshirt);
        cloth.addProduct(shirt);
        cloth.addProduct(trousers);



        catalog.addCategory(dairy);
        catalog.addCategory(cloth);

        catalog.printCatalog() ;

        User user1 = new User("USER_1", "password_1");
        User user2 = new User("USER_2", "password_2");

        user1.getBasket().addProduct(dairy, milk);
        user1.getBasket().addProduct(dairy, kefir);

        user2.getBasket().addProduct(cloth, shirt);

        System.out.println();
        System.out.println(user1.getLogin());
        user1.getBasket().printProductsBasket();

        System.out.println();
        System.out.println(user2.getLogin());
        user2.getBasket().printProductsBasket();

        System.out.println();
        catalog.printCatalog() ;



    }
}