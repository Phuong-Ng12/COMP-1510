package TESTING;
import java.util.Scanner;
public class wuiz {

    public static void main(String[] args) {
        /*String s1 = "apples";
        String s2 = "oranges";
        System.out.println(s1.compareTo(s2));
        
        int x = 0;
        int a = 3; 
        int b = 3;
        if (a > 0)
            if (b < 0)
                x = x + 5;
            else if (a > 5)
                x = x + 4;
            else
                x = x + 3;
        else
            x = x + 2;
        System.out.println(x);*/
        Scanner sc = new Scanner("604-867-5309");
        sc.useDelimiter("-");
        while (sc.hasNext()) { 
            System.out.println(sc.next());
        }
    }

}
