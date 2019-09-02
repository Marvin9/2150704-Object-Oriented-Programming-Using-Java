/*
Write a program that calculate percentage marks of the student if marks of 6 subjects are given
*/

import java.util.Scanner;

public class p2 {
    public static void main(String args[]) {
        String[] subjects = {"Java", "Go", "Nodejs", "Python", "C", "C++"};
        Scanner s1 = new Scanner(System.in);
        int marks[] = new int[6], total = 0;
        for(int i = 0; i < subjects.length; i++) {
            System.out.println("Enter marks in " + subjects[i] + " : ");
            marks[i] = s1.nextInt();
            total += marks[i];
        }
        System.out.println("Percentage : " + (total/6.0));
    }
}