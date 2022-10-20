package week2writinghw;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class Program19ConvertStringToLower {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the uppercase sentence :");
        String uppercase =scanner.nextLine();
        Program19ConvertStringToLower p19 =new Program19ConvertStringToLower();
        p19.converStringToLowercase(uppercase);
        scanner.close();


    }public void converStringToLowercase(String lower){
        System.out.println("The lower case of the string is :"+lower.toLowerCase());;
    }
}
