package dao.command;

import entity.SportEquipment;

import java.util.Map;

public interface Command {

    SportEquipment execute(Map<String, String> parameter);

}
