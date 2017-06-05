package net.runnerdave.validation;

/**
 * Created by David A. Jiménez (e67997) on 5/06/2017.
 */
public class CalculationData {
    private String operation;
    private String operandAStr;
    private String operandBStr;

    public String getOperation() {
        return operation;
    }

    public String getOperandA() {
        return operandAStr;
    }

    public String getOperandB() {
        return operandBStr;
    }

    public CalculationData(String arg1, String arg2, String arg3) {
        this.operandAStr = arg1;
        this.operation = arg2;
        this.operandBStr = arg3;
    }

    public CalculationData(String arg1, String arg2) {
        this.operation = arg1;
        this.operandAStr = arg2;
        this.operandBStr = "0";
    }
}
