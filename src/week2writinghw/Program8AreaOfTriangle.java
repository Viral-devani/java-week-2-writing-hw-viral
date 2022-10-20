package week2writinghw;

import java.util.Scanner;

/**
        * Write a program to calculate the area of a triangle.
        */
public class Program8AreaOfTriangle {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the length of the traingle :");
        int length =scanner.nextInt();

        System.out.println("Please enter the height of the traingle :");
        int height =scanner.nextInt();
        areOfTraingle(length, height);
        scanner.close();

    }
public static void areOfTraingle(int length, int height){
        int area = (length*height)/2;
    System.out.println("The Area of a Triangle is :"+area);
}

}
