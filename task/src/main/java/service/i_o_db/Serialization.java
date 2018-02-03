package service.i_o_db;

import entity.SportEquipment;
import service.RentUnit;
import service.Search;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serialization {
    public void writeFile() throws IOException {


        RentUnit rentUnit = new RentUnit();
        FileOutputStream fos = new FileOutputStream("temp.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(rentUnit.units);
        oos.flush();
        oos.close();
    }
}
