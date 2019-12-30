package org.aaron.demo14;

@FunctionalInterface
public interface PersonBuilder {

    Person build(String name, int age);

}
