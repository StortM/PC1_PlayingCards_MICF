public class PlayingCard implements Comparable<PlayingCard>{

    private final Suit suit;

    @Override
    public String toString() {
        return "PlayingCard{" +
                "suit=" + suit +
                ", number=" + number +
                '}';
    }

    private final Number number;



    public enum Suit{
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS;
    }

    public enum Number{
        KING,
        QUEEN,
        JACK,
        TEN,
        NINE,
        EIGHT,
        SEVEN,
        SIX,
        FIVE,
        FOUR,
        THREE,
        TWO,
        ACE;
    }

    public Suit getSuit() {
        return suit;
    }

    public Number getNumber() {
        return number;
    }

    public PlayingCard(Suit suit, Number number){
        this.suit = suit;
        this.number = number;
    }

    @Override
    public int compareTo(PlayingCard o) {

        //check numbers
        int numberDifference = number.compareTo(o.getNumber());

        if(numberDifference != 0){
            return numberDifference;
        }

        return suit.compareTo(o.getSuit());

    }

}
