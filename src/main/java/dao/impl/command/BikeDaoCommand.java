package dao.impl.command;

import dao.impl.txtSourceImpl.BikeTxtDaoImpl;
import entity.SportEquipment;
import entity.criteria.Criteria;

public class BikeDaoCommand implements Command {

    private Criteria criteria;

    public BikeDaoCommand(Criteria criteria) {
        this.criteria = criteria;
    }

    @Override
    public SportEquipment execute() {
        return new BikeTxtDaoImpl().find(criteria);
    }
}

