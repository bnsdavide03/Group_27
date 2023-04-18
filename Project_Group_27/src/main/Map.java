package main;

public class Map {
	private Tile[][] map= new Tile[9][9]; 
	
	void Map(int n_players)
	{
		//put null to the position we never need
		map[1][1]=null;
		map[1][2]=null;
		map[1][3]=null;
		map[1][6]=null;
		map[1][7]=null;
		map[1][8]=null;
		map[1][9]=null;
		map[2][1]=null;
		map[2][2]=null;
		map[2][3]=null;
		map[2][7]=null;
		map[2][8]=null;
		map[2][9]=null;
		map[3][1]=null;
		map[3][2]=null;
		map[3][8]=null;
		map[3][9]=null;
		map[4][1]=null;
		map[6][9]=null;
		map[7][1]=null;
		map[7][2]=null;
		map[7][8]=null;
		map[7][9]=null;
		map[8][1]=null;
		map[8][2]=null;
		map[8][3]=null;
		map[8][7]=null;
		map[8][8]=null;
		map[8][9]=null;
		map[9][1]=null;
		map[9][2]=null;
		map[9][3]=null;
		map[9][4]=null;
		map[9][7]=null;
		map[9][8]=null;
		map[9][9]=null;
		//put null in the position looking the number of player
		if(n_players==3||n_players==2)
		{
			//put null the tiles used for 4 players
			map[1][5]=null;
			map[2][6]=null;
			map[4][2]=null;
			map[5][1]=null;
			map[5][9]=null;
			map[6][8]=null;
			map[8][4]=null;
			map[9][5]=null;
			if(n_players==2)
			{
				//put null the tiles used for 3 players
				map[1][4]=null;
				map[3][3]=null;
				map[3][7]=null;
				map[4][9]=null;
				map[6][1]=null;
				map[7][3]=null;
				map[7][7]=null;
				map[9][6]=null;
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
