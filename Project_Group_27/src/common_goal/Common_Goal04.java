
/**COMMON GOAL n°4 figlia
 * Obiettivo comune n°4.
 * La classe Common_Goal04 rappresenta un obiettivo comune specifico in un gioco.
 * L'obiettivo consiste nel formare due gruppi separati di 4 tessere dello stesso tipo che formano un quadrato 2x2. 
 * Le tessere dei due gruppo devono essere dello stesso tipo.
 * Questa classe estende la classe Common_Goal.
 */

package common_goal;

import main.Library;
import main.Position;
import main.Tile;
import main.Color;

public class Common_Goal04 extends Common_Goal{

	/**
	 * Costruttore per Common_Goal04
	 * Costruisce un oggetto Common_Goal04 con il numero specificato di giocatori.
	 * 
	 * @param nPlayers
	 */

	public Common_Goal04(int nPlayers) {
		super(nPlayers);
		this.description="Due gruppi separati di 4 tessere dello stesso tipo che formano un quadrato 2x2. Le tessere dei due gruppo devono essere dello stesso tipo";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verify_goal(Library library) {

		Library virtualLibrary = new Library(library);
		// private Tile virtualLibrary[][]= new Tile[6][5];
		
		int quantità_quadrati_colore[]=new int[6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				//System.out.println("riga: " + i + " colonna: " + j + " posizione");
				Tile t1 = virtualLibrary.getTile(new Position(i, j));
				if (t1 != null) {

					//System.out.println(t1.getColor() + "questo è il colore");
					if (i < 5&&j<4) {
						
							if (virtualLibrary.getTile(new Position(i + 1, j)) != null&&virtualLibrary.getTile(new Position(i + 1, j+1)) != null&&virtualLibrary.getTile(new Position(i , j+1)) != null)
							{
								if (t1.getColor() == virtualLibrary.getTile(new Position(i + 1, j)).getColor()&&t1.getColor() == virtualLibrary.getTile(new Position(i + 1, j+1)).getColor()&&t1.getColor() == virtualLibrary.getTile(new Position(i , j+1)).getColor()) {
									
									
									if(t1.getColor()==Color.BLUE)
									{
										quantità_quadrati_colore[0]++;
									}
									else if(t1.getColor()==Color.GREEN)
									{
										quantità_quadrati_colore[1]++;
									}
									else if(t1.getColor()==Color.L_BLUE)
									{
										quantità_quadrati_colore[2]++;
									}
									else if(t1.getColor()==Color.PINK)
									{
										quantità_quadrati_colore[3]++;
									}
									else if(t1.getColor()==Color.WHITE)
									{
										quantità_quadrati_colore[4]++;
									}
									else if(t1.getColor()==Color.YELLOW)
									{
										quantità_quadrati_colore[5]++;
									}
									
									//System.out.println("Count: "+count);
									remove_adjacency(virtualLibrary, new Position(i, j),
									virtualLibrary.getTile(new Position(i, j)).getColor());
									virtualLibrary.visualLibrary();
								}
							}
						
						/*if(j<4)
						{
							if (virtualLibrary.getTile(new Position(i, j + 1)) != null) {
								if (t1.getColor() == virtualLibrary.getTile(new Position(i, j + 1)).getColor()) {
									count++;
									//System.out.println("Count: "+count);
									remove_adjacency(virtualLibrary, new Position(i, j), t1.getColor());
									//virtualLibrary.visualLibrary();
								}
							}
						}*/
					}

				}
			}
		}

		for(int i=0;i<6;i++) {
			if(quantità_quadrati_colore[i]>=2)
			{
				return true;
			}
			
		}

		return false;
	}
}