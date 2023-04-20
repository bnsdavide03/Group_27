package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

public class Personal_Card08 extends Personal_Card {
	
	public Personal_Card08()
	{
		posizione.add(new Tile(new Position(2,3),Color.LIGHT_BLUE));
		posizione.add(new Tile(new Position(3,0),Color.YELLOW));
		posizione.add(new Tile(new Position(3,1),Color.WHITE));
		posizione.add(new Tile(new Position(1,4),Color.GREEN));
		posizione.add(new Tile(new Position(0,2),Color.PINK));
		posizione.add(new Tile(new Position(4,5),Color.BLUE));
	}


}
