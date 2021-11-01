package TESTING;
/**
 * 
 */


import java.util.Random;

/** CardGame.
 * @author Phuong
 * @version 2.0
 */

public class TestCardGame {

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
    
    /** RandomEnum Rank. */
    private static final RandomEnum<Rank> R =
            new RandomEnum<Rank>(Rank.class);
    
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
    
    /** RandomEnum Suit. */
    
    private static final RandomEnum<Suit> S =
            new RandomEnum<Suit>(Suit.class);
    
    /** Generate Random Cards.
     * @param args
     *          unused 
     */
    
    public static void main(String[] args) {
        System.out.println("Random Rank: " + R.random());
        System.out.println("Random Suit: " + S.random());
    }
        
    private static class RandomEnum<E extends Enum<E>> {
        
        /** Random RND. */
        private static final Random RND = new Random();
        
        /** E[] values. */
        private final E[] values;

        RandomEnum(Class<E> token) {
            values = token.getEnumConstants();
        }

        public E random() {
            return values[RND.nextInt(values.length)];
        }
    }
    
}
