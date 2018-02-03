package dao.command;

import entity.Bike;
import entity.SportEquipment;

import java.util.Map;

public class CreateBikeCommand implements Command {

    private static final String TITLE = null;
    private static final int QUANTITY = 0;
    private static final int PRICE = 0;


    public SportEquipment execute(Map<String, String> parameter) {

        Bike bike = new Bike();

        bike.setTitle(parameter.get("TITLE"));
        bike.setQuantity(Integer.parseInt(parameter.get("QUANTITY")));
        bike.setPrice(Integer.parseInt(parameter.get("PRICE")));


        return bike;
    }
}
