package model;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String ppsNumber;

    public Person(int id, String firstName, String lastName, String ppsNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ppsNumber = ppsNumber;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getppsNumber() {
        return ppsNumber;
    }

    @Override
    public String toString() {
        return id + "," + firstName + "," + lastName + "," + ppsNumber;
    }
}