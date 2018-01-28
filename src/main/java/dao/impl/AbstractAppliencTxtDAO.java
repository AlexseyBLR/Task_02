package dao.impl;


import dao.FileParser;
import dao.SportEquipmentDAO;
import dao.impl.Properties.Properties;
import entity.SportEquipment;
import entity.criteria.Criteria;

import java.io.File;
import java.util.Map;

public abstract class AbstractAppliencTxtDAO implements SportEquipmentDAO {

    private static final File file = new File(Properties.path);

    protected abstract String getTypeName();

    protected abstract SportEquipment buildAppliance(Map<String, String> appliancMap);

    @Override
    public  <E> SportEquipment find(Criteria<E> criteria)  {

        FileParser fileParser = new FileParser(file , criteria);

        SportEquipment appliance = null;


        Map<String , String> appMap = null;
        try {
            appMap = fileParser.getApplianceMap(getTypeName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (appMap != null) {
                appliance = buildAppliance(appMap);
            }

        return appliance;

    }










}
