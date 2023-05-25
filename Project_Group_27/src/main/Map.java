package main;

import java.util.Random;

/**
 * La classe Map rappresenta la mappa di gioco composta da tessere.
 */

public class Map {
	private Tile[][] map = new Tile[9][9];
	private int blue_card = 22;
	private int white_card = 22;
	private int light_blue_card = 22;
	private int pink = 22;
	private int yellow = 22;
	private int green = 22;

	/**
	 * Costruisce un oggetto Map con il numero specificato di giocatori.
	 *
	 * @param n_players = il numero di giocatori nella partita
	 */

	public Map(int n_players) {
		// put new Tile() to the position we never need
		map[0][0] = new Tile();
		map[0][1] = new Tile();
		map[0][2] = new Tile();
		map[0][5] = new Tile();
		map[0][6] = new Tile();
		map[0][7] = new Tile();
		map[0][8] = new Tile();
		map[1][0] = new Tile();
		map[1][1] = new Tile();
		map[1][2] = new Tile();
		map[1][6] = new Tile();
		map[1][7] = new Tile();
		map[1][8] = new Tile();
		map[2][0] = new Tile();
		map[2][1] = new Tile();
		map[2][7] = new Tile();
		map[2][8] = new Tile();
		map[3][0] = new Tile();
		map[5][8] = new Tile();
		map[6][0] = new Tile();
		map[6][1] = new Tile();
		map[6][7] = new Tile();
		map[6][8] = new Tile();
		map[7][0] = new Tile();
		map[7][1] = new Tile();
		map[7][2] = new Tile();
		map[7][6] = new Tile();
		map[7][7] = new Tile();
		map[7][8] = new Tile();
		map[8][0] = new Tile();
		map[8][1] = new Tile();
		map[8][2] = new Tile();
		map[8][3] = new Tile();
		map[8][6] = new Tile();
		map[8][7] = new Tile();
		map[8][8] = new Tile();
		// put new Tile() in the position looking the number of player
		if (n_players < 4) {
			// put new Tile() the tiles used for 3 players
			map[0][4] = new Tile();
			map[1][5] = new Tile();
			map[3][1] = new Tile();
			map[4][0] = new Tile();
			map[4][8] = new Tile();
			map[5][7] = new Tile();
			map[7][3] = new Tile();
			map[8][4] = new Tile();
			if (n_players == 2) {
				// put new Tile() the tiles used for 2 players
				map[0][3] = new Tile();
				map[2][2] = new Tile();
				map[2][6] = new Tile();
				map[3][8] = new Tile();
				map[5][0] = new Tile();
				map[6][2] = new Tile();
				map[6][6] = new Tile();
				map[8][5] = new Tile();
			}
		}
		fillMap(); // use function fillMap() to fill the map
	}

	/**
	 * Riempie la mappa con delle tessere casuali in base al conteggio delle carte
	 * disponibili.
	 */

	void fillMap() {
		Random rand = new Random();
		int upperbound = 6;

		for (int i = 0; i < 9; i++) {
			for (int k = 0; k < 9; k++) {
				if (blue_card + white_card + light_blue_card + pink + yellow + green != 0) {
					if (map[i][k] == null) {
						boolean contro;
						do {
							contro = false;
							int int_random = rand.nextInt(upperbound);
							if (int_random == 0) {
								if (blue_card != 0) {
									blue_card = -1;
									map[i][k] = new Tile(new Position(i, k), Color.BLUE);
								} else {
									contro = true;
								}

							} else if (int_random == 1) {
								if (white_card != 0) {
									white_card = -1;
									map[i][k] = new Tile(new Position(i, k), Color.WHITE);
								} else {
									contro = true;
								}
							} else if (int_random == 2) {
								if (light_blue_card != 0) {
									light_blue_card = -1;
									map[i][k] = new Tile(new Position(i, k), Color.L_BLUE);
								} else {
									contro = true;
								}
							}

							else if (int_random == 3) {
								if (pink != 0) {
									pink = -1;
									map[i][k] = new Tile(new Position(i, k), Color.PINK);
								} else {
									contro = true;
								}
							} else if (int_random == 4) {
								if (yellow != 0) {
									yellow = -1;
									map[i][k] = new Tile(new Position(i, k), Color.YELLOW);
								} else {
									contro = true;
								}
							} else if (int_random == 5) {
								if (green != 0) {
									green = -1;
									map[i][k] = new Tile(new Position(i, k), Color.GREEN);
								} else {
									contro = true;
								}
							}

						} while (contro == true);

					}
				} else {
					System.out.println("abbiamo finito le carte");
					break;

				}
			}

		}

	}

	/**
	 * Verifica che la mappa abbia per ogni tessera una tessera adiacente valida.
	 *
	 * @return 1 se la mappa è valida e può essere giocata, 0 altrimenti
	 */

	int verifyMap() {
		for (int i = 0; i < 8; i++) {
			for (int k = 0; k < 8; k++) {
				if (this.map[i][k] != null) {
					if (this.map[i][k].getP().getX() != -1) {
						if (this.map[i + 1][k] != null && this.map[i + 1][k].getP().getX() != -1) { // for each tile of
																									// the map check if
																									// the right one or
																									// the bottom one is
																									// not empty
							return 0;
						}
						if (this.map[i][k + 1] != null && this.map[i][k + 1].getP().getX() != -1) {
							return 0;
						}
					}
				}
			}
		}
		fillMap(); // if we can't take more than one tile fill the map
		return 1;
	}

	/**
	 * Restituisce la mappa.
	 *
	 * @return la mappa come un array bidimensionale di tessere
	 */

	Tile[][] getMap() {

		return this.map;
	}

	/**
	 * Stampa una rappresentazione visuale della mappa.
	 */

	public void visualmap() {

		System.out.print("\t");

		for (int j = 0; j < 9; j++) {

			System.out.print(j + "\t");

		}

		System.out.println();

		for (int i = 0; i < 9; i++) {

			System.out.print(i + "\t");

			for (int k = 0; k < 9; k++) {
				if (i < 9 && k < 9 && map[i][k] != null) {
					if (map[i][k].getP().getX() != -1) {
						if (map[i][k].getColor() == Color.BLUE) {
							System.out.print("\u001B[34m" + map[i][k].getColor() + "\033[0m\t\t");
						} else if (map[i][k].getColor() == Color.GREEN) {
							System.out.print("\u001B[32m" + map[i][k].getColor() + "\033[0m\t\t");
						} else if (map[i][k].getColor() == Color.L_BLUE) {
							System.out.print("\u001B[36m" + map[i][k].getColor() + "\033[0m\t\t");
						} else if (map[i][k].getColor() == Color.PINK) {
							System.out.print("\u001B[35m" + map[i][k].getColor() + "\033[0m\t\t");
						} else if (map[i][k].getColor() == Color.WHITE) {
							System.out.print("\u001B[37m" + map[i][k].getColor() + "\033[0m\t\t");
						} else if (map[i][k].getColor() == Color.YELLOW) {
							System.out.print("\u001B[33m" + map[i][k].getColor() + "\033[0m\t\t");
						}
					} else {
						System.out.print("---\t");
					}

				} else {
					System.out.print("---\t");
				}

			}
			System.out.println();
		}
	}

	/**
	 * Verifica se la tessera selezionata alla posizione specificata è valida.
	 *
	 * @param position = la posizione della tessera da verificare
	 * @return true se la tessera è valida, false altrimenti
	 */

	public boolean verifyTile(Position position) {
		if (this.map[position.getX()][position.getY()] == null
				|| this.map[position.getX()][position.getY()].getTile() == -1) {
			System.out.println("Invalid selection: no tile found.");
			return false;
		}
		if ((position.getX() == 0 && position.getY() == 3) || (position.getX() == 0 && position.getY() == 4)
				|| (position.getX() == 5 && position.getY() == 0) || (position.getX() == 4 && position.getY() == 0)
				|| (position.getX() == 3 && position.getY() == 8) || (position.getX() == 4 && position.getY() == 8)
				|| (position.getX() == 8 && position.getY() == 5) || (position.getX() == 8 && position.getY() == 4)) {
			return true;
		}
		if (this.map[position.getX() + 1][position.getY()] == null
				|| this.map[position.getX() - 1][position.getY()] == null
				|| this.map[position.getX()][position.getY() + 1] == null
				|| this.map[position.getX()][position.getY() - 1] == null
				|| this.map[position.getX() + 1][position.getY()].getTile() == -1
				|| this.map[position.getX() - 1][position.getY()].getTile() == -1
				|| this.map[position.getX()][position.getY() + 1].getTile() == -1
				|| this.map[position.getX()][position.getY() - 1].getTile() == -1) {
			return true;
		}
		System.out.println("Invalid tile");
		return false;
	}

	/**
	 * Restituisce la tessera alla posizione specificata.
	 *
	 * @param p = la posizione della tessera
	 * @return la tessera alla posizione specificata
	 */

	public Tile getTile(Position p) {
		return this.map[p.getX()][p.getY()];
	}

	/**
	 * Rimuove la tessera alla posizione specificata dalla mappa.
	 *
	 * @param position = la posizione della tessera da rimuovere
	 */

	public void takeTile(Position position) {
		this.map[position.getX()][position.getY()] = null;
	}

}
