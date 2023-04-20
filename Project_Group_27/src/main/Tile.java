package main;

public class Tile {
	

	Position P;
	Color c;
	
	public Tile(Position P,Color c) 
	{
		this.P=P;
		this.c=c;
	}
	public Tile() 
	{
		Position pos=new Position();
		this.P=pos;
	}
	public int getTile()
	{
		return P.getX();
	}
	
	public Color getColor() {
		return this.c;
	}

	public Position getP() {
		return P;
	}
	
}
