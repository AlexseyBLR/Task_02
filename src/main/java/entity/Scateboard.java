package entity;

import entity.criteria.SearchCriteria;

public class Scateboard extends SportEquipment{

    private SearchCriteria.Scateboard SCATEBOARD;
    private String title;
    private int price;
    private int quantity;

    public Scateboard() {
    }




    @Override
    public String toString() {
        return "Scateboard : " +
                "title=" + title +
                ", " +
                "quantity=" + quantity +
                ", " +
                "price=" + price +
                ";";

    }


    public SearchCriteria.Scateboard getSCATEBOARD() {
        return SCATEBOARD;
    }

    public void setSCATEBOARD(SearchCriteria.Scateboard SCATEBOARD) {
        this.SCATEBOARD = SCATEBOARD;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
