
/**COMMON GOAL n°11 figlia
 * Obiettivo comune n°11.
 * La classe Common_Goal11 rappresenta un obiettivo comune specifico in un gioco.
 * Cinque tessere dello stesso tipo che formano una X.
 * Questa classe estende la classe Common_Goal.
 */

package common_goal;

import main.Library;
import main.Position;

public class Common_Goal11 extends Common_Goal {

	/**
	 * Costruttore di Common_Goal11 Costruisce un oggetto Common_Goal11 con il
	 * numero specificato di giocatori.
	 * 
	 * @param nPlayers = numero di giocatori.
	 */

	public Common_Goal11(int nPlayers) {
		super(nPlayers);
		this.description = "Cinque tessere dello stesso tipo che formano una X";
	}

	/**
	 * Verifica se l'obiettivo è stato raggiunto nella libreria specificata.
	 *
	 * @param library = la libreria di tessere da verificare
	 * @return true se l'obiettivo è stato raggiunto, false altrimenti
	 */

	@Override
	public boolean verify_goal(Library library) {
		for (int i = 0; i < 3; i++)// colonna
		{
			for (int k = 0; k < 4; k++)// riga
			{
				if (library.getTile(new Position(k, i)) != null && library.getTile(new Position(k, i + 2)) != null
						&& library.getTile(new Position(k + 1, i + 1)) != null
						&& library.getTile(new Position(k + 2, i)) != null
						&& library.getTile(new Position(k + 2, i + 2)) != null) {
					if (library.getTile(new Position(k, i)).getColor() == library.getTile(new Position(k, i + 2))
							.getColor()
							&& library.getTile(new Position(k, i)).getColor() == library
									.getTile(new Position(k + 1, i + 1)).getColor()
							&& library.getTile(new Position(k, i)).getColor() == library.getTile(new Position(k + 2, i))
									.getColor()
							&& library.getTile(new Position(k, i)).getColor() == library
									.getTile(new Position(k + 2, i + 2)).getColor()) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
