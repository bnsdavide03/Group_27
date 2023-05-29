
/**COMMON GOAL n°9 figlia
 * Obiettivo comune n°9.
 * La classe Common_Goal09 rappresenta un obiettivo comune specifico in un gioco.
 * Due colonne formate ciascuna da 6 diversi tipi di tessere
 * Questa classe estende la classe Common_Goal.
 */

package common_goal;

import main.Color;
import main.Library;
import main.Position;

public class Common_Goal09 extends Common_Goal {

	/**
	 * Costruttore di Common_Goal09 Costruisce un oggetto Common_Goal09 con il
	 * numero specificato di giocatori.
	 * 
	 * @param nPlayers = numero di giocatori.
	 */

	public Common_Goal09(int nPlayers) {
		super(nPlayers);
		this.description = "due colonne formate ciascuna da 6 diversi tipi di tessere";
	}

	/**
	 * Verifica se l'obiettivo è stato raggiunto nella libreria specificata.
	 *
	 * @param library = la libreria di tessere da verificare
	 * @return true se l'obiettivo è stato raggiunto, false altrimenti
	 */

	@Override
	public boolean verify_goal(Library library) {
		int count = 0;

		for (int i = 0; i < 5; i++) {
			int array[] = new int[6];
			for (int k = 0; k < 6; k++) {
				Position p = new Position(k, i);
				if (library.getTile(p) != null) {
					if (library.getTile(p).getColor() == Color.PINK) {
						array[0]++;
					} else if (library.getTile(p).getColor() == Color.BLUE) {
						array[1]++;
					} else if (library.getTile(p).getColor() == Color.L_BLUE) {
						array[2]++;
					} else if (library.getTile(p).getColor() == Color.GREEN) {
						array[3]++;
					} else if (library.getTile(p).getColor() == Color.YELLOW) {
						array[4]++;
					} else if (library.getTile(p).getColor() == Color.WHITE) {
						array[5]++;
					}
				} else {
					break;
				}
			}
			if (array[0] == 1 && array[1] == 1 && array[2] == 1 && array[3] == 1 && array[4] == 1 && array[5] == 1) {
				count++;
			}
			if (count >= 2) {
				return true;
			}

		}
		return false;
	}
}