package net.runnerdave.validation;

import java.util.ResourceBundle;
import java.util.regex.Pattern;

/**
 * Created by David A. Jiménez (e67997) on 5/06/2017.
 */
public class OperandValidationRule implements CalculationRule {

    private static final ResourceBundle BUNDLE = ResourceBundle.getBundle("bundle");

    private static final String OPERAND_PATTERN = BUNDLE.getString("valid.operands.pattern");

    private final Pattern pattern = Pattern.compile(OPERAND_PATTERN);

    @Override
    public void validate(CalculationData data) {
        if ( !pattern.matcher(data.getOperandA()).matches()) {
            throw new IllegalArgumentException(BUNDLE.getString("error.message.first.operand.invalid"));
        }
        if ( !pattern.matcher(data.getOperandB()).matches()) {
            throw new IllegalArgumentException(BUNDLE.getString("error.message.second.operand.invalid"));
        }
    }
}
