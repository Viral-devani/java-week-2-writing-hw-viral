package week2writinghw;
/* Write a Java program to display the following pattern.
Sample Pattern :
J a v v a
J a a v v a a
J J aaaaa V V aaaaa
J J a a V a a
 */

public class Program11JavaPattern {
    public static void main(String[] args) {
        Program11JavaPattern p11 =new Program11JavaPattern();
        System.out.println("--------------------------------------");
        p11.javaPattern();
    }
    public void javaPattern(){
        System.out.println("J   a v  v a");
        System.out.println("J a a   v  v a a");
        System.out.println("J J aaaaa V V aaaaa");
        System.out.println("J J a   a V a   a");
    }

}
