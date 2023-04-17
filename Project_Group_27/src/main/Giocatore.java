package main;

public class Giocatore {
	private int number;
	private String name;
	private int points;
	private boolean chair;
	//private PersonalCard personalCard quando sarà creata la classe
	private Library library;
	
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
