package main;
import common_goal.*;
public class Main {

	public static void main(String[] args) {
		
		Library lib=new Library();
		lib.setTile(new Position(0,0), new Tile(new Position (0,0), Color.PINK));
		lib.setTile(new Position(1,0), new Tile(new Position (1,0), Color.GREEN));
		lib.setTile(new Position(2,0), new Tile(new Position (2,0), Color.PINK));
		lib.setTile(new Position(3,0), new Tile(new Position (3,0), Color.WHITE));
		lib.setTile(new Position(4,0), new Tile(new Position (4,0), Color.YELLOW));
		lib.setTile(new Position(5,0), new Tile(new Position (5,0), Color.BLUE));
		lib.setTile(new Position(0,1), new Tile(new Position (0,1), Color.PINK));
		lib.setTile(new Position(1,1), new Tile(new Position (1,1), Color.PINK));
		lib.setTile(new Position(2,1), new Tile(new Position (2,1), Color.GREEN));
		lib.setTile(new Position(3,1), new Tile(new Position (3,1), Color.YELLOW));
		lib.setTile(new Position(4,1), new Tile(new Position (4,1), Color.YELLOW));
		lib.setTile(new Position(5,1), new Tile(new Position (5,1), Color.YELLOW));
		lib.setTile(new Position(0,2), new Tile(new Position (0,2), Color.PINK));
		lib.setTile(new Position(1,2), new Tile(new Position (1,2), Color.WHITE));
		lib.setTile(new Position(2,2), new Tile(new Position (2,2), Color.PINK));
		lib.setTile(new Position(3,2), new Tile(new Position (3,2), Color.PINK));
		lib.setTile(new Position(4,2), new Tile(new Position (4,2), Color.YELLOW));
		lib.setTile(new Position(5,2), new Tile(new Position (5,2), Color.LIGHT_BLUE));
		lib.setTile(new Position(0,3), new Tile(new Position (0,3), Color.PINK));
		lib.setTile(new Position(1,3), new Tile(new Position (1,3), Color.PINK));
		lib.setTile(new Position(2,3), new Tile(new Position (2,3), Color.PINK));
		lib.setTile(new Position(3,3), new Tile(new Position (3,3), Color.PINK));
		lib.setTile(new Position(4,3), new Tile(new Position (4,3), Color.PINK));
		lib.setTile(new Position(5,3), new Tile(new Position (5,3), Color.PINK));
		lib.setTile(new Position(0,4), new Tile(new Position (0,4), Color.PINK));
		lib.setTile(new Position(1,4), new Tile(new Position (1,4), Color.PINK));
		lib.setTile(new Position(2,4), new Tile(new Position (2,4), Color.PINK));
		lib.setTile(new Position(3,4), new Tile(new Position (3,4), Color.PINK));
		lib.setTile(new Position(4,4), new Tile(new Position (4,4), Color.PINK));
		lib.setTile(new Position(5,4), new Tile(new Position (5,4), Color.PINK));
		Common_Goal11 goal = new Common_Goal11(4);
		System.out.println(goal.verify_goal(lib));
		/*Library lib=new Library();
		
		
		lib.library[0][4]=new Tile(new Position(0,4),Color.BLUE);
		lib.library[5][0]=new Tile(new Position(5,0),Color.BLUE);
		lib.library[5][4]=new Tile(new Position(5,4),Color.BLUE);
		/*lib.library[0][4]=new Tile(new Position(0,4),Color.GREEN);

		
		
		lib.library[1][0]=new Tile(new Position(1,0),Color.BLUE);
		lib.library[1][1]=new Tile(new Position(1,1),Color.PINK);
		lib.library[1][2]=new Tile(new Position(1,2),Color.WHITE);
		lib.library[1][3]=new Tile(new Position(1,3),Color.YELLOW);
		lib.library[1][4]=new Tile(new Position(1,4),Color.GREEN);
		
		lib.library[2][0]=new Tile(new Position(2,0),Color.BLUE);
		lib.library[2][1]=new Tile(new Position(2,1),Color.PINK);
		lib.library[2][2]=new Tile(new Position(2,2),Color.WHITE);
		lib.library[2][3]=new Tile(new Position(2,3),Color.YELLOW);
		lib.library[2][4]=new Tile(new Position(2,4),Color.GREEN);*/

		
		/*lib.library[2][1]=new Tile(new Position(2,1),Color.BLUE);
		lib.library[2][2]=new Tile(new Position(2,2),Color.BLUE);
		lib.library[2][3]=new Tile(new Position(2,3),Color.BLUE);
		lib.library[2][4]=new Tile(new Position(2,4),Color.BLUE);
		lib.library[2][0]=new Tile(new Position(2,0),Color.BLUE);
		
		lib.library[3][1]=new Tile(new Position(3,1),Color.BLUE);
		lib.library[3][2]=new Tile(new Position(3,2),Color.BLUE);
		lib.library[3][3]=new Tile(new Position(3,3),Color.BLUE);
		lib.library[3][4]=new Tile(new Position(3,4),Color.BLUE);
		lib.library[3][0]=new Tile(new Position(3,0),Color.BLUE);*/
		/*Common_Goal02 goal = new Common_Goal02(4);
		System.out.println(goal.verify_goal(lib));
		/*lib.library[5][1]=new Tile(new Position(5,1),Color.BLUE);
		
		lib.library[0][2]=new Tile(new Position(0,2),Color.BLUE);
		lib.library[1][2]=new Tile(new Position(1,2),Color.BLUE);
		lib.library[2][2]=new Tile(new Position(2,2),Color.BLUE);
		lib.library[3][2]=new Tile(new Position(3,2),Color.BLUE);
		lib.library[4][2]=new Tile(new Position(4,2),Color.BLUE);
		lib.library[5][2]=new Tile(new Position(5,2),Color.BLUE);
		 
		
		lib.library[2][3]=new Tile(new Position(2,3),Color.BLUE);
		lib.library[2][4]=new Tile(new Position(2,4),Color.BLUE);
		
		lib.library[1][4]=new Tile(new Position(1,4),Color.BLUE);
		Common_Goal06 goal = new Common_Goal06(4);
>>>>>>> branch 'main' of https://github.com/bnsdavide03/Group_27.git
		System.out.println(goal.verify_goal(lib));
		/*Common_Goal03 gol = new Common_Goal03(2);
		System.out.println(gol.getDescription());
		gol.getRemaningCards();/*
		/*Map m=new Map(4);
		m.map[5][5]=  new Tile(new Position(5, 5), Color.BLUE);
		m.map[5][6]=  new Tile(new Position(5, 6), Color.BLUE);
		System.out.println(m.verifyMap());
		m.map[5][6]=  new Tile();
		System.out.println(m.verifyMap());
		m.visualmap();
		System.out.println("");
		
		Player player1=new Player("Davide");
		System.out.println(player1.verifyPersonalCard());*/
	}
	
}
