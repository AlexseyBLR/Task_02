package dao.command;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

    private Map<String, Command> commandMap = new HashMap<String, Command>();


    public CommandProvider() {
        commandMap.put("Bike", new CreateBikeCommand());
        commandMap.put("Scateboard", new CreateScateboardCommand());
        commandMap.put("Ball", new CreateBallCommand());
        commandMap.put("Skiing", new CreateSkiingCommand());
    }

    public Command getCommand(String goodsName) {
        Command command = commandMap.get(goodsName);
        return command;
    }

}