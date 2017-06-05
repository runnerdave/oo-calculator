package net.runnerdave.model;

/**
 * Operation implementation for Sine.
 *
 * Created by David A. Jiménez (e67997) on 5/06/2017.
 */
public class Sine implements Operation {
    @Override
    public double operate(double a, double b) {
        throw new UnsupportedOperationException("operation not supported");
    }

    @Override
    public double operate(double a) {
        return Math.sin(a);
    }
}
