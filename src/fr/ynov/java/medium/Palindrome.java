package fr.ynov.java.medium;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word and I'll tell you if it's a palindrome");
        String word = scanner.nextLine();
        boolean palindrome = palindrome(word);
        if (palindrome) {
            System.out.println("C'est bien un palindrome");
        } else {
            System.out.println("C'est pas un palindrome");
        }
    }

    public static boolean palindrome(String word) {
        word = word.toLowerCase();
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
