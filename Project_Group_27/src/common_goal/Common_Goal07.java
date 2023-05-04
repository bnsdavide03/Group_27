package common_goal;

import main.Library;
import main.Position;

public class Common_Goal07 extends Common_Goal {

	public Common_Goal07(int Numero_Giocatori) {
		super(Numero_Giocatori);
		this.description = "cinque tessere dello stesso tipo che formano una diagonale";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verify_goal(Library libreria) {
		// control first diagonal
		main.Color c = libreria.getTile(new Position(0, 0)).getColor();
		if (libreria.getTile(new Position(1, 1)).getColor() == c) {
			if (libreria.getTile(new Position(2, 2)).getColor() == c) {
				if (libreria.getTile(new Position(3, 3)).getColor() == c) {
					if (libreria.getTile(new Position(4, 4)).getColor() == c) {
						return true;
					}

				}

			}

		}
		// control second diagonal
		c = libreria.getTile(new Position(0, 1)).getColor();
		if (libreria.getTile(new Position(1, 2)).getColor() == c) {
			if (libreria.getTile(new Position(2, 3)).getColor() == c) {
				if (libreria.getTile(new Position(3, 4)).getColor() == c) {
					if (libreria.getTile(new Position(4, 5)).getColor() == c) {
						return true;
					}
				}
			}
		}
		// control third diagonal
		c = libreria.getTile(new Position(0, 4)).getColor();
		if (libreria.getTile(new Position(1, 3)).getColor() == c) {
			if (libreria.getTile(new Position(2, 2)).getColor() == c) {
				if (libreria.getTile(new Position(3, 1)).getColor() == c) {
					if (libreria.getTile(new Position(4, 0)).getColor() == c) {
						return true;
					}
				}
			}
		}
		// control fourth diagonal
				c = libreria.getTile(new Position(1, 4)).getColor();
				if (libreria.getTile(new Position(2, 3)).getColor() == c) {
					if (libreria.getTile(new Position(3, 2)).getColor() == c) {
						if (libreria.getTile(new Position(4, 1)).getColor() == c) {
							if (libreria.getTile(new Position(5, 0)).getColor() == c) {
								return true;
							}
						}
					}
				}


		return false;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public void getRemaningCards() {
		for (int i = 0; i < 4; i++) {
			System.out.println(this.remaningCards[i]);
		}
	}

}