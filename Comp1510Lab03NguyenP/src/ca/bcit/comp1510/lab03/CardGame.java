/**
 * 
 */

package ca.bcit.comp1510.lab03;

import java.util.Random;

/** CardGame.
 * @author Phuong
 * @version 2.0
 */

public class CardGame {

    /** 
     * Generate random cards.
     */
    
    enum Rank {
        /** Ace. */
        ACE, 
        /** Two. */
        TWO, 
        /** Three. */
        THREE, 
        /** Four. */
        FOUR, 
        /** Five. */
        FIVE,
        /** Six. */
        SIX,
        /** Seven. */
        SEVEN, 
        /** Eight. */
        EIGHT,
        /** Nine. */
        NINE,
        /** Ten. */
        TEN, 
        /** Jack. */
        JACK, 
        /** Queen. */
        QUEEN, 
        /** King. */
        KING 
    }
    
   
    enum Suit {
        /** Hearts. */
        HEARTS, 
        /** Diamonds. */
        DIAMONDS, 
        /** Clubs. */
        CLUBS, 
        /** Spades. */
        SPADES;
    }
    
    /** Generate Random Cards.
     * @param args
     *          unused 
     */
    
    public static void main(String[] args) {
        Random random = new Random();
        
        //Generate random Rank
        int randomRankChoice = random.nextInt(Rank.values().length);
        Rank randomRank = Rank.values()[randomRankChoice];
        
        //Generate random Suit
        int randomSuitChoice = random.nextInt(Suit.values().length);
        Suit randomSuit = Suit.values()[randomSuitChoice];
        
        System.out.println("The random card is: " 
                            + randomRank + " OF " + randomSuit);
    }
        
}
    

