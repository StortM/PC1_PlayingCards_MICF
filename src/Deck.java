import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Deck {

    Stack<PlayingCard> STACK;

    public Deck() {
        STACK = new Stack<>();
    }

    public void fillDeck(){
        for (Suit suit: Suit.values()){
            for (Number number : Number.values()){
                STACK.push(new PlayingCard(suit,number));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(STACK);
    }

    public void drawFirst(){
        System.out.println("You drew " + STACK.pop());
    }

    @Override
    public String toString() {
        return "Deck{" +
                "STACK=" + STACK +
                '}';
    }
}
