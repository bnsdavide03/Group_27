
/**
 * PERSONAL CARD n°10 figlia
 */

package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

/**
 * La classe Personal_Card10 rappresenta una specifica carta personale. 
 * Estende la classe Personal_Card e implementa una configurazione predefinita delle
 * posizioni dei tile sulla libreria.
 */

public class Personal_Card10 extends Personal_Card {
	
	/**
	 * Costruttore di Personal_Card10. 
	 * Inizializza la configurazione predefinita delle posizioni dei tile sulla libreria.
	 */
	
	public Personal_Card10()
	{
		position.add(new Tile(new Position(5,4),Color.L_BLUE));
		position.add(new Tile(new Position(4,1),Color.YELLOW));
		position.add(new Tile(new Position(3,0),Color.WHITE));
		position.add(new Tile(new Position(2,3),Color.GREEN));
		position.add(new Tile(new Position(0,3),Color.PINK));
		position.add(new Tile(new Position(1,1),Color.BLUE));
	}
}
