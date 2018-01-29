package dao.impl.txtSourceImpl;

import dao.impl.AbstractAppliencTxtDAO;
import entity.Scateboard;
import entity.criteria.SearchCriteria;

import java.util.Map;

public class ScateboardTxtDaoImpl extends AbstractAppliencTxtDAO {
    @Override
    protected String getTypeName() {
        return "Scateboard";
    }


    @Override
    protected Scateboard buildAppliance(Map<String, String> appliancMap) {

        Scateboard scateboard = new Scateboard();

        scateboard.setPrice(Integer.parseInt(appliancMap.get(SearchCriteria.Scateboard.PRICE.name())));

        scateboard.setTitle(appliancMap.get(SearchCriteria.Scateboard.TITLE.name()));

        scateboard.setQuantity(Integer.parseInt(appliancMap.get(SearchCriteria.Scateboard.QUANTITY.name())));


        return scateboard;
    }
}
