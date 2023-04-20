package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

public class Personal_Card11 extends Personal_Card {
	
	public Personal_Card11()
	{
		posizione.add(new Tile(new Position(3,0),Color.LIGHT_BLUE));
		posizione.add(new Tile(new Position(0,3),Color.YELLOW));
		posizione.add(new Tile(new Position(1,4),Color.WHITE));
		posizione.add(new Tile(new Position(4,1),Color.GREEN));
		posizione.add(new Tile(new Position(2,5),Color.PINK));
		posizione.add(new Tile(new Position(2,2),Color.BLUE));
	}


}