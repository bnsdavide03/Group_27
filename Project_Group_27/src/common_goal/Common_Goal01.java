package common_goal;

import main.Library;
import main.Tile;
import main.Position;

public class Common_Goal01 extends Common_Goal {

	public Common_Goal01(int nPlayers) {
		super(nPlayers);
		this.description = "Sei gruppi separati formati ciascuno da due tessere adiacenti dello stesso tipo. Le tessere di un gruppo possono essere diverse da quelle di un altro gruppo";

		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verify_goal(Library library) {

		Library virtualLibrary = new Library();
		// private Tile virtualLibrary[][]= new Tile[6][5];
		virtualLibrary = library;
		int count = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				//System.out.println("riga: " + i + " colonna: " + j + " posizione");
				Tile t1 = virtualLibrary.getTile(new Position(i, j));
				if (t1 != null) {

					//System.out.println(t1.getColor() + "questo è il colore");
					if (i < 5||j<4) {
						if(i<5)
						{
							if (virtualLibrary.getTile(new Position(i + 1, j)) != null) {
								if (t1.getColor() == virtualLibrary.getTile(new Position(i + 1, j)).getColor()) {
									count++;
								//	System.out.println("Count: "+count);
									remove_adjacency(virtualLibrary, new Position(i, j),
											virtualLibrary.getTile(new Position(i, j)).getColor());
								//	virtualLibrary.visualLibrary();
								}
							}
						}
						if(j<4)
						{
							if (virtualLibrary.getTile(new Position(i, j + 1)) != null) {
								if (t1.getColor() == virtualLibrary.getTile(new Position(i, j + 1)).getColor()) {
									count++;
									//System.out.println("Count: "+count);
									remove_adjacency(virtualLibrary, new Position(i, j), t1.getColor());
									//virtualLibrary.visualLibrary();
								}
							}
						}
					}

				}
			}
		}

		if (count >= 6) {
			return true;
		}

		return false;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public void getRemaningCards() {
		for (int i = 0; i < 4; i++) {
			System.out.println(this.remaningCards[i]);
		}
	}

}
