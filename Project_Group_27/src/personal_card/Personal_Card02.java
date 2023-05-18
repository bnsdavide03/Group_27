package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

public class Personal_Card02 extends Personal_Card {
	
	public Personal_Card02()
	{
		position.add(new Tile(new Position(1,3),Color.L_BLUE));
		position.add(new Tile(new Position(3,2),Color.YELLOW));
		position.add(new Tile(new Position(2,4),Color.WHITE));
		position.add(new Tile(new Position(3,0),Color.GREEN));
		position.add(new Tile(new Position(4,1),Color.PINK));
		position.add(new Tile(new Position(0,4),Color.BLUE));
	}


}
