public class PlayingCard implements Comparable<PlayingCard>{

    private final Suit suit;
    private final Number number;

    @Override
    public String toString() {
        return "PlayingCard{" +
                "suit=" + suit +
                ", number=" + number +
                '}';
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
