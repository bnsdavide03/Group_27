package main;

import java.util.ArrayList;
import java.security.SecureRandom;

import personal_card.*;
import java.util.Scanner;

/**
 * La classe Player rappresenta un giocatore del gioco.
 */

public class Player {
	private int id;
	private String name;
	private int points;
	private boolean chair;
	private Personal_Card personalCard;
	Library library;

	/**
	 * Crea un nuovo oggetto Player con il nome, l'ID, la sedia e le carte personali
	 * disponibili forniti.
	 *
	 * @param name                       Il nome del giocatore.
	 * @param id                         L'ID del giocatore.
	 * @param chair                      la sedia.
	 * @param arrayPersonalCardAvailable Un array che rappresenta le carte personali
	 *                                   disponibili.
	 */

	public Player(String name, int id, boolean chair, int[] arrayPersonalCardAvailable) {
		this.name = name;
		this.chair = chair;
		this.id = id;
		this.points = 0;
		this.library = new Library();
		Personal_Card randomPC = getRandomObject(arrayPersonalCardAvailable);
		this.personalCard = randomPC;
	}

	/**
	 * Genera un oggetto Personal_Card in modo casuale basato sull'array di carte
	 * personali disponibili.
	 *
	 * @param arrayPersonalCardAvailable = L'array delle carte personali
	 *                                   disponibili.
	 * @return L'oggetto Personal_Card generato in modo casuale.
	 */

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

	/**
	 * Restituisce l'ID del giocatore.
	 *
	 * @return L'ID del giocatore.
	 */

	public int getId() {
		return this.id;
	}

	/**
	 * Restituisce i punti del giocatore.
	 *
	 * @return I punti del giocatore.
	 */

	public int getPoints() {
		return this.points;
	}

	/**
	 * Aggiunge punti al giocatore.
	 *
	 * @param points = I punti da aggiungere al giocatore.
	 */

	public void addPoints(int points) {
		this.points += points;
	}

	/**
	 * Restituisce il nome del giocatore.
	 *
	 * @return Il nome del giocatore.
	 */

	public String getName() {
		return this.name;
	}

	/**
	 * Imposta la posizione del giocatore come vera.
	 */

	void setChairTrue() {
		this.chair = true;
	}

	/**
	 * Incrementa i punti del giocatore.
	 *
	 * @param points = I punti da incrementare.
	 * @return I punti incrementati del giocatore.
	 */

	int incrementPoints(int points) {
		return this.points;
	}

	/**
	 * Stampa le informazioni del giocatore.
	 */

	void ToString() {
		System.out.println("Id: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Chair: " + this.chair);
		System.out.println("Points: " + this.points);
		System.out.println("Personal Card: " + this.personalCard.getClass().getSimpleName() + "\n");
	}

	/**
	 * Permette al giocatore di scegliere una tessera sulla mappa.
	 *
	 * @param map      = La mappa del gioco.
	 * @param nPlayers = Il numero di giocatori.
	 * @return True se la scelta della tessera è valida, False altrimenti.
	 */

	public boolean chooseTile(Map map, int nPlayers) {
		int choice;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("How many tiles do you want to take? Enter a number from 1 to 3");
			try {
				choice = Integer.parseInt(sc.next());
			} catch (Exception e) {
				choice = -1;
			}

			if (choice > 3 || choice <= 0) {
				System.out.println("Number not valid! Insert a number between 1 and 3\n");
			}
		} while (choice > 3 || choice <= 0);

		Position pos[] = new Position[choice];
		int x, y;

		// CHIEDERE ALLA PROFE

		for (int i = 0; i < choice; i++) {

			System.out.println("Enter coordinates of tile: " + (i + 1));
			do {
				System.out.println("\tEnter row value: ");
				try {
					x = Integer.parseInt(sc.next());
				} catch (Exception e) {
					x = -1;
				}

				if (x > 8 || x < 0) {
					System.out.println("Number not valid! Insert a number from 0 to 9\n");
				}
			} while ((x > 8 || x < 0));

			do {
				System.out.println("\tEnter column value: ");
				try {
					y = Integer.parseInt(sc.next());
				} catch (Exception e) {
					y = -1;
				}

				if (y > 8 || y < 0) {
					System.out.println("Number not valid! Insert a number from 0 to 9\n");
				}
			} while ((y > 8 || y < 0));
			pos[i] = new Position(x, y);

			if (!map.verifyTile(pos[i])) {
				return false;
			}

			if (i > 0) {
				if (!((pos[i].getX() - 1 == pos[i - 1].getX() && pos[i].getY() == pos[i - 1].getY())
						|| (pos[i].getX() + 1 == pos[i - 1].getX() && pos[i].getY() == pos[i - 1].getY())
						|| (pos[i].getY() + 1 == pos[i - 1].getY() && pos[i - 1].getX() == pos[i].getX())
						|| (pos[i].getY() - 1 == pos[i - 1].getY() && pos[i - 1].getX() == pos[i].getX()))) {
					System.out.println("The tile is not adjacent to the previous ones");
					return false;
				}

				if (i > 1) {
					if (!(pos[0].getX() == pos[2].getX() || pos[0].getY() == pos[2].getY())) {
						System.out.println("The tile is not adjacent to the previous ones");
						return false;
					}
				}
			}
		}

		this.putInLibrary(pos, map, nPlayers);

		return true;
	}

	/**
	 * Verifica la carta personale del giocatore e restituisce i punti ottenuti.
	 *
	 * @return I punti ottenuti dalla carta personale del giocatore.
	 */

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

	/**
	 * Restituisce la carta personale del giocatore.
	 *
	 * @return La carta personale del giocatore.
	 */

	public Personal_Card getPersonalCard() {
		return personalCard;
	}

	/**
	 * Inserisce le posizioni specificate nella libreria del giocatore.
	 *
	 * @param p        = Un array di posizioni da inserire nella libreria.
	 * @param map      = La mappa del gioco.
	 * @param nPlayers = Il numero di giocatori.
	 */

	public void putInLibrary(Position p[], Map map, int nPlayers) {

		for (int i = 0; i < p.length; i++) {
			if (map.getTile(p[i]).getColor() == Color.BLUE) {
				System.out.print("\u001B[34m" + map.getTile(p[i]).getColor() + "\033[0m\t\t");
			} else if (map.getTile(p[i]).getColor() == Color.GREEN) {
				System.out.print("\u001B[32m" + map.getTile(p[i]).getColor() + "\033[0m\t\t");
			} else if (map.getTile(p[i]).getColor() == Color.L_BLUE) {
				System.out.print("\u001B[36m" + map.getTile(p[i]).getColor() + "\033[0m\t\t");
			} else if (map.getTile(p[i]).getColor() == Color.PINK) {
				System.out.print("\u001B[35m" + map.getTile(p[i]).getColor() + "\033[0m\t\t");
			} else if (map.getTile(p[i]).getColor() == Color.WHITE) {
				System.out.print("\u001B[37m" + map.getTile(p[i]).getColor() + "\033[0m\t\t");
			} else if (map.getTile(p[i]).getColor() == Color.YELLOW) {
				System.out.print("\u001B[33m" + map.getTile(p[i]).getColor() + "\033[0m\t\t");
			}
		}
		Position p1[] = new Position[p.length];

		for (int i = 1; i < p.length; i++) {
			int choice;

			Scanner sc = new Scanner(System.in);
			do {
				System.out.println("insert which of " + p.length + " colors you want to insert in " + i + " position");
				try {
					choice = Integer.parseInt(sc.next());
				} catch (Exception e) {
					choice = -1;
				}

				if (choice > 3 || choice <= 0) {
					System.out.println("Number not valid! Insert a number between 1 and 3\n");
				}
			} while (choice > 3 || choice <= 0);
			p1[i - 1] = new Position(p[choice - 1].getX(), p[choice - 1].getY());
			p[choice - 1] = null;
		}
		for (int i = 0; i < p.length; i++) {
			if (p[i] != null) {
				p1[p.length - 1] = p[i];
				// System.out.println("la pos"+p1[p.length-1].getX()+p1[p.length-1].getY());
			}
		}

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
			for (int f = 0; f < p1.length; f++) {
				this.library.setTile(new Position(i - f, input), map.getTile(p1[f]));
			}
		} catch (Exception e) {
			System.out.println("Not enough space in the selected column");
			chooseTile(map, nPlayers);
		}

		/// il codice potrebbe crascare inserire eccezione

		for (int j = 0; j < p1.length; j++) {
			map.takeTile(p1[j]);
		}

	}

	/**
	 * Verifica se il giocatore è il presidente della partita.
	 *
	 * @return True se il giocatore è il presidente, False altrimenti.
	 */

	public boolean isChair() {
		return chair;
	}

	/**
	 * Verifica la presenza di tessere adiacenti con lo stesso colore nella libreria
	 * del giocatore, a partire dalla posizione specificata e le rimuove
	 * ricorsivamente, aggiornando il conteggio delle tessere rimosse.
	 *
	 * @param lib   La libreria del giocatore.
	 * @param t1    La posizione iniziale per la verifica.
	 * @param c     Il colore da confrontare.
	 * @param count Il conteggio delle tessere rimosse.
	 * @return Il conteggio aggiornato delle tessere rimosse.
	 */

	public int remove_adjacency(Library lib, Position t1, Color c, int count) {

		if (t1.getX() + 1 < 6) {
			if (lib.getTile(new Position(t1.getX() + 1, t1.getY())) != null) {
				if (lib.getTile(new Position(t1.getX() + 1, t1.getY())).getColor() == c) {
					count++;
					lib.setTile(new Position(t1.getX() + 1, t1.getY()), null);
					count = remove_adjacency(lib, new Position(t1.getX() + 1, t1.getY()), c, count);

				}

			}
		}
		if (t1.getY() + 1 < 5) {
			if (lib.getTile(new Position(t1.getX(), t1.getY() + 1)) != null) {
				if (lib.getTile(new Position(t1.getX(), t1.getY() + 1)).getColor() == c) {
					count++;
					lib.setTile(new Position(t1.getX(), t1.getY() + 1), null);
					count = remove_adjacency(lib, new Position(t1.getX(), t1.getY() + 1), c, count);
				}
			}
		}

		if (t1.getY() - 1 >= 0) {
			if (lib.getTile(new Position(t1.getX(), t1.getY() - 1)) != null) {
				if (lib.getTile(new Position(t1.getX(), t1.getY() - 1)).getColor() == c) {
					count++;
					lib.setTile(new Position(t1.getX(), t1.getY() - 1), null);
					count = remove_adjacency(lib, new Position(t1.getX(), t1.getY() - 1), c, count);

				}
			}
		}
		if (lib.getTile(new Position(t1.getX(), t1.getY())) != null
				&& lib.getTile(new Position(t1.getX(), t1.getY())).getColor() == c) {
			lib.setTile(new Position(t1.getX(), t1.getY()), null);
			count++;
		}

		return count;
	}

	/**
	 * Verifica la presenza di tessere adiacenti con lo stesso colore nella libreria
	 * del giocatore e le rimuove, aggiornando i punti del giocatore.
	 */

	public void verifyPlanceGoal() {
		int count = 0;
		int goalPoints = 0;
		Color color[] = { Color.BLUE, Color.PINK, Color.L_BLUE, Color.GREEN, Color.YELLOW, Color.WHITE };
		for (int j = 0; j < 6; j++) {
			for (int i = 0; i < 6; i++) {
				for (int k = 0; k < 5; k++) {
					if (this.library.getTile(new Position(i, k)) != null
							&& this.library.getTile(new Position(i, k)).getColor() == color[j]) {
						count = remove_adjacency(this.library, new Position(i, k), color[j], count);
					}
					if (count == 3) {
						goalPoints = 2;
					} else if (count == 4) {
						goalPoints = 3;
					} else if (count == 5) {
						goalPoints = 5;
					} else if (count >= 6) {
						goalPoints = 8;
					}
					this.points += goalPoints;
					count = 0;
					goalPoints = 0;
				}
			}
		}
	}
}