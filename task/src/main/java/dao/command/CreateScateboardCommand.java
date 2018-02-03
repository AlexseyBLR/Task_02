package dao.command;

import entity.Scateboard;
import entity.SportEquipment;

import java.util.Map;

public class CreateScateboardCommand implements Command {

    private static final String TITLE = null;
    private static final int QUANTITY = 0;
    private static final int PRICE = 0;


    public SportEquipment execute(Map<String, String> parameter) {

        Scateboard scateboard = new Scateboard();


        scateboard.setTitle(parameter.get("TITLE"));
        scateboard.setQuantity(Integer.parseInt(parameter.get("QUANTITY")));
        scateboard.setPrice(Integer.parseInt(parameter.get("PRICE")));


        return scateboard;
    }
}