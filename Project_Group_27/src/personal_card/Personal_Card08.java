package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

public class Personal_Card08 extends Personal_Card {
	
	public Personal_Card08()
	{
		position.add(new Tile(new Position(3,2),Color.L_BLUE));
		position.add(new Tile(new Position(0,3),Color.YELLOW));
		position.add(new Tile(new Position(1,3),Color.WHITE));
		position.add(new Tile(new Position(4,1),Color.GREEN));
		position.add(new Tile(new Position(2,0),Color.PINK));
		position.add(new Tile(new Position(5,4),Color.BLUE));
	}


}
