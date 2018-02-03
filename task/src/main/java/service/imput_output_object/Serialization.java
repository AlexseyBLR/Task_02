package service.imput_output_object;

import service.RentUnit;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

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
