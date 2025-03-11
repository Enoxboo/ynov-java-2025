package fr.ynov.java.medium;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        System.out.println("Enter a number and I'll tell you the square of it");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = square(n);
        System.out.println(result);
        sc.close();
    }

    public static int square(int num) {
        num *= num;
        return num;
    }
}
