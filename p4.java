/*
    Write a program to find length of string and print second half of the string
*/

import java.util.Scanner;

public class p4 {
    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = s1.nextLine();
        System.out.println("Lenght : " + str.length());
        System.out.println("Second half of string : " + str.substring(str.length()/2));
    }
}