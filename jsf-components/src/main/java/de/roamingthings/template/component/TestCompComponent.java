package de.roamingthings.template.component;

import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;

/**
 * Backing bean for the {@code testComp} composite component.
 */
@FacesComponent(value = "de.roamingthings.template.testComp")
public class TestCompComponent extends UINamingContainer {
    public String getHelloPrefix() {
        return "Hello";
    }
}
