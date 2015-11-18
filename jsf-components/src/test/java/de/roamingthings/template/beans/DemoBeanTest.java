package de.roamingthings.template.beans;

import org.junit.Test;

import static groovy.util.GroovyTestCase.assertEquals;

/**
 * Unit tests for the demo bean
 */
public class DemoBeanTest {

    @Test
    public void testGetWorld() throws Exception {
        DemoBean sut = new DemoBean();

        assertEquals("World", sut.getWorld());
    }
}