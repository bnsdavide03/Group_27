
/**
 * PERSONAL CARD n°4 figlia
 */

package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

/**
 * La classe Personal_Card04 rappresenta una specifica carta personale. 
 * Estende la classe Personal_Card e implementa una configurazione predefinita delle
 * posizioni dei tile sulla libreria.
 */

public class Personal_Card04 extends Personal_Card {
	
	/**
	 * Costruttore di Personal_Card04. 
	 * Inizializza la configurazione predefinita delle posizioni dei tile sulla libreria.
	 */
	
	public Personal_Card04()
	{
		position.add(new Tile(new Position(3,0),Color.L_BLUE));
		position.add(new Tile(new Position(5,4),Color.YELLOW));
		position.add(new Tile(new Position(1,1),Color.WHITE));
		position.add(new Tile(new Position(1,2),Color.GREEN));
		position.add(new Tile(new Position(2,3),Color.PINK));
		position.add(new Tile(new Position(3,2),Color.BLUE));
	}
}
