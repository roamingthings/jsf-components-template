package de.roamingthings.template.beans;

import javax.inject.Named;

/**
 * This bean provides a simple method to test the function of CDI.
 */
@Named
public class DemoBean {
	public String getWorld() {
        return "World";
	}
}