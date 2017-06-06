package net.runnerdave.validation;

import org.junit.Test;

import java.util.ResourceBundle;

import static org.junit.Assert.assertTrue;

/**
 * Created by David A. Jiménez (e67997) on 5/06/2017.
 */
public class OperationValidationRuleTest {

    private final ResourceBundle BUNDLE = ResourceBundle.getBundle("bundle");

    @Test
    public void testValidate() {
        CalculationRule calculationRule = new OperationValidationRule();
        CalculationData calculationData = new CalculationData("1", "+", "2.3");
        calculationRule.validate(calculationData);

        calculationData = new CalculationData("a", "b", "c");
        try {
            calculationRule.validate(calculationData);
        } catch (Exception e) {
            assertTrue(e.getMessage().equalsIgnoreCase(BUNDLE.getString("error.message.operation.invalid")));
        }

        calculationData = new CalculationData("2.3", "b", "c");
        try {
            calculationRule.validate(calculationData);
        } catch (Exception e) {
            assertTrue(e.getMessage().equalsIgnoreCase(BUNDLE.getString("error.message.operation.invalid")));
        }

        calculationData = new CalculationData("sin", "b");
        calculationRule.validate(calculationData);

        calculationData = new CalculationData("2.3", "b");
        try {
            calculationRule.validate(calculationData);
        } catch (Exception e) {
            assertTrue(e.getMessage().equalsIgnoreCase(BUNDLE.getString("error.message.operation.invalid")));
        }

        calculationData = new CalculationData("1", "/", "2.3");
        calculationRule.validate(calculationData);

        calculationData = new CalculationData("1", "div", "2.3");
        calculationRule.validate(calculationData);

        calculationData = new CalculationData("1", "*", "2.3");
        calculationRule.validate(calculationData);

        calculationData = new CalculationData("1", "x", "2.3");
        calculationRule.validate(calculationData);
    }
}
