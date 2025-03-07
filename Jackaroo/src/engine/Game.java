package engine;

import java.io.IOException;//*
import java.util.ArrayList;
import java.util.Arrays;

import model.Colour;
import engine.board.Board;//check
import engine.board.GameManager;

public class Game implements GameManager {
	//read only
	private final Board board;
	private final ArrayList<Player> players;
	private final ArrayList<Card> firePit;
	private final int currentPlayerIndex;
	private final int turn;
	//private final ArrayList<Colour> colours;//to store shuffled colours can't be named colours says duplicate field
	//stores shuffled colours
	
	public Game(String playerName) throws IOException{
		this.playerName = playerName;
		this.players = new ArrayList<Player>();
        this.firePit = new ArrayList<Card>();
        this.currentPlayerIndex = 0;
        this.turn = 0;
	}
	//3ak
	//3ak elsneen
	
	//ArrayList<Colour> colourOrder1 = new ArrayList<Colour>();
	
	//in board class but not told to create 
	//but in constructor? and need here
	
	//Creates a list of players, adding a human player with the name and the first colour in the shuffled colour order list.
	// Step 1: Shuffle Colors & Initialize Board
	
	ArrayList<Colour> colours = new ArrayList<>(Arrays.asList(Colour.values())); // Properly initializes the list
    Collections.shuffle(colours);
    Collections.addAll(colours, Arrays.asList());
    this.gameBoard = new GameBoard(this, colours);// this is the GameManager reference
	///////
 // Step 2: Load Card Pool
    Deck.loadCardPool(this, gameBoard);

    // create players human first
    players.add(new Player(playerName, colours.get(0)));

    // CPU players
    for (int i = 1; i <= 3; i++) {
        players.add(new Player("CPU " + i, colours.get(i)));
    }
    //5. Distributes a set of 4 cards to each player’s hand from a central deck using the Deck.drawCards method.
    // Step 4: Distribute Cards
    //for (Player player : players) {
      //  player.receiveCards(Deck.drawCards(4));//not a class or method yet
    }
}
