package week2writinghw;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */
public class Program6_AreaOfCircle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Radius : ");
        double radius = scanner.nextDouble();
        areOfCircle(radius);
        scanner.close();
    }

    public static void areOfCircle(double radius) {
        double pi = Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The are of circle is : " + area);


    }

}
