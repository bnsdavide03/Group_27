package main;

public class Map {
	private Tile[][] map= new Tile[9][9]; 
	
	public Map(int n_players)
	{
		//put null to the position we never need
		map[0][0]=null;
		map[0][1]=null;
		map[0][2]=null;
		map[0][5]=null;
		map[0][6]=null;
		map[0][7]=null;
		map[0][8]=null;
		map[1][0]=null;
		map[1][1]=null;
		map[1][2]=null;
		map[1][6]=null;
		map[1][7]=null;
		map[1][8]=null;
		map[2][0]=null;
		map[2][1]=null;
		map[2][7]=null;
		map[2][8]=null;
		map[3][0]=null;
		map[5][8]=null;
		map[6][0]=null;
		map[6][1]=null;
		map[6][7]=null;
		map[6][8]=null;
		map[7][0]=null;
		map[7][1]=null;
		map[7][2]=null;
		map[7][6]=null;
		map[7][7]=null;
		map[7][8]=null;
		map[8][0]=null;
		map[8][1]=null;
		map[8][2]=null;
		map[8][3]=null;
		map[8][6]=null;
		map[8][7]=null;
		map[8][8]=null;
		//put null in the position looking the number of player
		if(n_players==2||n_players==1)
		{
			//put null the tiles used for 3 players
			map[0][4]=null;
			map[1][5]=null;
			map[3][1]=null;
			map[4][0]=null;
			map[4][8]=null;
			map[5][7]=null;
			map[7][3]=null;
			map[8][4]=null;
			if(n_players==1)
			{
				//put null the tiles used for 2 players
				map[0][3]=null;
				map[2][2]=null;
				map[2][6]=null;
				map[3][8]=null;
				map[5][0]=null;
				map[6][2]=null;
				map[6][6]=null;
				map[8][5]=null;
			}
		}
		fillMap();//use function fillMap() to fill the map
	}
	
	void fillMap()
	{
		//random generator of tiles
	}
	
	void verifyMap()
	{
		
	}
	Tile[][] getMap()
	{
		return this.map;
	}
}
