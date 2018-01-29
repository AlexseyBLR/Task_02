package dao.impl.txtSourceImpl;


import dao.impl.AbstractAppliencTxtDAO;
import entity.Bike;
import entity.Scateboard;
import entity.criteria.SearchCriteria;

import java.util.Map;

public class BikeTxtDaoImpl extends AbstractAppliencTxtDAO {


    @Override
    protected String getTypeName() {
        return "Bike";
    }


    @Override
    protected Bike buildAppliance(Map<String, String> appliancMap) {

        Bike bike = new Bike();

        bike.setPrice(Integer.parseInt(appliancMap.get(SearchCriteria.Bike.PRICE.name())));

        bike.setTitle(appliancMap.get(SearchCriteria.Bike.TITLE.name()));

        bike.setQuantity(Integer.parseInt(appliancMap.get(SearchCriteria.Bike.QUANTITY.name())));


        return bike;
    }
}
