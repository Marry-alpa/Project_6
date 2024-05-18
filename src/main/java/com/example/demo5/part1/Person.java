package com.example.demo5.part1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.birthYear, other.birthYear);
    }

    @Override
    public String toString() {
        return "Person name='" + name + "', birthYear=" + birthYear;
    }

    public static void main(String[] args) {
        // Create several Person objects
        Person person1 = new Person("Alice", 1985);
        Person person2 = new Person("Bob", 1990);
        Person person3 = new Person("Charlie", 1985);

        // Demonstrate comparison
        System.out.println("Comparing person1 and person2: " + person1.compareTo(person2)); // should be < 0
        System.out.println("Comparing person2 and person1: " + person2.compareTo(person1)); // should be > 0
        System.out.println("Comparing person1 and person3: " + person1.compareTo(person3)); // should be 0

        // Sorting demonstration
        List<Person> people = new ArrayList<>(Arrays.asList(person1, person2, person3));
        Collections.sort(people);
        System.out.println("Sorted list of people by birth year:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
