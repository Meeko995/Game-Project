package engine.board;

import java.util.ArrayList;
import java.util.Random;

import model.Colour;
import engine.GameManager;

public class Board implements BoardManager{

	private final GameManager gameManager;
	private final ArrayList<Cell> track;
	private final ArrayList<SafeZone> safeZones;
	private int splitDistance;//to encapsulate in class
	private boolean isTrap;//
	
	private final ArrayList<Colour> Colour;///
	
	private Board(ArrayList<Colour> colourOrder, GameManager gameManager){
		this.gameManager = gameManager;
		ArrayList<Cell> track = new ArrayList<Cell>();
		ArrayList<SafeZone> safeZones = new ArrayList<SafeZone>();
		this.Colour = new ArrayList<>(colourOrder);
		
		this.splitDistance = 3;
	}
		@Override
		public int getSplitDistance(){
			return this.splitDistance;
		}
		Cell b = new Cell(CellType.BASE);
		Cell e = new Cell(CellType.ENTRY);
		Cell n = new Cell(CellType.NORMAL);
		
		for(int i = 0; i<100; i++){
			if (i%25==0){
				track.add(b);
			}
			else
				if(i==23 || i==48 || i==73 || i==98){
					track.add(e);
				}
				else{
					track.add(n);
			}
		}
		/* int splitdistance method GO OVER-->
		 * This implementation ensures that the split value stays within the valid range (0 to 7). The interface enforces both read
		 // Getter method to read the move split
	    @Override
	    public int getMoveSplit() {
	        return moveSplit;
	    }
	    
	    // Setter method to write a new move split
	    @Override
	    public void setMoveSplit(int split) {
	        if (split < 0 || split > 7) {
	            throw new IllegalArgumentException("Move split must be between 0 and 7");
	        }
	        this.moveSplit = split;
	    }
	    
	    // Method to get the remaining moves for the second marble
	    public int getRemainingMoves() {
	        return 7 - moveSplit;
	    }
	}*/

		//5. Change 8 random NORMAL track cells to be "flagged" as trap using the below assignTrapCell method.
		//6. Create 4 SafeZones and add them to the safeZones with the given colour order.
		
		/*public void assignTrapCell(){
			        Random rand = new Random();
			        int trapsAssigned = 0;
			        while (trapsAssigned < 8){
			            int i = rand.nextInt(track.size());
			            if (track.get(i).equals(NORMAL)) {
			                track.set(i, isTrap);
			                trapsAssigned++;
			            }
			        }
				}*/
		
		
		// Find all NORMAL cells that are not already traps
        ArrayList<Cell> normalCells = new ArrayList<>();//type Integer?
        for (int k = 0; k < trackCells.size(); k++){
            if (track.get(k).getType() == CellType.NORMAL && !track.get(k).trap) {
                normalCells.add(k);
            }
        }
        Random rand = new Random();
        // If there are any NORMAL cells available, select one randomly and mark it as a trap
        for(int j = 0; j < 8; j++){
        if (!normalCells.isEmpty()) {
            int randomIndex = rand.nextInt(normalCells.size());
            int trapIndex = normalCells.get(randomIndex);
            track.get(trapIndex).trap = true;  // Mark as trap
            //System.out.println("Trap placed at cell " + trapIndex);
        }
     }

//GO OVER-->
		void createSafeZones(){
		    Colour[] colourOrder = {Colour.RED, Colour.GREEN, Colour.BLUE, Colour.YELLOW};
		    int[] positions = {10, 25, 50, 75};  // positions on the track? how to get? -> FIX!
		    
		    for (int i = 0; i < 4; i++) {//constructor only takes colour as parameter so ??
		        //SafeZone newSafeZone = new SafeZone(colourOrder[i], positions[i]);
		        
		        safeZones.add(newSafeZone);
		    }
		}
		//jana did not eat ts up
	}
}
