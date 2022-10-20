package week2writinghw;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class Program15SwapTheValue {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the first variable value :");
        int first =scanner.nextInt();
        System.out.println("Enter the second variable value :");
        int second = scanner.nextInt();
        scanner.close();
        Program15SwapTheValue t =new Program15SwapTheValue();
        t.swapvalue(first,second);
        scanner.close();



    }
    public void swapvalue(int a,int b){
        int c;
        System.out.println("Before swaping the first variable is  :" +a+ "  and second variable is"+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After swapint the values of first variable is  :"+a+ " and second variable is "+b);
    }
}

