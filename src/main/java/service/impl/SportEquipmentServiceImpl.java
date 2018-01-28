package service.impl;


import dao.SportEquipmentDAO;
import dao.impl.SportEquipmentDAOImpl;
import entity.SportEquipment;
import entity.criteria.Criteria;
import service.SportEquipmentService;

import static service.validation.Validator.criteriaValidator;


public class SportEquipmentServiceImpl implements SportEquipmentService {

    private SportEquipmentDAO sportEquipmentDAO;


    @Override
    public <E> SportEquipment find(Criteria<E> criteria) {
        boolean valid = criteriaValidator(criteria);
        SportEquipment appliance = null;
        if (valid) {
            sportEquipmentDAO = new SportEquipmentDAOImpl();
            appliance = sportEquipmentDAO.find(criteria);
        }
        return appliance;
    }


}

