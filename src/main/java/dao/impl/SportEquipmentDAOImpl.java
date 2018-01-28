package dao.impl;

import dao.SportEquipmentDAO;
import dao.impl.command.DaoDirector;
import entity.SportEquipment;
import entity.criteria.Criteria;


public class SportEquipmentDAOImpl implements SportEquipmentDAO {

    @Override
    public <E> SportEquipment find(Criteria<E> criteria) {

        String sportEquipmentType = criteria.getApplianceType();

        DaoDirector daoDirector = new DaoDirector(criteria);

        return daoDirector.find(sportEquipmentType);
    }

}




