package net.runnerdave.view;

import net.runnerdave.controller.Controller;
import net.runnerdave.validation.CalculationData;
import net.runnerdave.validation.Validator;

import java.util.ResourceBundle;

/**
 * Desktop application for Calculator.
 */
public class App {

    private static final ResourceBundle BUNDLE = ResourceBundle.getBundle("bundle");

    public static void main(String[] args) {
        double operandA;
        double operandB;
        String operation;
        double result;
        CalculationData calculationData;
        try {
            if (args.length == 3) {
                calculationData = new CalculationData(args[0], args[1], args[2]);
                Validator.validateRules(calculationData);
                operandA = Double.parseDouble(calculationData.getOperandA());
                operandB = Double.parseDouble(calculationData.getOperandB());
                operation = calculationData.getOperation();
                result = Controller.controllerMap.get(operation).operate(operandA, operandB);
            } else if (args.length == 2) {
                calculationData = new CalculationData(args[0], args[1]);
                Validator.validateRules(calculationData);
                operandA = Double.parseDouble(calculationData.getOperandA());
                operation = calculationData.getOperation();
                result = Controller.controllerMap.get(operation).operate(operandA);
            } else {
                System.out.println(BUNDLE.getString("error.message.invalid.input"));
                return;
            }
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println(result);

    }
}
