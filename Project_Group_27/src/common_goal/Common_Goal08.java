package common_goal;

import main.Library;
import main.Position;
import main.Tile;

public class Common_Goal08 extends Common_Goal{
	
	public Common_Goal08(int nPlayers) {
		super(nPlayers);
		this.description="Quattro righe formate ciascuna da 5 tessere di uno, due o tre tipi differenti. Righediverse possono avere combinazioni diversedi tipi di tessere";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verify_goal(Library library) {
		// library 6x5
		Tile t[]=new Tile[2];
		for(int i=0;i<7;i++)
		{
			for(int k=0;k<6;k++)
			{
				Position p1=new Position(k,i);
				if(library.getTile(p1).getColor()!=t[1].getColor()&&library.getTile(p1).getColor()!=t[2].getColor()&&library.getTile(p1).getColor()!=t[2].getColor())
				{
					
					for (int j=0;j<3;j++)
					{
						if(t[j].getColor()==null)
						{
							t[j]=library.getTile(p1);
						}
						else if(j==2)
						{
							return false;
						}
					}
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public void getRemaningCards() {
		for (int i=0; i<4; i++) {
			System.out.println(this.remaningCards[i]);
		}
	}

}