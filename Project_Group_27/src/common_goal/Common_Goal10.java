package common_goal;

import main.Color;
import main.Library;
import main.Position;

public class Common_Goal10 extends Common_Goal{
	
	public Common_Goal10(int nPlayers) {
		super(nPlayers);
		this.description="Due righe formate ciascuna da 5 diversi tipi di tessere";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verify_goal(Library library) {
		int count = 0;

		for (int i = 0; i < 6; i++) {
			int array[] = new int[6];
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
				} else {
					break;
				}
			}
			//se uno è 0, lo mettiamo a uno per far funzionare l'if sottostante, se invece due sono a 0 ritornerà false
			for(int n=0;n<6;n++) {
				if(array[n]==0)
				{
					array[n]++;
					break;
				}
			}
			if (array[0] == 1 && array[1] == 1 && array[2] == 1 && array[3] == 1 && array[4] == 1 && array[5] == 1) {
				count++;
			}
			if (count >= 2) {
				return true;
			}

		}
		return false;
	}

}

