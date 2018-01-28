package entity;

import entity.criteria.SearchCriteria;

public class Bike extends SportEquipment {

    private SearchCriteria.Bike BIKE;
    private String walkin;
    private int price;

    public Bike(){}


    public String getBike() {
        return walkin;
    }

    public int getPrice() {
        return price;
    }

    public SearchCriteria.Bike getCategory(){
        return BIKE;
    }

    public void setBIKE(SearchCriteria.Bike BIKE) {
        this.BIKE = BIKE;
    }

    public void setWalkin(String walkin) {
        this.walkin = walkin;
    }

    public void setPrice(int price) {
        this.price = price;
    }




    @Override
    public String toString() {
        return "BIKE : " +
                "price = " + price;

    }
}
