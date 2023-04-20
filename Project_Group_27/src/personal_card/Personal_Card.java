package personal_card;

import java.util.ArrayList;

import main.Tile;

public abstract class Personal_Card {
	protected ArrayList<Tile> posizione= new ArrayList<Tile>();
	
	
	public  ArrayList<Tile>  get_color_position()
	{
		return this.posizione;
	}

}
