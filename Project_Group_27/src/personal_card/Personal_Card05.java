package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

public class Personal_Card05 extends Personal_Card {
	
	public Personal_Card05()
	{
		position.add(new Tile(new Position(1,4),Color.LIGHT_BLUE));
		position.add(new Tile(new Position(0,0),Color.YELLOW));
		position.add(new Tile(new Position(2,2),Color.WHITE));
		position.add(new Tile(new Position(4,0),Color.GREEN));
		position.add(new Tile(new Position(4,1),Color.PINK));
		position.add(new Tile(new Position(1,2),Color.BLUE));
	}


}
