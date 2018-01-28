package service.validation;

import entity.criteria.Criteria;
import service.validation.command.Command;
import service.validation.command.ValidateDirector;

import java.util.HashMap;
import java.util.Map;


public class Validator {

    private Map<String, Command> commandMap = new HashMap<String, Command>();

    public static <E> boolean criteriaValidator(Criteria<E> criteria) {

        if (criteria.getCriteria().size() == 0) {
            return false;
        }

        Map<Object, Object> criterians = (Map<Object, Object>) criteria.getCriteria();

        String applianceType = criteria.getApplianceType();

        ValidateDirector commandDirector = new ValidateDirector(criterians);

        return commandDirector.validate(applianceType);
    }
}

