package common_goal;

import main.Library;
import main.Position;
import main.Color;
import main.Tile;

public abstract class Common_Goal {

	protected String description;
	protected int remaningCards[] = new int[4];

	public Common_Goal(int nPlayers) {
		this.remaningCards[1] = 4;
		this.remaningCards[3] = 8;
		if (nPlayers > 2) {
			this.remaningCards[2] = 6;
		}
		if (nPlayers == 4) {
			this.remaningCards[0] = 2;
		}

	}

	public Library remove_adjacency(Library library, Position t1, Color c) {
		
		if (t1.getX() + 1 < 6) {
			if (library.getTile(new Position(t1.getX() + 1, t1.getY())) != null) {
				if (library.getTile(new Position(t1.getX() + 1, t1.getY())).getColor() == c) {
					library.setTile(t1, null);
					library.setTile(new Position(t1.getX() + 1, t1.getY()), null);
					remove_adjacency(library, new Position(t1.getX() + 1, t1.getY()), c);
					library.visualLibrary();
				}
			}
		}
		if (t1.getY() + 1 < 5) {
			if (library.getTile(new Position(t1.getX(), t1.getY() + 1)) != null) {
				if (library.getTile(new Position(t1.getX(), t1.getY() + 1)).getColor() == c) {
					library.setTile(t1, null);
					library.setTile(new Position(t1.getX(), t1.getY() + 1), null);

					remove_adjacency(library, new Position(t1.getX(), t1.getY() + 1), c);
					library.visualLibrary();
				}
			}
		}
		
		if (t1.getY() - 1 >= 0) {
			if (library.getTile(new Position(t1.getX(), t1.getY() - 1)) != null) {
				if (library.getTile(new Position(t1.getX(), t1.getY() -1 )).getColor() == c) {
					library.setTile(t1, null);
					library.setTile(new Position(t1.getX(), t1.getY() -1 ), null);

					remove_adjacency(library, new Position(t1.getX(), t1.getY() -1), c);
					library.visualLibrary();
				}
			}
		}

		return library;

	}

	public abstract boolean verify_goal(Library library);

	public String getDescription() {
		return this.description;
	}


	public int givePoints() {
		for (int i=0; i<4; i++) {
			if(this.remaningCards[3-i]!=0) {
				int n= this.remaningCards[3-i];
				this.remaningCards[3-i]=0;
				return n;
			}
		}
		return 0;
	}

}
