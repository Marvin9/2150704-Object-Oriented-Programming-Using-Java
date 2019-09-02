import java.util.Scanner;

public class p8 {
    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        String str;
        int a, e, i, o, u;
        while(true) {
            a = 0;
            e = 0;
            i = 0;
            o = 0;
            u = 0;
            System.out.println("Enter string or type quit : ");
            str = s1.nextLine();
            if(str.toLowerCase().equals("quit"))
                break;
            for(int i_ = 0; i_ < str.length(); i_++)
            {
                switch(str.toLowerCase().charAt(i_)) {
                    case 'a' : a++; break;
                    case 'e' : e++; break;
                    case 'i' : i++; break;
                    case 'o' : o++; break;
                    case 'u' : u++; break;
                }
            }
            System.out.println("a : " + a + "\ne : " + e + "\ni : " + i + "\no : " +  o + "\nu : " + u);
        }
    }
}