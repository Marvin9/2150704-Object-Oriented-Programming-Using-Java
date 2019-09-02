import java.util.Scanner;

public class p5 {
    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = s1.nextLine();
        int vowel = 0;
        String tmp_str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            switch(tmp_str.charAt(i)) {
                case 'a' : case 'e' : case 'i' : case 'o' : case 'u' :
                vowel++;
                break;
            }
        }
        System.out.println(str + " : ");
        System.out.println("Vowels : " + vowel + "\nConsonents : " + (str.length() - vowel) );
    }
}