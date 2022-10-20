package week2writinghw;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Program18PrintOperation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int firstnumber = scanner.nextInt();
        System.out.println("Please enter the second number :");
        int secondnumber = scanner.nextInt();

        Program18PrintOperation p18 = new Program18PrintOperation();
        p18.printTheOperation(firstnumber, secondnumber);

        scanner.close();

    }

    public void printTheOperation(int a, int b) {
        System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
        System.out.println("The difference of " + a + " and " + b + " is " + (a - b));
        System.out.println("The Product of " + a + " and " + b + " is " + (a * b));
        System.out.println("The divison of " + a + " and " + b + " is " + (a / b));
        System.out.println("The reminder of " + a + " and " + b + " is " + (a % b));

    }
}
