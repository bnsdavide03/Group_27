package main;
import personal_card.*;
public class Player {
	private int number;
	private String name;
	private int points;
	private boolean chair;
	private Personal_Card personalCard;
	Library library;
	
	void Giocatore(String name) {
	
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
	
}
