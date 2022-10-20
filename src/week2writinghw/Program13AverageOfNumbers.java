package week2writinghw;

import java.util.Scanner;

/*
 *Write a Java program that takes three numbers as input to calculate and
 *print the average of the numbers.
 */
public class Program13AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number :");
        double x =scanner.nextInt();
        System.out.println("Enter the Second number : ");
        double y = scanner.nextInt();
        System.out.println("Enter the third number :");
        double z =scanner.nextInt();
        averageOfNumbers(x,y,z);
        scanner.close();
    }

    public static void averageOfNumbers(double a, double b,double c){
        double average =(a+b+c)/3;
        System.out.println("The average of " +a+ "," +b+ "and" +c+ "is: " +average );
    }
}
