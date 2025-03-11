package fr.ynov.java.medium;

public class Person {

    enum Nationality {
        FRANCE,
        JAPAN,
        ITALY
    }

    private final String name;
    private final int age;
    private final String gender;
    private final float height;
    private final float weight;
    private final Nationality nationality;

    public Person(String name, int age, String gender, float height, float weight, Nationality nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Nationality: " + nationality);
    }

    //Example of a person
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30, "Male", 180f, 70f, Person.Nationality.FRANCE);
        person.printDetails();
    }
}
