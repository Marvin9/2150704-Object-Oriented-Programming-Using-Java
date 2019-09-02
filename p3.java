import java.util.Scanner;

public class p3 {
    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two numbers : ");
        a = s1.nextInt();
        b = s1.nextInt();
        System.out.println("Addition : " + (a+b));
        System.out.println("Subtraction : " + (a-b));
        System.out.println("Multiplication : " + (a*b));
        System.out.println("Division : " + (a/(b*1.0)));
        System.out.println("Modulo : " + (a%b));
    }
}