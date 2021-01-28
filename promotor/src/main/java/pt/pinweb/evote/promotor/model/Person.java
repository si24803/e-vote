package pt.pinweb.evote.promotor.model;

import java.util.UUID;

public class Person {
    private String id;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + this.firstName + " " + this.lastName + "]";
    }
}