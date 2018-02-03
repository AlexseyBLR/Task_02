package dao.command;

import entity.Skiing;
import entity.SportEquipment;

import java.util.Map;

public class CreateSkiingCommand implements Command {

    private static final String TITLE = null;
    private static final int QUANTITY = 0;
    private static final int PRICE = 0;


    public SportEquipment execute(Map<String, String> parameter) {

        Skiing skiing = new Skiing();


        skiing.setTitle(parameter.get("TITLE"));
        skiing.setQuantity(Integer.parseInt(parameter.get("QUANTITY")));
        skiing.setPrice(Integer.parseInt(parameter.get("PRICE")));


        return skiing;
    }
}
