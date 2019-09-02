/**
 * Write a program to count the number of words that start with capital letters.
 */

import java.util.Scanner;

public class p6 {
    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = s1.nextLine();
        String words[] = str.split(" ");
        int capitalLetters = 0;
        for(int i = 0; i < words.length; i++) {
            if(Character.isUpperCase(words[i].charAt(0)))
                capitalLetters++;
        }
        System.out.println(str + " : " + capitalLetters);
    }
}