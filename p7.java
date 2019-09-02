/**
 * Write a program to find that given number or string is palindrome or not
 */

import java.util.Scanner;

public class p7 {
    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = s1.nextLine();
        StringBuilder sb = new StringBuilder(str);
        if(str.equals(sb.reverse().toString()))
            System.out.println("String is Palindrome.");
        else 
            System.out.println("String is not palindrome");
    }
}