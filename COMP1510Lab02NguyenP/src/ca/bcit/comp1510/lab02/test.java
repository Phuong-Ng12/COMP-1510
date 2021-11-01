/**
 * 
 */
package ca.bcit.comp1510.lab02;

/**
 * @author Phuong
 *
 */
public class test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String s1 ="hello";
        String s2 = new String("hello");
        String s3 = s2;
        var s4 = s3 + "again"; 
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println("\"\\\"");
        double balance = 37.37;
        var extra = (int) balance + 37;
        System.out.println(extra);
        
    }

}
