package dao.impl.command;

import dao.impl.txtSourceImpl.BikeTxtDaoImpl;
import dao.impl.txtSourceImpl.ScateboardTxtDaoImpl;
import entity.SportEquipment;
import entity.criteria.Criteria;

public class ScateboardDaoCommand implements Command {
    private Criteria criteria;

    public ScateboardDaoCommand(Criteria criteria) {
        this.criteria = criteria;
    }

    @Override
    public SportEquipment execute() {
        return new ScateboardTxtDaoImpl().find(criteria);
    }
}
