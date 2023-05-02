package main;
import java.util.ArrayList;

import personal_card.*;
public class Player {
	private int number;
	private String name;
	private int points;
	private boolean chair;
	private Personal_Card personalCard;
	Library library;
	
	public Player(String name) {
		/*Library lib=new Library();
		lib.library[3][1]=new Tile(new Position(3,1),Color.LIGHT_BLUE);
		lib.library[1][4]=new Tile(new Position(1,4),Color.PINK);
		lib.library[4][0]=new Tile(new Position(4,0),Color.BLUE);
		this.library=lib;
		this.personalCard=new Personal_Card02();*/
		
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public int getPoints() {
		return this.points;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int calculateTotalPoints()
	{
		return this.points;
	}
	
	void setChairTrue() {
		this.chair=true;
	}
	
	int incrementPoints(int points) {
		return this.points;
	}
	/*int play(){
	 
	}*/
	public int verifyPersonalCard() {
		int cont=0;       
		int points = 0;
		ArrayList<Tile> position= personalCard.get_color_position();
		Tile library_matrix[][]= library.getLibrary();
		for(int i=0; i<position.size(); i++) {
			Position p= position.get(i).getP();	
			Color c= position.get(i).getColor();
			if(library_matrix[p.getX()][p.getY()]!=null) {
				if(library_matrix[p.getX()][p.getY()].getColor()==c) {
					cont++;
				}
			}
		}
		
		if(cont==1) {
			points=1;
		}
		else if(cont==2) {
			points=2;
		}
		else if(cont==3) {
			points=4;
		}
		else if(cont==4) {
			points=6;
		}
		else if(cont==5) {
			points=9;
		}
		else if(cont==6) {
			points=12;
		}
		return points;
	}
	
}
