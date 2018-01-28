package dao.impl.txtSourseImpl22;


import dao.impl.AbstractAppliencTxtDAO;
import entity.Bike;
import entity.criteria.SearchCriteria;

import java.util.Map;

public class BikeTxtDaoImpl extends AbstractAppliencTxtDAO {


    @Override
    protected String getTypeName() {
        return "Laptop";
    }


    @Override
    protected Bike buildAppliance(Map<String, String> appliancMap) {

        Bike bike = new Bike();

        bike.setPrice(Integer.parseInt(appliancMap.get(SearchCriteria.Bike.PRICE.name())));

        bike.setWalkin(appliancMap.get(SearchCriteria.Bike.TITLE.name()));


        return bike;
    }
}


