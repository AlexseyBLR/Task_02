package main;

import entity.SportEquipment;
import service.PrintAll;
import service.Search;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

public class Main implements Serializable {


    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Search search = new Search();
        Main main = new Main();
        search.find(main.requestObj());



        /*
        в этом месте должна быть десериализация объектов, которые пользователь взял в прокат
        я не разобрался с этим, поэтому эта часть закомменчена
         */

//        Deserelezation deserelezation = new Deserelezation();
//        deserelezation.readFile();

        PrintAll printAll = new PrintAll();
        printAll.printDB();


    }

    public SportEquipment requestObj() throws FileNotFoundException {

        ////////Создаются объект запроса
        SportEquipment sportEquipment = new SportEquipment();
        sportEquipment.setTitle("Stels");
        sportEquipment.setPrice(10);
        ///////

        return sportEquipment;

    }
}


