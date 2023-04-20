package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

public class Personal_Card02 extends Personal_Card {
	
	public Personal_Card02()
	{
		posizione.add(new Tile(new Position(3,1),Color.LIGHT_BLUE));
		posizione.add(new Tile(new Position(2,3),Color.YELLOW));
		posizione.add(new Tile(new Position(4,2),Color.WHITE));
		posizione.add(new Tile(new Position(0,3),Color.GREEN));
		posizione.add(new Tile(new Position(1,4),Color.PINK));
		posizione.add(new Tile(new Position(4,0),Color.BLUE));
	}


}