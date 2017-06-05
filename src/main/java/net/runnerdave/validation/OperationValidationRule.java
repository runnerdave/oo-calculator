package net.runnerdave.validation;

import java.util.ResourceBundle;
import java.util.regex.Pattern;

/**
 * Created by David A. Jiménez (e67997) on 5/06/2017.
 */
public class OperationValidationRule implements CalculationRule {
    private static final ResourceBundle BUNDLE = ResourceBundle.getBundle("bundle");

    private static final String OPERATION_PATTERN = BUNDLE.getString("valid.operation.pattern");

    private final Pattern pattern = Pattern.compile(OPERATION_PATTERN);

    @Override
    public void validate(CalculationData data) {
        if (!pattern.matcher(data.getOperation()).matches()) {
            throw new IllegalArgumentException(BUNDLE.getString("error.message.operation.invalid"));
        }
    }
}
