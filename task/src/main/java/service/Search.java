package service;


import dao.Shop;
import entity.SportEquipment;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

public class Search implements Serializable {

    RentUnit rentUnit = new RentUnit();

    public void find(SportEquipment sportEquipment) throws IOException {

        Shop shop = new Shop();


        for (int i = 0; i < shop.goodsListCreate().size(); i++) {
            if ((match(sportEquipment, shop.goodsListCreate().get(i))) == true) {
                rentUnit.addUnitInUnits(shop.goodsListCreate().get(i));
                reduceGoodsQuantity(shop.goodsListCreate().get(i));
            }
        }

    }

    public SportEquipment reduceGoodsQuantity(SportEquipment sportEquipment){
        int quantity = sportEquipment.getQuantity()-1;
        sportEquipment.setQuantity(quantity);
        return sportEquipment;
    }


    private boolean match(SportEquipment object1, SportEquipment object2) throws FileNotFoundException {


        if (object1.getPrice() != 0 && object1.getPrice() != object2.getPrice()) {
            return false;
        }
        if (!object1.getTitle().equals(" ") && !object1.getTitle().equals(object2.getTitle())) {
            return false;
        }
        return true;
    }
}




