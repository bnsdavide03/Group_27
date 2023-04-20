package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

public class Personal_Card07 extends Personal_Card {
	
	public Personal_Card07()
	{
		posizione.add(new Tile(new Position(0,2),Color.LIGHT_BLUE));
		posizione.add(new Tile(new Position(4,1),Color.YELLOW));
		posizione.add(new Tile(new Position(2,0),Color.WHITE));
		posizione.add(new Tile(new Position(0,5),Color.GREEN));
		posizione.add(new Tile(new Position(1,3),Color.PINK));
		posizione.add(new Tile(new Position(3,4),Color.BLUE));
	}


}
