package week2writinghw;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Program7_TempConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temprature in fahrenheit : ");
        float temp = scanner.nextFloat();

        //object creation
        Program7_TempConversion obj = new Program7_TempConversion();
        obj.convertToDegreeCelsius(temp);
        scanner.close();
    }

    //Temprature conversion method
    public void convertToDegreeCelsius(float temp) {
        float c = (temp - 32 * 5 / 9);
        System.out.println("The temprature:" + temp + "  Fahrenheit is equal to " + c + "  degree celcius");
    }
}

