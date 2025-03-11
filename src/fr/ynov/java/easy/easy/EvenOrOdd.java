package fr.ynov.java.easy.easy;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number and I'll tell you if it's an even or odd number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close();
    }
}
