
/**
 * PERSONAL CARD n°9 figlia
 */

package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

/**
 * La classe Personal_Card09 rappresenta una specifica carta personale. 
 * Estende la classe Personal_Card e implementa una configurazione predefinita delle
 * posizioni dei tile sulla libreria.
 */

public class Personal_Card09 extends Personal_Card {
	
	/**
	 * Costruttore di Personal_Card09. 
	 * Inizializza la configurazione predefinita delle posizioni dei tile sulla libreria.
	 */
	
	public Personal_Card09()
	{
		position.add(new Tile(new Position(1,1),Color.L_BLUE));
		position.add(new Tile(new Position(5,2),Color.YELLOW));
		position.add(new Tile(new Position(2,4),Color.WHITE));
		position.add(new Tile(new Position(3,2),Color.GREEN));
		position.add(new Tile(new Position(1,4),Color.PINK));
		position.add(new Tile(new Position(0,0),Color.BLUE));
	}
}
