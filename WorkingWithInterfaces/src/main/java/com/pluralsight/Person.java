package com.pluralsight;


public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        int lastCompare = this.lastName.compareTo(other.lastName);
        if (lastCompare != 0) {
            return lastCompare;
        }

        int firstCompare = this.firstName.compareTo(other.firstName);
        if (firstCompare != 0) {
            return firstCompare;
        }

        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + age + ")";
    }
}
