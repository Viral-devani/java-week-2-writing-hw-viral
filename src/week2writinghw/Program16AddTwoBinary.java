package week2writinghw;

import java.util.Scanner;

/*Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
*/
public class Program16AddTwoBinary {
    public static void main(String[] args) {
        System.out.println("Welcome to Java program to add two bionary numbers :");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first bionary number :");
        String first = scanner.nextLine();
        System.out.println("Please enter the second bionary number :");
        String second = scanner.nextLine();
        String addition =addTwrBinaryNumbers(first,second);
        System.out.println("The addition of two binary number is :"+addition);
        scanner.close();



    }
    public static String addTwrBinaryNumbers(String first,String second){
        int b1=Integer.parseInt(first,2);
        int b2=Integer.parseInt(second ,2);
        int sum =b1+b2;
        return Integer.toBinaryString(sum);

    }
}
