import java.util.Stack;

public class Game {

    public Game() {
    }

    public void playSimpleGame(Deck deck){
        Player playerA = new Player();
        Player playerB = new Player();

        while (deck.STACK.size() > 1){
            int score = drawCards(deck);
            if (score > 0){
                playerA.setScore(playerA.getScore() + 1);
            }
            else if  (score < 0){
                playerB.setScore(playerB.getScore() + 1);
            }
            else{
                System.out.println("DRAW!");
            }
        }
        System.out.println("Score of player A " + playerA.getScore());
        System.out.println("Score of player B " + playerB.getScore());

        findWinner(playerA,playerB);

    }

    public void playAdvancedGame(Deck deck) {
        Player playerA = new Player();
        Player playerB = new Player();

        while (deck.STACK.size() > 1) {
            int score = drawCards(deck);
            if (score > 0) {
                playerA.setScore(playerA.getScore() + score);
            } else if (score < 0) {
                playerB.setScore(playerB.getScore() + (score * -1));
            } else {
                System.out.println("DRAW!");
            }
        }
        System.out.println("Score of player A " + playerA.getScore());
        System.out.println("Score of player B " + playerB.getScore());

        findWinner(playerA,playerB);
    }

    public int drawCards(Deck deck){
        PlayingCard playerACard = deck.STACK.get(deck.STACK.size()-1);
        deck.STACK.pop();
        PlayingCard playerBCard = deck.STACK.get(deck.STACK.size()-1);
        deck.STACK.pop();
        return playerACard.compareTo(playerBCard);

    }

    public void findWinner(Player playerA, Player playerB){
        if (playerA.getScore() > playerB.getScore()) {
            System.out.println("THE WINNER IS A!");
        } else if (playerB.getScore() > playerA.getScore()) {
            System.out.println("THE WINNER IS B!");
        } else {
            System.out.println("DRAW!");
        }
    }
}
