package dao.impl.command;

import entity.SportEquipment;
import entity.criteria.Criteria;

import java.util.HashMap;
import java.util.Map;

public class DaoDirector {


    private Map<String, Command> comands = new HashMap<String, Command>();

    private Criteria criteria;

    public DaoDirector(Criteria criteria) {

        this.criteria = criteria;
        comands.put("Bike", new BikeDaoCommand(criteria));
        comands.put("Scateboard", new ScateboardDaoCommand(criteria));

    }


    public SportEquipment find(String appType) {

        Command command = comands.get(appType);
        return command.execute();
    }
}
