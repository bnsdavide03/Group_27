package common_goal;

import main.Color;
import main.Library;
import main.Position;
import main.Tile;

public class Common_Goal05 extends Common_Goal {

	public Common_Goal05(int nPlayers) {
		super(nPlayers);
		this.description = "Tre colonne formate ciscuna da 6 tessere di uno, due o tre tipi differenti. Colonne diverse possono avere combinazioni diverse di tipi di tessere";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verify_goal(Library library) {
		// library 6x5
		int count = 0;
		for (int i = 0; i < 5; i++) {
			boolean stop = false;
			int t[] = new int[6];
			for (int k = 0; k < 6; k++) {
				Position p1 = new Position(k, i);
				if (library.getTile(p1) != null) {
					if (library.getTile(p1).getColor() == Color.PINK) {
						t[0]++;
					}
					if (library.getTile(p1).getColor() == Color.BLUE) {
						t[1]++;
					}
					if (library.getTile(p1).getColor() == Color.LIGHT_BLUE) {
						t[2]++;
					}
					if (library.getTile(p1).getColor() == Color.GREEN) {
						t[3]++;
					}
					if (library.getTile(p1).getColor() == Color.YELLOW) {
						t[4]++;
					}
					if (library.getTile(p1).getColor() == Color.WHITE) {
						t[5]++;
					}

				} else {
					stop = true;
					break;
				}

			}
			if (stop != true) {
				int count2 = 0;
				for (int n = 0; n < 6; n++) {
					if (t[n] == 0) {
						count2++;
					}
				}
				if (count2 >= 3) {
					count++;
				}
			}
			if (count >= 3) {
				return true;
			}
		}

		return false;
	}
}