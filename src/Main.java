public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.fillDeck();
        deck.shuffle();

        Game game = new Game();
        game.playSimpleGame(deck);

        Deck newDeck = new Deck();
        newDeck.fillDeck();
        newDeck.shuffle();

        game.playAdvancedGame(newDeck);
    }
}
