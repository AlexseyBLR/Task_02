package main;

import entity.SportEquipment;
import service.PrintAll;
import service.RentUnit;
import service.RequestObject;
import service.Search;
import service.imput_output_object.Deserelezation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

public class Main implements Serializable {


    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Search search = new Search();
        RequestObject requestObject = new RequestObject();




        search.find(requestObject.requestObj()); //поиск товара и добавление в лист арендованных товаров



        Deserelezation deserelezation = new Deserelezation(); //десериализация(вернет [], потому что объектов нет)
        deserelezation.readFile();


        PrintAll printAll = new PrintAll(); //печать всех товаров из магазина
        printAll.printDB();


    }
}


