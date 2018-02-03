package dao;


import dao.command.Command;
import dao.command.CommandProvider;
import entity.SportEquipment;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Shop {



    public List<SportEquipment> goodsListCreate() throws FileNotFoundException {


        Parser parser = new Parser();

        List<SportEquipment> goodsList = new ArrayList<SportEquipment>();

        CommandProvider provider = new CommandProvider();

        parser.fillGoodsMap().forEach((type, value) -> {
            Command command = provider.getCommand(type);
            SportEquipment sportEquipment = command.execute(value);
            goodsList.add(sportEquipment);
        });

        return goodsList;
    }


}
