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
	public Tile[][] getLibrary()
	{
		return this.library;
	}
	public Tile getTile(Position p)
	{
		return this.library[p.getX()][p.getY()];
	}
	public void setLibrary(Tile[][] library) {
		this.library = library;
	}
}
