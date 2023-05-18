package common_goal;

import main.Color;
import main.Library;
import main.Position;

public class Common_Goal06 extends Common_Goal {

	public Common_Goal06(int nPlayers) {
		super(nPlayers);
		this.description = "Otto tessere dello stesso tipo. Non ci sono restrizioni sulla posizione di queste tessere";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verify_goal(Library library) {
		int array[] = new int[6];
		for (int i = 0; i < 6; i++) {
			for (int k = 0; k < 5; k++) {
				Position p = new Position(i, k);
				if (library.getTile(p) != null) {
					if (library.getTile(p).getColor() == Color.PINK) {
						array[0]++;
					} else if (library.getTile(p).getColor() == Color.BLUE) {
						array[1]++;
					} else if (library.getTile(p).getColor() == Color.L_BLUE) {
						array[2]++;
					} else if (library.getTile(p).getColor() == Color.GREEN) {
						array[3]++;
					} else if (library.getTile(p).getColor() == Color.YELLOW) {
						array[4]++;
					} else if (library.getTile(p).getColor() == Color.WHITE) {
						array[5]++;
					}
				}
				for (int j = 0; j < 6; j++) {
					if (array[j] > 7) {
						return true;
					}
				}
			}
		}
		return false;
	}
}