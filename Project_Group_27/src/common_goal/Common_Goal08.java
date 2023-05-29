
/**COMMON GOAL n°8 figlia
 * Obiettivo comune n°8.
 * La classe Common_Goal08 rappresenta un obiettivo comune specifico in un gioco.
 * Quattro righe formate ciascuna da 5 tessere di uno, due o tre tipi differenti. 
 * Righe diverse possono avere combinazioni diverse di tipi di tessere.
 * Questa classe estende la classe Common_Goal.
 */

package common_goal;

import main.Color;
import main.Library;
import main.Position;
import main.Tile;

public class Common_Goal08 extends Common_Goal {

	/**
	 * Costruttore di Common_Goal08 Costruisce un oggetto Common_Goal08 con il
	 * numero specificato di giocatori.
	 * 
	 * @param nPlayers = numero di giocatori.
	 */

	public Common_Goal08(int nPlayers) {
		super(nPlayers);
		this.description = "Quattro righe formate ciascuna da 5 tessere di uno, due o tre tipi differenti. Righe diverse possono avere combinazioni diverse di tipi di tessere";
	}

	/**
	 * Verifica se l'obiettivo è stato raggiunto nella libreria specificata.
	 *
	 * @param library = la libreria di tessere da verificare
	 * @return true se l'obiettivo è stato raggiunto, false altrimenti
	 */

	@Override
	public boolean verify_goal(Library library) {
		// library 6x5
		int count = 0;
		for (int i = 0; i < 6; i++) {
			boolean stop = false;
			int t[] = new int[6];
			for (int k = 0; k < 5; k++) {
				Position p1 = new Position(i, k);
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
			if (count >= 4) {
				return true;
			}
		}

		return false;
	}
}