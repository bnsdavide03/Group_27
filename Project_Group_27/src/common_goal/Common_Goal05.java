
/**COMMON GOAL n°5 figlia
 * Obiettivo comune n°5.
 * La classe Common_Goal05 rappresenta un obiettivo comune specifico in un gioco.
 * Tre colonne formate ciscuna da 6 tessere di uno, due o tre tipi differenti. 
 * Colonne diverse possono avere combinazioni diverse di tipi di tessere.
 * Questa classe estende la classe Common_Goal.
 */

package common_goal;

import main.Color;
import main.Library;
import main.Position;
import main.Tile;

public class Common_Goal05 extends Common_Goal {

	/**
	 * Costruttore per Common_Goal05 Costruisce un oggetto Common_Goal05 con il
	 * numero specificato di giocatori.
	 * 
	 * @param nPlayers = numero di giocatori
	 */

	public Common_Goal05(int nPlayers) {
		super(nPlayers);
		this.description = "Three columns formed each by 6 tiles of one, two or three different types. Different columns can have different combinations of tile types";
	}

	/**
	 * Verifica se l'obiettivo specifico è stato raggiunto nella libreria.
	 *
	 * @param library = la libreria da verificare.
	 * @return true se l'obiettivo è stato raggiunto, false altrimenti.
	 */

	@Override
	public boolean verify_goal(Library library) {
		// library 6x5
		int count = 0;
		for (int i = 0; i < 5; i++) {
			boolean stop = false;
			int t[] = new int[6];
			for (int k = 0; k < 6; k++) {
				Position p1 = new Position(k, i);
				if (library.getTile(p1) != null) {
					if (library.getTile(p1).getColor() == Color.PINK) {
						t[0]++;
					}
					if (library.getTile(p1).getColor() == Color.BLUE) {
						t[1]++;
					}
					if (library.getTile(p1).getColor() == Color.L_BLUE) {
						t[2]++;
					}
					if (library.getTile(p1).getColor() == Color.GREEN) {
						t[3]++;
					}
					if (library.getTile(p1).getColor() == Color.YELLOW) {
						t[4]++;
					}
					if (library.getTile(p1).getColor() == Color.WHITE) {
						t[5]++;
					}

				} else {
					stop = true;
					break;
				}

			}
			if (stop != true) {
				int count2 = 0;
				for (int n = 0; n < 6; n++) {
					if (t[n] == 0) {
						count2++;
					}
				}
				if (count2 >= 3) {
					count++;
				}
			}
			if (count >= 3) {
				return true;
			}
		}

		return false;
	}
}