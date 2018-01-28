package service.validation.command;

import entity.criteria.SearchCriteria;

import java.util.ArrayList;
import java.util.Map;

public class BikeValidator implements Command {

    private Map<Object, Object> criteries;

    public BikeValidator(Map<Object, Object> criteries) {
        this.criteries = criteries;
    }

    @Override
    public boolean execute() {
        ArrayList<Object> values = new ArrayList<Object>(criteries.values());

        if (criteries.containsKey(SearchCriteria.Bike.TITLE) == false) {
            return NumberValidator.checkforNumber(criteries.values());

        } else {
            Object os = criteries.get(SearchCriteria.Bike.TITLE);
            if (os instanceof String) {
                values.remove(os);
                return NumberValidator.checkforNumber(values);
            } else {
                return false;
            }
        }

    }
}
