package Herança.Product;

public class Product {

    private String name;
    private Double price;

    public Product() {

    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String toString() {
        StringBuilder priceTag = new StringBuilder();
        priceTag.append(price);
        return priceTag.toString();
    }

}
