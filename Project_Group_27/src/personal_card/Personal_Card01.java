package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

public class Personal_Card01 extends Personal_Card {
	
	public Personal_Card01()
	{
	/*	this.card[0][2]=Color.LIGHT_BLUE;
		this.card[2][1]=Color.YELLOW;
		this.card[3][4]=Color.WHITE;
		this.card[4][5]=Color.GREEN;
		this.card[5][0]=Color.PINK;
		this.card[5][2]=Color.BLUE;*/
		posizione.add(new Tile(new Position(0,2),Color.LIGHT_BLUE));
		posizione.add(new Tile(new Position(2,1),Color.YELLOW));
		posizione.add(new Tile(new Position(3,4),Color.WHITE));
		posizione.add(new Tile(new Position(4,5),Color.GREEN));
		posizione.add(new Tile(new Position(5,0),Color.PINK));
		posizione.add(new Tile(new Position(5,2),Color.BLUE));
	}


}
