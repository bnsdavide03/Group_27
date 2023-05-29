
/**COMMON GOAL n°6 figlia
 * Obiettivo comune n°6.
 * La classe Common_Goal06 rappresenta un obiettivo comune specifico in un gioco.
 * Otto tessere dello stesso tipo. 
 * Non ci sono restrizioni sulla posizione di queste tessere.
 * Questa classe estende la classe Common_Goal.
 */

package common_goal;

import main.Color;
import main.Library;
import main.Position;

public class Common_Goal06 extends Common_Goal {

	/**
	 * Costruttore di Common_Goal06 Costruisce un oggetto Common_Goal06 con il
	 * numero specificato di giocatori.
	 * 
	 * @param nPlayers = numero di giocatori.
	 */

	public Common_Goal06(int nPlayers) {
		super(nPlayers);
		this.description = "Eight tiles of the same type. There are no restrictions on the location of these tiles";
	}

	/**
	 * Verifica se l'obiettivo è stato raggiunto nella libreria specificata.
	 *
	 * @param library = la libreria di tessere da verificare
	 * @return true se l'obiettivo è stato raggiunto, false altrimenti
	 */

	@Override
	public boolean verify_goal(Library library) {
		int array[] = new int[6];
		for (int i = 0; i < 6; i++) {
			for (int k = 0; k < 5; k++) {
				Position p = new Position(i, k);
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
				}
				for (int j = 0; j < 6; j++) {
					if (array[j] > 7) {
						return true;
					}
				}
			}
		}
		return false;
	}
}