package javaweek2hm;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class TempConversion {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the temperature in fahrenheit:");
        float temp = scanner.nextFloat();
        // Object creation
        TempConversion obj = new TempConversion();
        obj.convertTampToDegreeCelsius(temp);

        //Temperature conversion method
    }
    public void convertTampToDegreeCelsius(float temp){
        float c = ((temp - 32) * 5 / 9);
        System.out.println("The temperature " + temp + " fahrenheit is equal to " + c + " degree celsius");
    }
}