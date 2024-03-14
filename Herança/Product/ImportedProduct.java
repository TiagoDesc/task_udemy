package Herança.Product;

import POO.Product.product;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return super.getPrice() * customsFee;
    }

    @Override
    public String toString() {
        StringBuilder priceTag = new StringBuilder();
        priceTag.priceTag.append(super.getPrice());
        return priceTag.toString();
    }

}
