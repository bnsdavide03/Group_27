
/**
 * PERSONAL CARD n°11 figlia
 */

package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

/**
 * La classe Personal_Card11 rappresenta una specifica carta personale. 
 * Estende la classe Personal_Card e implementa una configurazione predefinita delle
 * posizioni dei tile sulla libreria.
 */

public class Personal_Card11 extends Personal_Card {
	
	/**
	 * Costruttore di Personal_Card11. 
	 * Inizializza la configurazione predefinita delle posizioni dei tile sulla libreria.
	 */
	
	public Personal_Card11()
	{
		position.add(new Tile(new Position(0,3),Color.L_BLUE));
		position.add(new Tile(new Position(3,0),Color.YELLOW));
		position.add(new Tile(new Position(4,1),Color.WHITE));
		position.add(new Tile(new Position(1,4),Color.GREEN));
		position.add(new Tile(new Position(5,2),Color.PINK));
		position.add(new Tile(new Position(2,2),Color.BLUE));
	}
}
