package fr.ynov.java.easy;

import java.util.Scanner;

public class ScanMe {
    public static void main(String[] args) {
        //Wait for user's input
        Scanner scanner = new Scanner(System.in);
        //First line is name, second is age
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("What's your age?");
        int age = scanner.nextInt();
        scanner.close();
        System.out.println("Your name is " + name + ", and you are " + age + " years old.");
    }
}
