package service;

import entity.SportEquipment;
import service.imput_output_object.Serialization;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RentUnit {

    public static final int MAX_UNIT_LIST_SIZE = 3;


    public List<SportEquipment> units = new ArrayList<>();


    public void addUnitInUnits(SportEquipment sportEquipment) throws IOException {
        if (units.size() < MAX_UNIT_LIST_SIZE) {
            this.units.add(sportEquipment);
        }
        Serialization serialization = new Serialization();
        serialization.writeFile();
        System.out.println("User goods: "+"\n"+units+"\n");

    }

    public List<SportEquipment> getUnitsList() {
        return units;
    }


}
