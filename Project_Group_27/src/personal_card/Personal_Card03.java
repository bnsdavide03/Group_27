package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

public class Personal_Card03 extends Personal_Card {
	
	public Personal_Card03()
	{
		position.add(new Tile(new Position(2,4),Color.L_BLUE));
		position.add(new Tile(new Position(4,3),Color.YELLOW));
		position.add(new Tile(new Position(0,0),Color.WHITE));
		position.add(new Tile(new Position(2,1),Color.GREEN));
		position.add(new Tile(new Position(3,2),Color.PINK));
		position.add(new Tile(new Position(4,0),Color.BLUE));
	}


}
