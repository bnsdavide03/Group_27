package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

public class Personal_Card06 extends Personal_Card {
	
	public Personal_Card06()
	{
		position.add(new Tile(new Position(5,2),Color.L_BLUE));
		position.add(new Tile(new Position(1,1),Color.YELLOW));
		position.add(new Tile(new Position(3,3),Color.WHITE));
		position.add(new Tile(new Position(5,4),Color.GREEN));
		position.add(new Tile(new Position(0,0),Color.PINK));
		position.add(new Tile(new Position(1,3),Color.BLUE));
	}
}
