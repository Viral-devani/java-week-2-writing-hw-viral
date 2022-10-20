package week2writinghw;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Program9ConverUpperToLowerCase {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppecase string :");
        String uppercase = scanner.nextLine();

        Program9ConverUpperToLowerCase t = new Program9ConverUpperToLowerCase();
        t.convertUppercaseToLowecase(uppercase);
        scanner.close();
    }

    public void convertUppercaseToLowecase(String text) {
        System.out.println("The Lowercase value is =" +text.toLowerCase());
    }
}