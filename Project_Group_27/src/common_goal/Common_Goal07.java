
/**COMMON GOAL n°7 figlia
 * Obiettivo comune n°7.
 * La classe Common_Goal07 rappresenta un obiettivo comune specifico in un gioco.
 * Cinque tessere dello stesso tipo che formano una diagonale.
 * Questa classe estende la classe Common_Goal.
 */

package common_goal;

import main.Library;
import main.Position;

public class Common_Goal07 extends Common_Goal {

	/**
	 * Costruttore di Common_Goal07 Costruisce un oggetto Common_Goal07 con il
	 * numero specificato di giocatori.
	 * 
	 * @param nPlayers = numero di giocatori.
	 */

	public Common_Goal07(int nPlayers) {
		super(nPlayers);
		this.description = "cinque tessere dello stesso tipo che formano una diagonale";
	}

	/**
	 * Verifica se l'obiettivo è stato raggiunto nella libreria specificata.
	 *
	 * @param library = la libreria di tessere da verificare
	 * @return true se l'obiettivo è stato raggiunto, false altrimenti
	 */

	@Override
	public boolean verify_goal(Library library) {
		main.Color c = null;
		// control first diagonal
		if (library.getTile(new Position(0, 0)) != null) {
			c = library.getTile(new Position(0, 0)).getColor();
			if (library.getTile(new Position(1, 1)) != null && library.getTile(new Position(1, 1)).getColor() == c) {
				if (library.getTile(new Position(2, 2)) != null
						&& library.getTile(new Position(2, 2)).getColor() == c) {
					if (library.getTile(new Position(3, 3)) != null
							&& library.getTile(new Position(3, 3)).getColor() == c) {
						if (library.getTile(new Position(4, 4)) != null
								&& library.getTile(new Position(4, 4)).getColor() == c) {
							return true;
						}

					}

				}

			}
		}
		// control second diagonal
		if (library.getTile(new Position(0, 1)) != null) {
			c = library.getTile(new Position(0, 1)).getColor();
			if (library.getTile(new Position(1, 2)) != null && library.getTile(new Position(1, 2)).getColor() == c) {
				if (library.getTile(new Position(2, 3)) != null
						&& library.getTile(new Position(2, 3)).getColor() == c) {
					if (library.getTile(new Position(3, 4)) != null
							&& library.getTile(new Position(3, 4)).getColor() == c) {
						if (library.getTile(new Position(4, 5)) != null
								&& library.getTile(new Position(4, 5)).getColor() == c) {
							return true;
						}
					}
				}
			}
		}
		// control third diagonal
		if (library.getTile(new Position(0, 4)) != null) {
			c = library.getTile(new Position(0, 4)).getColor();
			if (library.getTile(new Position(1, 3)) != null && library.getTile(new Position(1, 3)).getColor() == c) {
				if (library.getTile(new Position(2, 2)) != null
						&& library.getTile(new Position(2, 2)).getColor() == c) {
					if (library.getTile(new Position(3, 1)) != null
							&& library.getTile(new Position(3, 1)).getColor() == c) {
						if (library.getTile(new Position(4, 0)) != null
								&& library.getTile(new Position(4, 0)).getColor() == c) {
							return true;
						}
					}
				}
			}
		}
		// control fourth diagonal
		if (library.getTile(new Position(1, 4)) != null) {
			c = library.getTile(new Position(1, 4)).getColor();
			if (library.getTile(new Position(2, 3)) != null && library.getTile(new Position(2, 3)).getColor() == c) {
				if (library.getTile(new Position(3, 2)) != null
						&& library.getTile(new Position(3, 2)).getColor() == c) {
					if (library.getTile(new Position(4, 1)) != null
							&& library.getTile(new Position(4, 1)).getColor() == c) {
						if (library.getTile(new Position(5, 0)) != null
								&& library.getTile(new Position(5, 0)).getColor() == c) {
							return true;
						}
					}
				}
			}
		}

		return false;
	}
}