package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

public class Personal_Card06 extends Personal_Card {
	
	public Personal_Card06()
	{
		posizione.add(new Tile(new Position(2,5),Color.LIGHT_BLUE));
		posizione.add(new Tile(new Position(1,1),Color.YELLOW));
		posizione.add(new Tile(new Position(3,3),Color.WHITE));
		posizione.add(new Tile(new Position(4,5),Color.GREEN));
		posizione.add(new Tile(new Position(0,0),Color.PINK));
		posizione.add(new Tile(new Position(3,1),Color.BLUE));
	}
}
