package fr.ynov.java.medium;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Person {

    private enum Nationality {
        FRANCE,
        JAPAN,
        ITALY
    }

    private final String name;
    private final Date birthDate;
    private final String gender;
    private final float height;
    private final float weight;
    private final Nationality nationality;

    Person(String name, Date birthDate, String gender, float height, float weight, Nationality nationality) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Nationality: " + nationality);
    }

    public int getAge() {
        LocalDate birthLocalDate = birthDate.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        return Period.between(birthLocalDate, LocalDate.now()).getYears();
    }

    // Example of a person
    public static void main(String[] args) {
        // Create a date for January 2, 1997
        Date birthDate = new Date(97, 0, 2);
        Person person = new Person("John Doe", birthDate, "Male", 180f, 70f, Nationality.FRANCE);
        person.printDetails();
    }
}