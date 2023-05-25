
/**
 * PERSONAL CARD n°3 figlia
 */

package personal_card;

import java.util.ArrayList;

import main.Color;
import main.Tile;
import main.Position;

/**
 * La classe Personal_Card03 rappresenta una specifica carta personale. 
 * Estende la classe Personal_Card e implementa una configurazione predefinita delle
 * posizioni dei tile sulla libreria.
 */

public class Personal_Card03 extends Personal_Card {
	
	/**
	 * Costruttore di Personal_Card03. 
	 * Inizializza la configurazione predefinita delle posizioni dei tile sulla libreria.
	 */
	
	public Personal_Card03()
	{
		position.add(new Tile(new Position(2,4),Color.L_BLUE));
		position.add(new Tile(new Position(4,3),Color.YELLOW));
		position.add(new Tile(new Position(0,0),Color.WHITE));
		position.add(new Tile(new Position(2,1),Color.GREEN));
		position.add(new Tile(new Position(3,2),Color.PINK));
		position.add(new Tile(new Position(4,0),Color.BLUE));
	}
}
