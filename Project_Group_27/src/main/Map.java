package main;

public class Map {
	private Tile[][] map= new Tile[9][9]; 
	
	
	public Map(int n_players)
	{
		//put new Tile() to the position we never need
		map[0][0]=new Tile();
		map[0][1]=new Tile();
		map[0][2]=new Tile();
		map[0][5]=new Tile();
		map[0][6]=new Tile();
		map[0][7]=new Tile();
		map[0][8]=new Tile();
		map[1][0]=new Tile();
		map[1][1]=new Tile();
		map[1][2]=new Tile();
		map[1][6]=new Tile();
		map[1][7]=new Tile();
		map[1][8]=new Tile();
		map[2][0]=new Tile();
		map[2][1]=new Tile();
		map[2][7]=new Tile();
		map[2][8]=new Tile();
		map[3][0]=new Tile();
		map[5][8]=new Tile();
		map[6][0]=new Tile();
		map[6][1]=new Tile();
		map[6][7]=new Tile();
		map[6][8]=new Tile();
		map[7][0]=new Tile();
		map[7][1]=new Tile();
		map[7][2]=new Tile();
		map[7][6]=new Tile();
		map[7][7]=new Tile();
		map[7][8]=new Tile();
		map[8][0]=new Tile();
		map[8][1]=new Tile();
		map[8][2]=new Tile();
		map[8][3]=new Tile();
		map[8][6]=new Tile();
		map[8][7]=new Tile();
		map[8][8]=new Tile();
		//put new Tile() in the position looking the number of player
		if(n_players==2||n_players==1)
		{
			//put new Tile() the tiles used for 3 players
			map[0][4]=new Tile();
			map[1][5]=new Tile();
			map[3][1]=new Tile();
			map[4][0]=new Tile();
			map[4][8]=new Tile();
			map[5][7]=new Tile();
			map[7][3]=new Tile();
			map[8][4]=new Tile();
			if(n_players==1)
			{
				//put new Tile() the tiles used for 2 players
				map[0][3]=new Tile();
				map[2][2]=new Tile();
				map[2][6]=new Tile();
				map[3][8]=new Tile();
				map[5][0]=new Tile();
				map[6][2]=new Tile();
				map[6][6]=new Tile();
				map[8][5]=new Tile();
			}
		}
		fillMap();//use function fillMap() to fill the map
	}
	
	void fillMap()
	{
		for(int i=0;i<9;i++)
		{
			for(int k=0;k<9;k++)
			{
				if(map[i][k].getP().getX()!=-1)
				{
					//faccio random generetor e assegno la cella
				}
			}
			
		}
		
		
	}
	
	void verifyMap()
	{
		
	}
	Tile[][] getMap()
	{
		return this.map;
	}
}
