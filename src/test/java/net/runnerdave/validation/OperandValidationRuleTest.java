package net.runnerdave.validation;

import org.junit.Test;

import java.util.ResourceBundle;

import static org.junit.Assert.assertTrue;

/**
 * Created by David A. Jiménez (e67997) on 5/06/2017.
 */
public class OperandValidationRuleTest {

    @Test
    public void testValidate() {
        CalculationRule calculationRule = new OperandValidationRule();
        CalculationData calculationData = new CalculationData("1", "+", "2.3");
        calculationRule.validate(calculationData);

        calculationData = new CalculationData("a", "b", "c");
        try {
            calculationRule.validate(calculationData);
        } catch (Exception e) {
            assertTrue(e.getMessage().equalsIgnoreCase("1st operand is not valid!"));
        }

        calculationData = new CalculationData("2.3", "b", "c");
        try {
            calculationRule.validate(calculationData);
        } catch (Exception e) {
            assertTrue(e.getMessage().equalsIgnoreCase("2nd operand is not valid!"));
        }

        calculationData = new CalculationData("cos", "0.3");
        calculationRule.validate(calculationData);

        calculationData = new CalculationData("2.3", "b");
        try {
            calculationRule.validate(calculationData);
        } catch (Exception e) {
            assertTrue(e.getMessage().equalsIgnoreCase("1st operand is not valid!"));
        }
    }
}
