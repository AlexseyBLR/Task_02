package service.i_o_db;

import entity.SportEquipment;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Deserelezation {

    public void readFile() throws IOException, ClassNotFoundException {



        FileInputStream fis = new FileInputStream("temp.out");
        ObjectInputStream oin = new ObjectInputStream(fis);
        List<SportEquipment> string  = (List<SportEquipment>) oin.readObject();
        System.out.println(string);

    }

}
