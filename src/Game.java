import java.util.Stack;

public class Game {

    public Game() {
    }

    public void playSimpleGame(Deck deck){
        System.out.println("Starting simple game");
        Player playerA = new Player();
        Player playerB = new Player();

        while (deck.STACK.size() > 1) {
            int score = drawCards(deck);
            if (score < 0) {
                playerA.setScore(playerA.getScore() + 1);
            } else if (score > 0) {
                playerB.setScore(playerB.getScore() + 1);
            } else {
                System.out.println("DRAW!");
            }
            System.out.println("The score is: " + playerA.getScore() + " - " + playerB.getScore() + "\n");
        }
        System.out.println("Score of player A " + playerA.getScore());
        System.out.println("Score of player B " + playerB.getScore());

        findWinner(playerA,playerB);
    }

    public void playAdvancedGame(Deck deck) {
        System.out.println("Starting advanced game");

        Player playerA = new Player();
        Player playerB = new Player();

        while (deck.STACK.size() > 1) {
            int score = drawCards(deck);
            if (score < 0) {
                playerA.setScore(playerA.getScore() + (score * -1));
            } else if (score > 0) {
                playerB.setScore(playerB.getScore() + score);
            } else {
                System.out.println("DRAW!");
            }
            System.out.println("The score is: " + playerA.getScore() + " - " + playerB.getScore() + "\n");
        }
        System.out.println("Score of player A " + playerA.getScore());
        System.out.println("Score of player B " + playerB.getScore());

        findWinner(playerA,playerB);
    }

    public int drawCards(Deck deck){
        PlayingCard playerACard = deck.STACK.peek();
        deck.STACK.pop();
        PlayingCard playerBCard = deck.STACK.peek();
        deck.STACK.pop();

        System.out.println("player A card" + playerACard);
        System.out.println("player B card" + playerBCard);
        return playerACard.compareTo(playerBCard);
    }

    public void findWinner(Player playerA, Player playerB){
        if (playerA.getScore() > playerB.getScore()) {
            System.out.println("THE WINNER IS A!" + "\n");
        } else if (playerB.getScore() > playerA.getScore()) {
            System.out.println("THE WINNER IS B!" + "\n");
        } else {
            System.out.println("DRAW!" + "\n");
        }
    }
}
