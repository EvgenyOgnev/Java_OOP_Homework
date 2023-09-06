package group4720.ognev.task1;

public class Product {
    private String name;
    private double price;
    private int rating;


    public Product(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Наименование товара='" + name + '\'' +
                ", цена=" + price + " руб" +
                ", рейтинг=" + rating;
    }
}
