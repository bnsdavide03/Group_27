package main;

import common_goal.*;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] arrayPersonalCardAvailable = new int[12];
		boolean[] commonGoalPointsAvailableForPlayer1 = new boolean[4];
		boolean[] commonGoalPointsAvailableForPlayer2 = new boolean[4];
		for (int i = 0; i < 12; i++) {
			arrayPersonalCardAvailable[i] = i + 1;
		}
		int nPlayers;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Number of players: ");
			try {
				nPlayers = Integer.parseInt(sc.next());
			} catch (Exception e) {
				nPlayers = -1;
			}

			if (nPlayers > 4 || nPlayers <= 1) {
				System.out.println("Number not valid! Insert a number between 2 and 4\n");
			}
		} while (nPlayers > 4 || nPlayers <= 1);

		Player[] players = new Player[nPlayers]; // players's array
		SecureRandom rand = new SecureRandom();
		int upperbound = nPlayers;
		int idInitialPlayer = rand.nextInt(upperbound);
		// random to choose who has the chair
		for (int i = 0; i < nPlayers; i++) { // create players into the array of players
			System.out.println(i + 1 + " Player: ");
			System.out.println("Name: ");
			String name = sc.next();
			boolean chair = false;
			if (idInitialPlayer == i) {
				chair = true;
			}
			players[i] = new Player(name, i + 1, chair, arrayPersonalCardAvailable);

		}
		/*for(int i=0;i<6;i++) {
			for(int j=0;j<4;j++) {
				players[0].library.library[i][j]=new  Tile(new Position(i,j), Color.WHITE);
			}
		}*/
		System.out.println("Players: ");

		for (int i = 0; i < nPlayers; i++) {
			System.out.println("-------------------------------------");
			players[i].ToString();
		}
		System.out.println("-------------------------------------");
		Map m = new Map(nPlayers);
		Common_Goal common_goals[] = new Common_Goal[2];
		extractCommonGoal(common_goals, nPlayers);
		System.out.println(common_goals[0].getClass().getSimpleName() + " " + common_goals[0].getDescription());
		System.out.println(common_goals[1].getClass().getSimpleName() + " " + common_goals[1].getDescription());

		System.out.println("Press Any Key To Continue...");
		new java.util.Scanner(System.in).nextLine();

		// start loop of shifts
		boolean game = true;
		int i = idInitialPlayer;
		int idFirstPlayerToFinish = -1;
		while (game == true || idFirstPlayerToFinish != -1) {
			if (players[i].isChair() && idFirstPlayerToFinish != -1) {
				break;
			} else {

				for (int j = 0; j < 100; ++j)
					System.out.println();

				System.out.println("It is player " + (i + 1) + "'s turn");
				System.out.println("-------------------------------------");
				System.out.println("Map:");
				m.visualmap();
				System.out.println("-------------------------------------");
				players[i].library.visualLibrary();
				System.out.println("-------------------------------------");
				System.out.println("PersonalGoal:");
				players[i].getPersonalCard().Visual_Personal_Card();
				System.out.println("-------------------------------------");
				System.out.println("Common_Goal 1:");
				System.out.println(common_goals[0].getClass().getSimpleName() + " " + common_goals[0].getDescription());
				System.out.println("Common_Goal 2:");
				System.out.println(common_goals[1].getClass().getSimpleName() + " " + common_goals[1].getDescription());
				System.out.println("-------------------------------------");
				boolean Verify_correct_choose;
				do {
					Verify_correct_choose = players[i].chooseTile(m, nPlayers);
				} while (!Verify_correct_choose);
				// verify common goals, if they return true give points
				boolean resultCommonGoal;
				if (commonGoalPointsAvailableForPlayer1[i] == false) {
					resultCommonGoal = common_goals[0].verify_goal(players[i].library);
					if (resultCommonGoal == true) {
						players[i].addPoints(common_goals[0].givePoints());
						System.out.println(common_goals[0].getClass().getSimpleName() + " completed");
						commonGoalPointsAvailableForPlayer1[i] = true;
					}
				}
				if (commonGoalPointsAvailableForPlayer2[i] == false) {
					resultCommonGoal = common_goals[1].verify_goal(players[i].library);
					if (resultCommonGoal == true) {
						players[i].addPoints(common_goals[1].givePoints());
						System.out.println(common_goals[1].getClass().getSimpleName() + " completed");
						commonGoalPointsAvailableForPlayer2[i] = true;
					}
				}
				
				if (m.verifyMap() == 1) {
					System.out.println("-------------------------------------");
					System.out.println("Map updated!!");
					System.out.println("-------------------------------------");
				}
				if (players[i].library.isFull()==true && game == true) {
					System.out.println("-------------------------------------");
					System.out.println("you have finished your library for first");
					System.out.println("-------------------------------------");
					players[i].addPoints(1);
					game = false;
					idFirstPlayerToFinish = i;
				}
				i++;
				i = i % nPlayers;
				System.out.println("Press Any Key To Continue...");

				new java.util.Scanner(System.in).nextLine();
			}
		}
		/*
		 * Library lib=new Library(); lib.setTile(new Position(0,0), new Tile(new
		 * Position (0,0), Color.YELLOW)); lib.setTile(new Position(1,0), new Tile(new
		 * Position (1,0), Color.YELLOW)); lib.setTile(new Position(2,0), new Tile(new
		 * Position (2,0), Color.LIGHT_BLUE)); lib.setTile(new Position(3,0), new
		 * Tile(new Position (3,0), Color.YELLOW)); lib.setTile(new Position(4,0), new
		 * Tile(new Position (4,0), Color.LIGHT_BLUE)); lib.setTile(new Position(5,0),
		 * new Tile(new Position (5,0), Color.PINK)); lib.setTile(new Position(0,1), new
		 * Tile(new Position (0,1), Color.PINK)); lib.setTile(new Position(1,1), new
		 * Tile(new Position (1,1), Color.BLUE)); lib.setTile(new Position(2,1), new
		 * Tile(new Position (2,1), Color.LIGHT_BLUE)); lib.setTile(new Position(3,1),
		 * new Tile(new Position (3,1), Color.PINK)); lib.setTile(new Position(4,1), new
		 * Tile(new Position (4,1), Color.LIGHT_BLUE)); lib.setTile(new Position(5,1),
		 * new Tile(new Position (5,1), Color.WHITE)); lib.setTile(new Position(0,2),
		 * new Tile(new Position (0,2), Color.PINK)); lib.setTile(new Position(1,2), new
		 * Tile(new Position (1,2), Color.BLUE)); lib.setTile(new Position(2,2), new
		 * Tile(new Position (2,2), Color.LIGHT_BLUE)); lib.setTile(new Position(3,2),
		 * new Tile(new Position (3,2), Color.BLUE)); lib.setTile(new Position(4,2), new
		 * Tile(new Position (4,2), Color.LIGHT_BLUE)); lib.setTile(new Position(5,2),
		 * new Tile(new Position (5,2), Color.YELLOW)); lib.setTile(new Position(0,3),
		 * new Tile(new Position (0,3), Color.PINK)); lib.setTile(new Position(1,3), new
		 * Tile(new Position (1,3), Color.WHITE)); lib.setTile(new Position(2,3), new
		 * Tile(new Position (2,3), Color.LIGHT_BLUE)); lib.setTile(new Position(3,3),
		 * new Tile(new Position (3,3), Color.WHITE)); lib.setTile(new Position(4,3),
		 * new Tile(new Position (4,3), Color.LIGHT_BLUE)); lib.setTile(new
		 * Position(5,3), new Tile(new Position (5,3), Color.LIGHT_BLUE));
		 * lib.setTile(new Position(0,4), new Tile(new Position (0,4),
		 * Color.LIGHT_BLUE)); lib.setTile(new Position(1,4), new Tile(new Position
		 * (1,4), Color.BLUE)); lib.setTile(new Position(2,4), new Tile(new Position
		 * (2,4), Color.BLUE)); lib.setTile(new Position(3,4), new Tile(new Position
		 * (3,4), Color.BLUE)); lib.setTile(new Position(4,4), new Tile(new Position
		 * (4,4), Color.BLUE)); lib.setTile(new Position(5,4), new Tile(new Position
		 * (5,4), Color.WHITE)); lib.visualLibrary(); Common_Goal goal = new
		 * Common_Goal03(4); System.out.println(goal.verify_goal(lib));
		 */

		/*
		 * Tile t= new Tile(); System.out.println(t.getP());
		 * System.out.println(t.getColor());
		 */
		/*
		 * Map m=new Map(nPlayers); m.visualmap(); System.out.println(m.verifyMap());
		 * m.takeTile(1, 4);
		 */

		/*
		 * Library lib=new Library();
		 * 
		 * 
		 * 
		 * 
		 * >>>>>>> branch 'main' of https://github.com/bnsdavide03/Group_27.git
		 * System.out.println(goal.verify_goal(lib)); /*Common_Goal03 gol = new
		 * Common_Goal03(2); System.out.println(gol.getDescription());
		 * gol.getRemaningCards();/* Map m=new Map(4); m.map[5][5]= new Tile(new
		 * Position(5, 5), Color.BLUE); m.map[5][6]= new Tile(new Position(5, 6),
		 * Color.BLUE); System.out.println(m.verifyMap()); m.map[5][6]= new Tile();
		 * System.out.println(m.verifyMap()); m.visualmap(); System.out.println("");
		 * 
		 * Player player1=new Player("Davide");
		 * System.out.println(player1.verifyPersonalCard());
		 */

	}

	public static void extractCommonGoal(Common_Goal common_goals[], int nPlayers) {
		SecureRandom rand = new SecureRandom();
		int r = rand.nextInt(12);
		int i = -1;
		int k = 0;
		do {
			if (r != i) {
				if (i != -1) {
					r = i;
				}
				switch (r) {
				case 0:
					common_goals[k] = new Common_Goal01(nPlayers);
					break;
				case 1:
					common_goals[k] = new Common_Goal02(nPlayers);
					break;
				case 2:
					common_goals[k] = new Common_Goal03(nPlayers);
					break;
				case 3:
					common_goals[k] = new Common_Goal04(nPlayers);
					break;
				case 4:
					common_goals[k] = new Common_Goal05(nPlayers);
					break;
				case 5:
					common_goals[k] = new Common_Goal06(nPlayers);
					break;
				case 6:
					common_goals[k] = new Common_Goal07(nPlayers);
					break;
				case 7:
					common_goals[k] = new Common_Goal08(nPlayers);
					break;
				case 8:
					common_goals[k] = new Common_Goal09(nPlayers);
					break;
				case 9:
					common_goals[k] = new Common_Goal10(nPlayers);
					break;
				case 10:
					common_goals[k] = new Common_Goal11(nPlayers);
					break;
				case 11:
					common_goals[k] = new Common_Goal12(nPlayers);
					break;

				}
				i = rand.nextInt(12);
				k++;
			}

		} while (common_goals[1] == null);
	}

}
