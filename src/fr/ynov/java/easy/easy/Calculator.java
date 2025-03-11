package fr.ynov.java.easy.easy;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide two numbers as command-line arguments.");
            return;
        }

        //Take the parameters in args in usable variables
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = scanner.nextLine();

        double result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }
        System.out.printf("Result: " + result);
        scanner.close();
    }
}