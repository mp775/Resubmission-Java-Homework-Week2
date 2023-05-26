package javaweek2hm;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication and division
 * methods all with parameters and use string concatenation methods.
 * (Note: Two static and Two instance methods.)
 */

public class Calculator {
    //static methods
    public static void addition( int a, int b){
      int result = a+b;
    }
    public static void subtraction( int a ,int b){
        int result = a-b;
    }
    //instance methods
    public void multiplication( int a, int b) {
        int result = a * b;
        System.out.println(" the multiplication of" + a + "and" + b + "is:" + result);
    }
    public int division( int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter first number : ");
        int a = scanner.nextInt();
        System.out.println("Please enter second number :");
        int b = scanner.nextInt();

        Calculator calculator= new Calculator();
        calculator.division(a,b);
        calculator.multiplication(a,b);


            }
        }



