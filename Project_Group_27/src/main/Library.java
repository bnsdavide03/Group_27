package main;

public class Library {
	private Tile personalTiles[][]= new Tile[6][5];
	void Library()
	{
		//create the empty library
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<5;j++)
			{
				this.personalTiles[i][j]=null;
			}
		}
	}
	Tile[][] getPersonalTile()
	{
		return this.personalTiles;
	}
}
