
/**COMMON GOAL n°2 figlia
 * Obiettivo comune n°2.
 * La classe Common_Goal02 rappresenta un obiettivo comune specifico in un gioco.
 * L'obiettivo consiste nel formare quattro tessere dello stesso tipo ai quattro angoli della libreria.
 * Le tessere di un gruppo possono essere diverse da quelle di un altro gruppo.
 * Questa classe estende la classe Common_Goal.
 */

package common_goal;

import main.Library;
import main.Position;

public class Common_Goal02 extends Common_Goal {

	/**
	 * Costruttore per Common_Goal02. Costruisce un oggetto Common_Goal02 con il
	 * numero specificato di giocatori.
	 *
	 * @param nPlayers il numero di giocatori
	 */

	public Common_Goal02(int nPlayers) {
		super(nPlayers);
		this.description = "four tiles of the same type at the four corners of the bookcase";

	}

	/**
	 * Verifica se l'obiettivo è stato raggiunto nella libreria specificata.
	 *
	 * @param library = la libreria di tessere da verificare
	 * @return true se l'obiettivo è stato raggiunto, altrimenti false
	 */

	@Override
	public boolean verify_goal(Library library) {
		Position p1 = new Position(0, 0);
		Position p2 = new Position(0, 4);
		Position p3 = new Position(5, 0);
		Position p4 = new Position(5, 4);
		if (library.getTile(p1) != null && library.getTile(p2) != null && library.getTile(p3) != null
				&& library.getTile(p4) != null) {
			if (library.getTile(p1).getColor() == library.getTile(p2).getColor()
					&& library.getTile(p2).getColor() == library.getTile(p3).getColor()
					&& library.getTile(p3).getColor() == library.getTile(p4).getColor()) {
				return true;
			}
		}
		return false;
	}
}