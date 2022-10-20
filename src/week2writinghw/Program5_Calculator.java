package week2writinghw;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication and division
 * methods all with parameters and use string concatenation methods.
 * (Note: Two static and Two instance methods.)
 */
public class Program5_Calculator {

    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println("the addition  of  " + a + " and " + b + " is " + result);

    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    //instance method
    public void multiplication(int a, int b) {
        int reult = a * b;
        System.out.println("The multiplication of  " + a + " and " + b + " is  " + reult);

    }

    public int divison(int a, int b) {//instance method, with return type with parameter
        return a / b;

    }

    public static void main(String[] args) {
        //scanner declaration for reading inpute from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int a = scanner.nextInt();
        System.out.println("Please enter second number :");
        int b = scanner.nextInt();

        addition(a, b);
        int subresult = subtraction(a, b);
        System.out.println("The subtration of " + a + " and  " + b + "is " + subresult);

        Program5_Calculator obj = new Program5_Calculator();
        obj.multiplication(a, b);


        int divresult = obj.divison(a, b);
        System.out.println("The divison of  " + a + " and " + b + " is : " + divresult);
        scanner.close();//closing the scanner


    }


}
