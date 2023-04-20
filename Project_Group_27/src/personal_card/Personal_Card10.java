package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

public class Personal_Card10 extends Personal_Card {
	
	public Personal_Card10()
	{
		posizione.add(new Tile(new Position(4,5),Color.LIGHT_BLUE));
		posizione.add(new Tile(new Position(1,4),Color.YELLOW));
		posizione.add(new Tile(new Position(0,3),Color.WHITE));
		posizione.add(new Tile(new Position(3,2),Color.GREEN));
		posizione.add(new Tile(new Position(3,0),Color.PINK));
		posizione.add(new Tile(new Position(1,1),Color.BLUE));
	}


}
