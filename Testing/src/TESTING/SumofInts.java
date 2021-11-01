package TESTING;
import java.util.Scanner;
public class SumofInts {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input i: ");
        int i = scan.nextInt();
        int j = 0;
        int S = 0;
        if (i >= 0) {
            while (i >= j) {
                if (j % 2 == 0) {
                    S = S + j;
                }
                j++;
            }
        }
        else {
            while (i <= j) {
                if (j % 2 == 0) {
                    S = S + j;
                }
                j--;
            }
        }
        System.out.println("S: " + S);
        /*
        int j = 0;
        int S = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input i: ");
        int i = scan.nextInt();
        
        if (i > 0) {
            while (j <= i) {
                S = S + j;
                j++;
            }
            System.out.println("S: " + S);
        }
        else {
            System.out.println(0);
        }*/

    }

}
