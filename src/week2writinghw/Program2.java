package week2writinghw;
/**
 * Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class Program2 {
    static int a =10;//static variable
    static int b=20;

    public static void staticMethod(){
        System.out.println(a);//call static variable
        System.out.println(b);
    }

    public static void main(String[] args) {
        staticMethod();//call static method in main method
    }






}

