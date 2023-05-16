package personal_card;

import java.util.ArrayList;

import main.Library;
import main.Tile;

public abstract class Personal_Card {
	protected ArrayList<Tile> position= new ArrayList<Tile>();
	
	
	public  ArrayList<Tile>  get_color_position()
	{
		return this.position;
	}
	
	public void Visual_Personal_Card()
	{
		Library library=new Library();
		for(int i=0;i<position.size();i++)
		{
			library.setTile(position.get(i).getP(), position.get(i));
		}
		library.visualLibrary();
	}
	
	

}
