package engine.board;

import java.util.ArrayList;
import model.Colour;

//read only
public class SafeZone {
	private final Colour colour;
	private final ArrayList<Cell> cells;

	//constructor that initialises a Safe zone object with the specified colour and creates 4 SAFE cells in the arraylist of cells.
	public SafeZone(Colour colour){
		this.colour = colour;
		
		ArrayList<Cell> cells = new ArrayList<Cell>();
		
		this.cells = new ArrayList<>();

        // Create 4 SAFE cells using the Cell constructor
        for (int i = 0; i < 4; i++) {
            cells.add(new Cell(CellType.SAFE)); 
	}
}
