package net.runnerdave.model;

/**
 * Operation implementation for addition.
 *
 * Created by David A. Jiménez (e67997) on 5/06/2017.
 */
public class Add implements Operation {
    @Override
    public double operate(double a, double b) {
        return a + b;
    }

    @Override
    public double operate(double a) {
        return a + a;
    }
}
