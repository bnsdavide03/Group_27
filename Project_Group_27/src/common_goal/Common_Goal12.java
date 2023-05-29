
/**COMMON GOAL n°12 figlia
 * Obiettivo comune n°12.
 * La classe Common_Goal12 rappresenta un obiettivo comune specifico in un gioco.
 * Cinque colonne di altezza crescente o decrescente: a partire dalla prima colonna a sinistra o a destra, ogni colonna successiva deve essere formata da una tessera in più. 
 * Le tessere possono essere di qualsiasi tipo.
 * Questa classe estende la classe Common_Goal.
 */

package common_goal;

import java.util.ArrayList;

import main.Library;
import main.Position;

public class Common_Goal12 extends Common_Goal {

	/**
	 * Costruttore di Common_Goal12 Costruisce un oggetto Common_Goal12 con il
	 * numero specificato di giocatori.
	 * 
	 * @param nPlayers = numero di giocatori.
	 */

	public Common_Goal12(int nPlayers) {
		super(nPlayers);
		this.description = "Five columns of ascending or descending height: Starting with the first column to the left or right, each succeeding column must consist of one more tile. Tiles can be of any type";
	}

	/**
	 * Verifica se l'obiettivo è stato raggiunto nella libreria specificata.
	 *
	 * @param library = la libreria di tessere da verificare
	 * @return true se l'obiettivo è stato raggiunto, false altrimenti
	 */

	@Override
	public boolean verify_goal(Library library) {
		int[] nTilesOnColumns = new int[5];
		nTilesOnColumns[0] = calculateNumberTilesColumn(library, 0);
		nTilesOnColumns[1] = calculateNumberTilesColumn(library, 1);
		nTilesOnColumns[2] = calculateNumberTilesColumn(library, 2);
		nTilesOnColumns[3] = calculateNumberTilesColumn(library, 3);
		nTilesOnColumns[4] = calculateNumberTilesColumn(library, 4);
		if (nTilesOnColumns[0] < nTilesOnColumns[1] && nTilesOnColumns[1] < nTilesOnColumns[2]
				&& nTilesOnColumns[2] < nTilesOnColumns[3] && nTilesOnColumns[3] < nTilesOnColumns[4]) {
			return true;
		} else if (nTilesOnColumns[4] < nTilesOnColumns[3] && nTilesOnColumns[3] < nTilesOnColumns[2]
				&& nTilesOnColumns[2] < nTilesOnColumns[1] && nTilesOnColumns[1] < nTilesOnColumns[0]) {
			return true;
		}
		return false;
	}

	private int calculateNumberTilesColumn(Library library, int column) {
		int nTiles = 0;
		for (int i = 5; i >= 0; i--) {
			if (library.getTile(new Position(i, column)) != null) {
				nTiles++;
			} else {
				// System.out.println("Number tile on column "+column+": "+nTiles);
				return nTiles;
			}
		}
		// System.out.println("Number tile on column "+column+": "+nTiles);
		return nTiles;
	}

}
