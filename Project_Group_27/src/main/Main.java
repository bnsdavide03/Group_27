package main;
import common_goal.*;

import java.security.SecureRandom;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*int[] arrayPersonalCardAvailable=new int[12];
		for(int i=0;i<12;i++) {arrayPersonalCardAvailable[i]=i+1;}
		int nPlayers;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Inserisci il numero di giocatori: ");
			nPlayers=sc.nextInt();
			if(nPlayers>4||nPlayers<=0) {
				System.out.println("Numero non valido, inserisci un numero da 2 a 4\n");
			}
		}while(nPlayers>4||nPlayers<=1);
		
		Player[] players=new Player[nPlayers];
		SecureRandom rand = new SecureRandom();
		int upperbound = nPlayers;
		int r = rand.nextInt(upperbound + 1);
		//random to choose who has the chair
		for(int i=0;i<nPlayers;i++) {			//create players into the array of players
			System.out.println(i+1+" Player: ");
			System.out.println("Nome: ");
			String name=sc.next();
			boolean chair=false;
			if(r==i) {
				chair=true;
			}
			players[i]=new Player(name , i+1, chair, arrayPersonalCardAvailable);
			
		}
		
		
		
		for(int i=0;i<nPlayers;i++) {
			players[i].ToString();
		}*/
		/*Library lib=new Library();
		lib.setTile(new Position(0,0), new Tile(new Position (0,0), Color.YELLOW));
		lib.setTile(new Position(1,0), new Tile(new Position (1,0), Color.YELLOW));
		lib.setTile(new Position(2,0), new Tile(new Position (2,0), Color.LIGHT_BLUE));
		lib.setTile(new Position(3,0), new Tile(new Position (3,0), Color.YELLOW));
		lib.setTile(new Position(4,0), new Tile(new Position (4,0), Color.LIGHT_BLUE));
		lib.setTile(new Position(5,0), new Tile(new Position (5,0), Color.PINK));
		lib.setTile(new Position(0,1), new Tile(new Position (0,1), Color.PINK));
		lib.setTile(new Position(1,1), new Tile(new Position (1,1), Color.BLUE));
		lib.setTile(new Position(2,1), new Tile(new Position (2,1), Color.LIGHT_BLUE));
		lib.setTile(new Position(3,1), new Tile(new Position (3,1), Color.PINK));
		lib.setTile(new Position(4,1), new Tile(new Position (4,1), Color.LIGHT_BLUE));
		lib.setTile(new Position(5,1), new Tile(new Position (5,1), Color.WHITE));
		lib.setTile(new Position(0,2), new Tile(new Position (0,2), Color.PINK));
		lib.setTile(new Position(1,2), new Tile(new Position (1,2), Color.BLUE));
		lib.setTile(new Position(2,2), new Tile(new Position (2,2), Color.LIGHT_BLUE));
		lib.setTile(new Position(3,2), new Tile(new Position (3,2), Color.BLUE));
		lib.setTile(new Position(4,2), new Tile(new Position (4,2), Color.LIGHT_BLUE));
		lib.setTile(new Position(5,2), new Tile(new Position (5,2), Color.YELLOW));
		lib.setTile(new Position(0,3), new Tile(new Position (0,3), Color.PINK));
		lib.setTile(new Position(1,3), new Tile(new Position (1,3), Color.WHITE));
		lib.setTile(new Position(2,3), new Tile(new Position (2,3), Color.LIGHT_BLUE));
		lib.setTile(new Position(3,3), new Tile(new Position (3,3), Color.WHITE));
		lib.setTile(new Position(4,3), new Tile(new Position (4,3), Color.LIGHT_BLUE));
		lib.setTile(new Position(5,3), new Tile(new Position (5,3), Color.LIGHT_BLUE));
		lib.setTile(new Position(0,4), new Tile(new Position (0,4), Color.LIGHT_BLUE));
		lib.setTile(new Position(1,4), new Tile(new Position (1,4), Color.BLUE));
		lib.setTile(new Position(2,4), new Tile(new Position (2,4), Color.BLUE));
		lib.setTile(new Position(3,4), new Tile(new Position (3,4), Color.BLUE));
		lib.setTile(new Position(4,4), new Tile(new Position (4,4), Color.BLUE));
		lib.setTile(new Position(5,4), new Tile(new Position (5,4), Color.WHITE));
		lib.visualLibrary();
		Common_Goal goal = new Common_Goal03(4);
		System.out.println(goal.verify_goal(lib));*/
		
		/*Tile t= new Tile();
		System.out.println(t.getP());
		System.out.println(t.getColor());*/
		Map m=new Map(4);
		System.out.println(m.verifyMap());
		m.takeTile(1, 4);
		m.visualmap();
		
		
		/*Library lib=new Library();
		
		 
		
		
>>>>>>> branch 'main' of https://github.com/bnsdavide03/Group_27.git
		System.out.println(goal.verify_goal(lib));
		/*Common_Goal03 gol = new Common_Goal03(2);
		System.out.println(gol.getDescription());
		gol.getRemaningCards();/*
		Map m=new Map(4);
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
