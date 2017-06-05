package net.runnerdave.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by David A. Jiménez (e67997) on 5/06/2017.
 */
public class DivideTest {
    @Test
    public void testOperationBinary() {
        Operation operation = new Divide();
        assertEquals(1.5, operation.operate(3, 2), 0);
    }

    @Test
    public void testOperationUnary() {
        Operation operation = new Divide();
        assertEquals(1, operation.operate(2), 0);
    }
}
