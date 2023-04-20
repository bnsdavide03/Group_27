package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

public class Personal_Card03 extends Personal_Card {
	
	public Personal_Card03()
	{
		posizione.add(new Tile(new Position(4,2),Color.LIGHT_BLUE));
		posizione.add(new Tile(new Position(3,4),Color.YELLOW));
		posizione.add(new Tile(new Position(0,0),Color.WHITE));
		posizione.add(new Tile(new Position(1,2),Color.GREEN));
		posizione.add(new Tile(new Position(2,3),Color.PINK));
		posizione.add(new Tile(new Position(0,4),Color.BLUE));
	}


}
