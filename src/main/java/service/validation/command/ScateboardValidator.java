package service.validation.command;

import entity.criteria.SearchCriteria;

import java.util.ArrayList;
import java.util.Map;

public class ScateboardValidator implements Command {

    private Map<Object, Object> criteries;

    public ScateboardValidator(Map<Object, Object> criteries) {
        this.criteries = criteries;
    }

    @Override
    public boolean execute() {
        ArrayList<Object> values = new ArrayList<Object>(criteries.values());

        if (criteries.containsKey(SearchCriteria.Scateboard.TITLE) == false) {
            return NumberValidator.checkforNumber(criteries.values());

        } else {
            Object os = criteries.get(SearchCriteria.Scateboard.TITLE);
            if (os instanceof String) {
                values.remove(os);
                return NumberValidator.checkforNumber(values);
            } else {
                return false;
            }
        }

    }
}
