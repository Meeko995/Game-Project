package engine;

import java.io.IOException;//*

import engine.board.Board;//?

public class Game implements GameManager {
	//read only so final?
	Board board;
	ArrayList<Player> players;
	ArrayList<Card> firePit;
	int currentPlayerIndex;
	int turn;
	
	Game(String playerName) throws IOException{
		
	}

}
