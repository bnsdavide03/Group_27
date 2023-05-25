package main;

public class Library {
	private Tile library[][] = new Tile[6][5];

	public Library() {
		// create the empty library
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				this.library[i][j] = null;
			}
		}
	}

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

	public Tile getTile(Position p) {
		return this.library[p.getX()][p.getY()];
	}

	public void setTile(Position p, Tile tile) {
		library[p.getX()][p.getY()] = tile;
	}

	public void setLibrary(Tile[][] library) {
		this.library = library;
	}

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
