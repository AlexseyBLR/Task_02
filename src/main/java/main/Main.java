package main;


import entity.SportEquipment;
import entity.criteria.Criteria;
import entity.criteria.SearchCriteria;
import service.ServiceFactory;
import service.SportEquipmentService;
import java.io.FileNotFoundException;

import static entity.criteria.SearchCriteria.Bike;
import static entity.criteria.SearchCriteria.Scateboard;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        SportEquipment appliance;

        ServiceFactory factory = ServiceFactory.getInstance();
        SportEquipmentService service = factory.getApplianceService();


        Criteria<Bike> criteriaBike = new Criteria<>();
        criteriaBike.add(Bike.QUANTITY, 3);
        criteriaBike.add(Bike.PRICE, 20);
        criteriaBike.add(Bike.TITLE, "walking");

        appliance = service.find(criteriaBike);

        PrintApplianceInfo.print(appliance);





        Criteria<Scateboard> criteriaScateboard = new Criteria<>();
        criteriaScateboard.add(Scateboard.PRICE, 10);
        criteriaScateboard.add(Scateboard.TITLE, "long");

        appliance = service.find(criteriaScateboard);

        PrintApplianceInfo.print(appliance);
    }
}
