package service;

import entity.SportEquipment;

import java.io.FileNotFoundException;

public class RequestObject {

    public SportEquipment requestObj() throws FileNotFoundException {

        ////////Создаются объект запроса
        SportEquipment sportEquipment = new SportEquipment();
        sportEquipment.setTitle("Stels");
        sportEquipment.setPrice(10);
        ///////

        return sportEquipment;

    }

}
