package TESTING;

public class Lab6Sum {

    public static void main(String[] args) {
        int i = -10;
        int j = 2;
        int sum = 0;
        int count = 0;
        if (i > 0) {
            do {
                sum = sum + count;
                count = count + j;
            }
            while (count <= i);
        } else {
            do {
                sum = sum + count;
                count = count - j;
            }
            while (count >= i);
        }
        
        
        System.out.println ("Sum: " + sum);

    }

}
