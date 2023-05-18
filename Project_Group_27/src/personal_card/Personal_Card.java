package personal_card;

import java.util.ArrayList;

import main.Library;
import main.Map;
import main.Position;
import main.Tile;

public abstract class Personal_Card {
	protected ArrayList<Tile> position = new ArrayList<Tile>();

	public ArrayList<Tile> get_color_position() {
		return this.position;
	}

	public void Visual_Personal_Card() {
		Library library = new Library();
		for (int i = 0; i < position.size(); i++) {
			library.setTile(position.get(i).getP(), position.get(i));
		}
		library.visualLibrary();
	}

	public int calcolaPunti(Map map) {
		int count = 0;
		for (int i = 0; i < 6; i++) {
			if (position.get(i)
					.getColor() == (map
							.getTile(new Position(position.get(i).getP().getX(), position.get(i).getP().getY())))
							.getColor()) {
				count++;
			}
		}
		switch (count) {
		case 1:
			return 1;

		case 2:
			return 2;

		case 3:
			return 4;

		case 4:
			return 6;

		case 5:
			return 9;

		case 6:
			return 12;

		}
		return 0;
	}

}
