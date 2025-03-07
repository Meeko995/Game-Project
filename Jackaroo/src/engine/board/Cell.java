package engine.board;

public class Cell {
//read and write
	private Marble marble;
	private CellType cellType;
	boolean trap;
	
	//Constructor that initializes a Cell object with the cell type and sets the marble to null, and trap to false.

	public Cell(CellType cellType){
		this.cellType = cellType ;
		Cell cell = new Cell(getType());
		marble = null;
		trap = false;
	}
	
	public CellType getType() {
        return cellType;
    }
	
}
