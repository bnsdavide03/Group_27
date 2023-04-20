package main;

public class Position {
	
	private int x;
	private int y;
	
	
	public Position(int x, int y) {
		this.x=x;
		this.y=y;

	}
	public Position() {
		this.x=-1;
		this.y=-1;
		
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
