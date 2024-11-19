package com.mycompany.stringmanipulation;

// Name: Ahmad Lindsey
// Assignment: Programming Assignment 3
// Program Description: This program prompts the user to input two strings, s1 and s2. It displays the lengths of s1 and s2,
// the first character of s2, concatenates s1 and s2, converts s2 to uppercase, checks if s1 and s2 are equal (ignoring case),
// and checks if s1 is a substring of s2.

import java.util.Scanner;

public class StringManipulation {

    public static void main(String[] args) {
        // Prompt the user to enter the first string (s1)
        try ( // Create a scanner object to get input from the user
                Scanner input = new Scanner(System.in)) {
            // Prompt the user to enter the first string (s1)
            System.out.print("Please enter a string (s1): ");
            String s1 = input.nextLine();
            // Prompt the user to enter the second string (s2)
            System.out.print("Please enter another string (s2): ");
            String s2 = input.nextLine();
            // Display the lengths of s1 and s2
            System.out.println("The length of s1 is " + s1.length() + " and the length of s2 is " + s2.length() + ".");
            // Display the first character of s2
            System.out.println("The first character of the second string is " + s2.charAt(0) + ".");
            // Concatenate s1, a space, and s2 and display the result
            System.out.println(s1 + " " + s2);
            // Convert s2 to uppercase and display the result
            String s2UpperCase = s2.toUpperCase();
            System.out.println(s2UpperCase);
            // Check if s1 and s2 are equal (ignoring case) and display the appropriate message
            if (s1.equalsIgnoreCase(s2)) {
                System.out.println("s1 and s2 are equal.");
            } else {
                System.out.println("s1 and s2 are not equal.");
            }   // Check if s1 is a substring of s2 and display the appropriate message
            if (s2.contains(s1)) {
                System.out.println("s1 is a substring of s2.");
            } else {
                System.out.println("s1 is not a substring of s2.");
            }
            // Close the scanner object
        }
    }
}