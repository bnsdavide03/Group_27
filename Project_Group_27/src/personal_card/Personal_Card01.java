package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

public class Personal_Card01 extends Personal_Card {
	
	public Personal_Card01()
	{
	/*	this.card[2][0]=Color.LIGHT_BLUE;
		this.card[1][2]=Color.YELLOW;
		this.card[3][3]=Color.WHITE;
		this.card[4][4]=Color.GREEN;
		this.card[0][5]=Color.PINK;
		this.card[2][5]=Color.BLUE;*/
		position.add(new Tile(new Position(0,1),Color.LIGHT_BLUE));
		position.add(new Tile(new Position(2,1),Color.YELLOW));
		position.add(new Tile(new Position(3,3),Color.WHITE));
		position.add(new Tile(new Position(4,4),Color.GREEN));
		position.add(new Tile(new Position(5,0),Color.PINK));
		position.add(new Tile(new Position(5,2),Color.BLUE));
	}


}
