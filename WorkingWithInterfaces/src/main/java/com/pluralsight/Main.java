package com.pluralsight;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Dana", "Wyatt", 63));
        people.add(new Person("Zachary", "Westly", 31));
        people.add(new Person("Elisha", "Aslan", 14));
        people.add(new Person("Ian", "Auston", 16));
        people.add(new Person("Zephaniah", "Hughes", 9));
        people.add(new Person("Ezra", "Aiden", 17));

        Collections.sort(people);

        System.out.println("Sorted people:");
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
