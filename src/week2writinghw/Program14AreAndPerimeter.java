package week2writinghw;

import java.util.Scanner;

/*
 *Write a Java program to print the area and perimeter of a rectangle.
 *Test Data:
 *Width = 5.5 Height = 8.5
 *Expected Output:
 *Area is 5.6 * 8.5 = 47.60
 *Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Program14AreAndPerimeter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the rectangle :");
        int width = scanner.nextInt();

        System.out.println("Enter the height of the rectangle :");
        int height = scanner.nextInt();

        areAndPerimeterOfRectangle(width, height);

        scanner.close();

    }


    public static void areAndPerimeterOfRectangle(int width, int height) {

        int perimeter = 2 * (height * width);
        int area = (height * width);

        System.out.println("The are of the rectangle is :" + area);
        System.out.println("The perimeter of the rectangle is :" + perimeter);

    }
}

