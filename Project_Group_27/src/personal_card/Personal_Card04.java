package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

public class Personal_Card04 extends Personal_Card {
	
	public Personal_Card04()
	{
		posizione.add(new Tile(new Position(0,3),Color.LIGHT_BLUE));
		posizione.add(new Tile(new Position(4,5),Color.YELLOW));
		posizione.add(new Tile(new Position(1,1),Color.WHITE));
		posizione.add(new Tile(new Position(2,1),Color.GREEN));
		posizione.add(new Tile(new Position(3,2),Color.PINK));
		posizione.add(new Tile(new Position(2,3),Color.BLUE));
	}


}
