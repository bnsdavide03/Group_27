package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

public class Personal_Card07 extends Personal_Card {
	
	public Personal_Card07()
	{
		position.add(new Tile(new Position(0,2),Color.LIGHT_BLUE));
		position.add(new Tile(new Position(4,1),Color.YELLOW));
		position.add(new Tile(new Position(2,0),Color.WHITE));
		position.add(new Tile(new Position(0,5),Color.GREEN));
		position.add(new Tile(new Position(1,3),Color.PINK));
		position.add(new Tile(new Position(3,4),Color.BLUE));
	}


}
