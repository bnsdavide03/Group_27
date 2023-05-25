
/**
 * PERSONAL CARD n°1 figlia
 */

package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

/**
 * La classe Personal_Card01 rappresenta una specifica carta personale. 
 * Estende la classe Personal_Card e implementa una configurazione predefinita delle
 * posizioni dei tile sulla libreria.
 */

public class Personal_Card01 extends Personal_Card {

	/**
	 * Costruttore di Personal_Card01. 
	 * Inizializza la configurazione predefinita delle posizioni dei tile sulla libreria.
	 */

	public Personal_Card01() 
	{
		position.add(new Tile(new Position(0, 1), Color.L_BLUE));
		position.add(new Tile(new Position(2, 1), Color.YELLOW));
		position.add(new Tile(new Position(3, 3), Color.WHITE));
		position.add(new Tile(new Position(4, 4), Color.GREEN));
		position.add(new Tile(new Position(5, 0), Color.PINK));
		position.add(new Tile(new Position(5, 2), Color.BLUE));
	}
}
