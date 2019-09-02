/*
Write a program to convert rupees to dollar. 60 rupees=1 dollar
*/

import java.util.Scanner;

public class p1 {
    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        int rupee;
        System.out.println("Enter Rs : ");
        rupee = s1.nextInt();
        System.out.println(rupee + " Rs. = " + (rupee/60.0) + " $");
    }
}