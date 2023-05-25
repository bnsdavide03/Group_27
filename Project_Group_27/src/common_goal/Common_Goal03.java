
/**COMMON GOAL n°3 figlia
 * Obiettivo comune n°3.
 * La classe Common_Goal03 rappresenta un obiettivo comune specifico in un gioco.
 * L'obiettivo consiste nel formare quattro gruppi separati, ciascuno composto da quattro tessere adiacenti dello stesso tipo.
 * Le tessere di un gruppo possono essere diverse da quelle di un altro gruppo.
 * Questa classe estende la classe Common_Goal.
 */

package common_goal;

import main.Library;
import main.Position;
import main.Tile;

public class Common_Goal03 extends Common_Goal {

	/**
	 * Costruttore per Common_Goal03 Costruisce un oggetto Common_Goal03 con il
	 * numero specificato di giocatori.
	 * 
	 * @param nPlayers
	 */

	public Common_Goal03(int nPlayers) {
		super(nPlayers);
		this.description = "quattro gruppi separati formati ciascuno da quattro tessere adiacenti dello stesso tipo. Le tessere di un gruppo possono essere diverse da quelle di un altro gruppo.";
	}

	/**
	 * Verifica se l'obiettivo è stato raggiunto nella libreria specificata.
	 *
	 * @param library = la libreria di tessere da verificare
	 * @return true se l'obiettivo è stato raggiunto, altrimenti false
	 */

	@Override
	public boolean verify_goal(Library library) {

		Library virtualLibrary = new Library(library);
		// private Tile virtualLibrary[][]= new Tile[6][5];
		int count = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				// System.out.println("riga: " + i + " colonna: " + j + " posizione");
				Tile t1 = virtualLibrary.getTile(new Position(i, j));
				if (t1 != null) {

					// System.out.println(t1.getColor() + "questo è il colore");
					if (i < 3 || j < 2) // verificare utilità
					{
						if (i < 3) {
							if (virtualLibrary.getTile(new Position(i + 1, j)) != null
									&& virtualLibrary.getTile(new Position(i + 2, j)) != null
									&& virtualLibrary.getTile(new Position(i + 3, j)) != null) {
								if (t1.getColor() == virtualLibrary.getTile(new Position(i + 1, j)).getColor()
										&& t1.getColor() == virtualLibrary.getTile(new Position(i + 2, j)).getColor()
										&& t1.getColor() == virtualLibrary.getTile(new Position(i + 3, j)).getColor()) {
									count++;
									// System.out.println("Count: "+count);
									remove_adjacency(virtualLibrary, new Position(i, j),
											virtualLibrary.getTile(new Position(i, j)).getColor());
									// virtualLibrary.visualLibrary();
								}
							}

						}

						if (j < 2) {
							if (virtualLibrary.getTile(new Position(i, j + 1)) != null
									&& virtualLibrary.getTile(new Position(i, j + 2)) != null
									&& virtualLibrary.getTile(new Position(i, j + 3)) != null) {
								if (t1.getColor() == virtualLibrary.getTile(new Position(i, j + 1)).getColor()
										&& t1.getColor() == virtualLibrary.getTile(new Position(i, j + 2)).getColor()
										&& t1.getColor() == virtualLibrary.getTile(new Position(i, j + 3)).getColor()) {
									count++;
									// System.out.println("Count: "+count);
									remove_adjacency(virtualLibrary, new Position(i, j), t1.getColor());
									// virtualLibrary.visualLibrary();
								}
							}

						}
					}

				}
			}
		}

		if (count >= 4) {
			return true;
		}

		return false;
	}
}