package TESTING;

import java.util.Random;

public class randomExcluse15 {

    public static void main(String[] args) {
        //Random ran = new Random();
        /*boolean result = true;
        final int range = 10;
        int randomNumberBetweenTenAndTwentyButNotFifteen = 0;
        System.out.println("Ran num: " + randomNumberBetweenTenAndTwentyButNotFifteen);
        while (result) {
            randomNumberBetweenTenAndTwentyButNotFifteen 
                = ran.nextInt() * range + range;
            result = true;
            final int exludedNum = 15;
            
                if (randomNumberBetweenTenAndTwentyButNotFifteen == exludedNum) {
                    result = false;
                    break;
                
            } 
        }*/
        Random r = new Random();
        int result = 0;

        do
        {
            result = r.nextInt(10) + 10;
        }
        while( result != 15 );
        
        
        System.out.println("Ran num: " + result);
        

    }

}
