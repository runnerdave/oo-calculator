package net.runnerdave.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by David A. Jiménez (e67997) on 5/06/2017.
 */
public class SineTest {
    @Test
    public void testOperationBinary() {
        Operation operation = new Sine();
        try {
            operation.operate(3, 2);
        } catch (UnsupportedOperationException uoe) {
            assertTrue(uoe.getClass().equals(UnsupportedOperationException.class));
        }
    }

    @Test
    public void testOperationUnary() {
        Operation operation = new Sine();
        assertEquals(0, operation.operate(0), 0);
    }
}
