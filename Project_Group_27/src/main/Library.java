package main;

/**
 * La classe Library rappresenta una libreria che contiene tile.
 */

public class Library {
	private Tile library[][] = new Tile[6][5];

	/**
	 * Costruttore di Library. Crea una libreria vuota.
	 */

	public Library() {
		// crea una libreria vuota
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				this.library[i][j] = null;
			}
		}
	}

	/**
	 * Restituisce la libreria.
	 *
	 * @return La matrice di tile che rappresenta la libreria.
	 */
	
	public Library(Library l) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (l.getTile(new Position(i, j)) != null) {
					if (l.getTile(new Position(i, j)).getColor() == Color.BLUE) {
						library[i][j] = new Tile(new Position(i, j), Color.BLUE);
					} else if (l.getTile(new Position(i, j)).getColor() == Color.GREEN) {
						library[i][j] = new Tile(new Position(i, j), Color.GREEN);
					} else if (l.getTile(new Position(i, j)).getColor() == Color.L_BLUE) {
						library[i][j] = new Tile(new Position(i, j), Color.L_BLUE);
					} else if (l.getTile(new Position(i, j)).getColor() == Color.PINK) {
						library[i][j] = new Tile(new Position(i, j), Color.PINK);
					} else if (l.getTile(new Position(i, j)).getColor() == Color.WHITE) {
						library[i][j] = new Tile(new Position(i, j), Color.WHITE);
					} else if (l.getTile(new Position(i, j)).getColor() == Color.YELLOW) {
						library[i][j] = new Tile(new Position(i, j), Color.YELLOW);
					}

				} else {
					library[i][j] = null;
				}
			}
		}

	}

	public Tile[][] getLibrary() {
		return this.library;
	}

	/**
	 * Restituisce il tile alla posizione specificata.
	 *
	 * @param p = La posizione del tile da restituire.
	 * @return Il tile alla posizione specificata.
	 */

	public Tile getTile(Position p) {
		return this.library[p.getX()][p.getY()];
	}

	/**
	 * Imposta il tile alla posizione specificata nella libreria.
	 *
	 * @param p    = La posizione in cui impostare il tile.
	 * @param tile = Il tile da impostare.
	 */

	public void setTile(Position p, Tile tile) {
		library[p.getX()][p.getY()] = tile;
	}

	/**
	 * Imposta la libreria con una nuova matrice di tile.
	 *
	 * @param library = La nuova matrice di tile per la libreria.
	 */

	public void setLibrary(Tile[][] library) {
		this.library = library;
	}

	/**
	 * Visualizza la libreria, mostrando i tile presenti con i rispettivi colori.
	 */

	public void visualLibrary() {
		for (int i = 0; i < 6; i++) {
			for (int k = 0; k < 5; k++) {
				if (library[i][k] != null) {

					if (library[i][k].getColor() == Color.BLUE) {
						System.out.print("\u001B[34m B \033[0m");
					} else if (library[i][k].getColor() == Color.GREEN) {
						System.out.print("\u001B[32m G \033[0m");
					} else if (library[i][k].getColor() == Color.L_BLUE) {
						System.out.print("\u001B[36m L \033[0m");
					} else if (library[i][k].getColor() == Color.PINK) {
						System.out.print("\u001B[35m P \033[0m");
					} else if (library[i][k].getColor() == Color.WHITE) {
						System.out.print("\u001B[37m W \033[0m");
					} else if (library[i][k].getColor() == Color.YELLOW) {
						System.out.print("\u001B[33m Y \033[0m");
					}
				} else {
					System.out.print(" 0 ");
				}

			}
			System.out.println("");
		}
		System.out.println("");
	}

	/**
	 * Verifica se la libreria è piena, cioè se tutti gli slot sono occupati da
	 * tile.
	 * 
	 * @return true se la libreria è piena, altrimenti false.
	 */

	public boolean isFull() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (this.library[i][j] == null) {
					return false;
				}
			}
		}
		return true;
	}
}
