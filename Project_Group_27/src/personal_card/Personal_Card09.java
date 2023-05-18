package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

public class Personal_Card09 extends Personal_Card {
	
	public Personal_Card09()
	{
		position.add(new Tile(new Position(1,1),Color.L_BLUE));
		position.add(new Tile(new Position(5,2),Color.YELLOW));
		position.add(new Tile(new Position(2,4),Color.WHITE));
		position.add(new Tile(new Position(3,2),Color.GREEN));
		position.add(new Tile(new Position(1,4),Color.PINK));
		position.add(new Tile(new Position(0,0),Color.BLUE));
	}


}
