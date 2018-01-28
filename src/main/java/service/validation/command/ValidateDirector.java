package service.validation.command;

import java.util.HashMap;
import java.util.Map;

public class ValidateDirector {

    private Map<String , Command> commandMap = new HashMap<String, Command>();

    public ValidateDirector(Map<Object,Object> criteriaMap) {

        commandMap.put("Bike" , new BikeValidator(criteriaMap));


    }

    public boolean validate(String appType){
        return commandMap.get(appType).execute();
    }

}
