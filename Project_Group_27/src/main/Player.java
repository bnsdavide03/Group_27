package main;

import java.util.ArrayList;
import java.security.SecureRandom;

import personal_card.*;
import java.util.Scanner;

public class Player {
	private int id;
	private String name;
	private int points;
	private boolean chair;
	private Personal_Card personalCard;
	Library library;

	public Player(String name, int id, boolean chair, int[] arrayPersonalCardAvailable) {
		this.name = name;
		this.chair = chair;
		this.id = id;
		this.points = 0;
		this.library = new Library();
		Personal_Card randomPC = getRandomObject(arrayPersonalCardAvailable);
		this.personalCard = randomPC;
	}

	Personal_Card getRandomObject(int[] arrayPersonalCardAvailable) {

		int upperbound = 12;
		int r;
		boolean found;
		do {
			SecureRandom rand = new SecureRandom();
			found = true;
			r = rand.nextInt(upperbound);
			r++;
			// System.out.println("r trovato= "+r);
			if (arrayPersonalCardAvailable[r - 1] == r) {
				found = false;
				arrayPersonalCardAvailable[r - 1] = -1;
			}
		} while (found == true);

		switch (r) {
		case 1:
			return new Personal_Card01();
		case 2:
			return new Personal_Card02();
		case 3:
			return new Personal_Card03();
		case 4:
			return new Personal_Card04();
		case 5:
			return new Personal_Card05();
		case 6:
			return new Personal_Card06();
		case 7:
			return new Personal_Card07();
		case 8:
			return new Personal_Card08();
		case 9:
			return new Personal_Card09();
		case 10:
			return new Personal_Card10();
		case 11:
			return new Personal_Card11();
		case 12:
			return new Personal_Card12();
		default:
			return null;
		}// should never come here...
	}

	public int getId() {
		return this.id;
	}

	public int getPoints() {
		return this.points;
	}

	public String getName() {
		return this.name;
	}

	public int calculateTotalPoints() {
		return this.points;
	}

	void setChairTrue() {
		this.chair = true;
	}

	int incrementPoints(int points) {
		return this.points;
	}

	void ToString() {
		System.out.println("Id: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Chair: " + this.chair);
		System.out.println("Points: " + this.points);
		System.out.println("Personal Card: " + this.personalCard.getClass().getSimpleName() + "\n");
	}

	/*
	 * int play(){
	 * 
	 * }
	 */
	public boolean chooseTile(Map map,int nPlayers) {
		int choice;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("How many tiles do you want to take? Enter a number from 1 to 3");
		choice=sc.nextInt();
		Tile tiles[]= new Tile[choice];
		Position pos [] = new Position [choice];
		int x, y;
		
		// CHIEDERE ALLA PROFE
		
		for(int i=0;i<choice;i++) {
	
			System.out.println("Enter coordinates of tail: "+(i+1));
				System.out.println("\tEnter x coordinate: ");
				x = sc.nextInt();
				System.out.println("\tEnter y coordinate: ");
				y = sc.nextInt();
				pos[i] = new Position (x,y);
				
				if(!map.verifyTile(pos[i])) {
					return false;
				}

				if(i > 0) {
					if(! ((pos[i].getX()-1 == pos[i-1].getX() && pos[i].getY() == pos[i-1].getY()) || (pos[i].getX()+1 == pos[i-1].getX() && pos[i].getY() == pos[i-1].getY()) || (pos[i].getY()-1 == pos[i-1].getY() && pos[i-1].getX() == pos[i].getX()) || (pos[i].getY()-1 == pos[i-1].getY() && pos[i-1].getX() == pos[i].getX()))) {
						System.out.println("The tile is not adjacent to the previous ones"); 
						return false;
				}

					if (i > 1) {
						if (! (pos[0].getX()-1 == pos[2].getX() && pos[0].getY() == pos[2].getY())) {
							System.out.println("The tile is not adjacent to the previous ones"); 
							return false;
						}
					}
				}
			
		}
		
		for(int j = 0; j < choice; j++) {
		map.takeTile(pos[j]);
		}
		return true;
	}

	public int verifyPersonalCard() {
		int cont = 0;
		int points = 0;
		ArrayList<Tile> position = personalCard.get_color_position();
		Tile library_matrix[][] = library.getLibrary();
		for (int i = 0; i < position.size(); i++) {
			Position p = position.get(i).getP();
			Color c = position.get(i).getColor();
			if (library_matrix[p.getX()][p.getY()] != null) {
				if (library_matrix[p.getX()][p.getY()].getColor() == c) {
					cont++;
				}
			}
		}

		if (cont == 1) {
			points = 1;
		} else if (cont == 2) {
			points = 2;
		} else if (cont == 3) {
			points = 4;
		} else if (cont == 4) {
			points = 6;
		} else if (cont == 5) {
			points = 9;
		} else if (cont == 6) {
			points = 12;
		}
		return points;
	}

	public Personal_Card getPersonalCard() {
		return personalCard;
	}

	public void putInLibrary(Position p[], Map map, int nPlayers) {
		System.out.println("inserisci la colonna da 1 a 5");
		Scanner sc = new Scanner(System.in);
		boolean verifica_colonna = false;
		int input = 0;
		while (verifica_colonna == false) {
			input = sc.nextInt();
			if (input > 0 && input < 6) {
				verifica_colonna = true;
				input = input - 1;
			}
		}
		try {
			// cerca prima riga libera
			int i = 5;
			while (this.library.getTile(new Position(i, input)) != null) {
				i = i - 1;
			}
			for (int f = 0; f < p.length; f++) {
				this.library.setTile(new Position(i - f, input), map.getTile(p[f]));
			}
		} catch (Exception e) {
			chooseTile(map, nPlayers);
		}

		/// il codice potrebbe crascare inserire eccezione

	}

}
