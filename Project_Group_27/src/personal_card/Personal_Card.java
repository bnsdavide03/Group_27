
/*
 * PERSONAL CARD PADRE
 */

package personal_card;

import java.util.ArrayList;

import main.Library;
import main.Map;
import main.Position;
import main.Tile;

/**
 * classe astratta Personal Card che rappresenta una carta personale.
 */

public abstract class Personal_Card {
	protected ArrayList<Tile> position = new ArrayList<Tile>(); // lista di tile che rappresentano le posizioni sulla libreria.

	/**
	 * Restituisce la lista di tile che rappresentano le posizioni sulla libreria.
	 *
	 * @return La lista di tile che rappresentano le posizioni sulla libreria.
	 */

	public ArrayList<Tile> get_color_position() {
		return this.position;
	}

	/**
	 * Visualizza la carta personale impostando le tile in una libreria e mostrandola.
	 */

	public void Visual_Personal_Card() {
		Library library = new Library();
		for (int i = 0; i < position.size(); i++) {
			library.setTile(position.get(i).getP(), position.get(i));
		}
		library.visualLibrary();
	}
}
