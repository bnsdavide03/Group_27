package main;

public class Library {
	private Tile library[][]= new Tile[6][5];
	public Library()
	{
		//create the empty library
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<5;j++)
			{
				this.library[i][j]=null;
			}
		}
	}
	Tile[][] getLibrary()
	{
		return this.library;
	}
}
