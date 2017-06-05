package net.runnerdave.validation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David A. Jiménez (e67997) on 5/06/2017.
 */
public class Validator {
    private static List<CalculationRule> calculationRules = new ArrayList<>();

    static {
        calculationRules.add(new OperandValidationRule());
        calculationRules.add(new OperationValidationRule());
    }

    public static void validateRules(CalculationData calculationData) {
        for (CalculationRule rule : calculationRules
                ) {
            rule.validate(calculationData);
        }
    }
}
