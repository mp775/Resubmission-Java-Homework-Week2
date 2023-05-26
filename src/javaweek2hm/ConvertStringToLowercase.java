package javaweek2hm;

import java.util.Scanner;

/**
         * Write a Java program to convert a given string into lowercase.
         * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
         * Output: the quick brown fox jumps over the lazy dog.
         */
public class ConvertStringToLowercase {



        public static void main(String[] args) {
            //Scanner declaration for reading input form console
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the uppercase sentence: ");
            String uppercase = scanner.nextLine();
            ConvertStringToLowercase t = new ConvertStringToLowercase();
            t.conStringToLower(uppercase);
            //Closing the scanner object
            scanner.close();

        }

        // Convert string the to lower case
        public void conStringToLower(String str) {
            System.out.println("The Lowercase of the string is = " + str.toLowerCase());
        }
    }


