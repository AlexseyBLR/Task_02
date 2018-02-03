package dao.command;

import entity.Ball;
import entity.SportEquipment;

import java.util.Map;

public class CreateBallCommand implements Command {

    private static final String TITLE = null;
    private static final int QUANTITY = 0;
    private static final int PRICE = 0;


    public SportEquipment execute(Map<String, String> parameter) {

        Ball ball = new Ball();

        ball.setTitle(parameter.get("TITLE"));
        ball.setQuantity(Integer.parseInt(parameter.get("QUANTITY")));
        ball.setPrice(Integer.parseInt(parameter.get("PRICE")));


        return ball;
    }
}
