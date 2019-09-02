/**
 * Write an interactive program to print a string entrered in a pyramid form. For instance, the string
“stream” has to be displayed as follows
                                  s
                                 s t
                                s t r
                               s t r e
                              s t r e a
                             s t r e a m       
 */


public class p9 {
    public static void main(String args[]) {
        String str = "stream";
        int len = str.length();
        for(int i = 0; i < len; i++) {
            int space = len - i;
            for(int j = 0; j < space; j++)
                System.out.print(" ");
            for(int k = 0; k <= i; k++) 
                System.out.print(str.charAt(k) + " ");
            System.out.println("");
        }
    }
}