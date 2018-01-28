package main;

import entity.SportEquipment;
import entity.criteria.Criteria;
import service.ServiceFactory;
import service.SportEquipmentService;
import java.io.FileNotFoundException;

import static entity.criteria.SearchCriteria.Bike;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        SportEquipment appliance;

        ServiceFactory factory = ServiceFactory.getInstance();
        SportEquipmentService service = factory.getApplianceService();


        Criteria<Bike> criteriaBike = new Criteria<>();
        criteriaBike.add(Bike.PRICE, 10);

        appliance = service.find(criteriaBike);

        PrintApplianceInfo.print(appliance);
    }
}
