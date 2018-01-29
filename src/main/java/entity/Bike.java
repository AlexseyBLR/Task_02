package entity;

import entity.criteria.SearchCriteria;

public class Bike extends SportEquipment {

    private SearchCriteria.Bike BIKE;
    private String title;
    private int price;
    private int quantity;

    public Bike() {
    }


    public String getBike() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public SearchCriteria.Bike getCategory() {
        return BIKE;
    }

    public void setBIKE(SearchCriteria.Bike BIKE) {
        this.BIKE = BIKE;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "BIKE : " +
                "title=" + title +
                ", " +
                "quantity=" + quantity +
                ", " +
                "price=" + price +
                ";";

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
