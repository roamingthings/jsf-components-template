# JSF Components Project Template with Gradle Support

This is a template project consisting of two sub-projects:

* JSF-component-project that assembles a `jar` library that can be used in other JSF projects
* A JavaEE 7 webapp project to demonstrate the usage of the component library

The project uses [Gradle](http://gradle.org) as build tool and can be used as a template project.

If you're using [IntelliJ](https://www.jetbrains.com/idea) as an IDE it will pick up the project automatically when you first open it.

## JSF component library project

The JSF component library project can be found in the `jsf-components` folder of this project.

It contains a composite component build with a XHTML template and a backing component bean.

There is also a simple [JUnit](http://junit.org) test.
 
 ### Demo web app
 
 The demo web app shows how to use the component library.
 