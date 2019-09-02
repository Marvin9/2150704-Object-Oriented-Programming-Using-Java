import java.util.Scanner; 

public class p10 {

    public static void printPyramid(int diamondNum, int i) {
        int space = diamondNum - i;
        for(int j = 0; j < space; j++) 
            System.out.print(" ");
        for(int k = 0; k <= i; k++)
            System.out.print("* ");
        System.out.println("");
    }

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter number : ");
        int diamondNum = s1.nextInt();

        for(int i = 0; i < diamondNum; i++) {
            printPyramid(diamondNum, i);
        }

        for(int i = diamondNum - 1; i >= 0; i--) {
            printPyramid(diamondNum, i);
        }
    }
}