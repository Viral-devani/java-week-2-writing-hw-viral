package week2writinghw;
/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program4 {
    String name ="Viral";
    String surname="Devani";

    static boolean a =true;
    static boolean b = false;
    public void instanceMethod(){
        System.out.println(name);
        System.out.println(surname);
        Program4 program4 =new Program4();
        System.out.println(program4.a);
        System.out.println(program4.b);

    }public static void staticMethod(){
        Program4 program4= new Program4();
        System.out.println(program4.name);
        System.out.println(program4.surname);
        System.out.println(a);
        System.out.println(b);
        }

    public static void main(String[] args) {
        Program4 program4=new Program4();//call istance method via object
        program4.instanceMethod();
        staticMethod();//calll static to staic direct
    }

    }






