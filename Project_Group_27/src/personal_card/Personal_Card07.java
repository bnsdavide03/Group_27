
/**
 * PERSONAL CARD n°7 figlia
 */

package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

/**
 * La classe Personal_Card07 rappresenta una specifica carta personale. 
 * Estende la classe Personal_Card e implementa una configurazione predefinita delle
 * posizioni dei tile sulla libreria.
 */

public class Personal_Card07 extends Personal_Card {
	
	/**
	 * Costruttore di Personal_Card07. 
	 * Inizializza la configurazione predefinita delle posizioni dei tile sulla libreria.
	 */
	
	public Personal_Card07()
	{
		position.add(new Tile(new Position(2,0),Color.L_BLUE));
		position.add(new Tile(new Position(1,4),Color.YELLOW));
		position.add(new Tile(new Position(0,2),Color.WHITE));
		position.add(new Tile(new Position(5,0),Color.GREEN));
		position.add(new Tile(new Position(3,1),Color.PINK));
		position.add(new Tile(new Position(4,3),Color.BLUE));
	}
}
