package javaweek2hm;

import java.util.Scanner;

/**
        * Write a program to convert the upper case to lower case.
        */
public class ConvertUpperToLower {
    public static void main(String[] args) {

//Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the upper case string");
        String uppercase = scanner.nextLine();
        ConvertUpperToLower obj = new ConvertUpperToLower();
        // closing the scanner object
    }
    //Conversion of Uppercase to Lower case method
    public void convertToUpperToLower(String text){
        System.out.println(" The lower case value is:=" +text.toLowerCase());

    }

}


