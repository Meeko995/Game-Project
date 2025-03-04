package model.card.standard;

public class Standard extends Cards{
	
	private final int rank;
	private final Suit suit;
	
	
	public Standard(String name,String description,int rank,Suit suit,BoardManager boardManager,GameManager gameManager){
		
		
		super(name, description, boardManager, gameManager);
		this.rank=rank;
		this.suit=suit;
		
		
	}
	

}


