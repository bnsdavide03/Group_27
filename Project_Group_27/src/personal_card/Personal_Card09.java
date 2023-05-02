package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

public class Personal_Card09 extends Personal_Card {
	
	public Personal_Card09()
	{
		position.add(new Tile(new Position(1,1),Color.LIGHT_BLUE));
		position.add(new Tile(new Position(2,5),Color.YELLOW));
		position.add(new Tile(new Position(4,2),Color.WHITE));
		position.add(new Tile(new Position(2,3),Color.GREEN));
		position.add(new Tile(new Position(4,1),Color.PINK));
		position.add(new Tile(new Position(0,0),Color.BLUE));
	}


}
