package common_goal;

import main.Color;
import main.Library;
import main.Position;
import main.Tile;

public class Common_Goal05 extends Common_Goal{
	
	public Common_Goal05(int Numero_Giocatori) {
		super(Numero_Giocatori);
		this.description="Tre colonne formate ciscuna da 6 tessere di uno, due o tre tipi differenti. Colonne diverse possono avere combinazioni diverse di tipi di tessere";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verify_goal(Library libreria) {
		// libreria 6x5
		Tile t[]=new Tile[2];
		for(int i=0;i<7;i++)
		{
			for(int k=0;k<6;k++)
			{
				Position p1=new Position(i,k);
				if(libreria.getTile(p1).getColor()!=t[1].getColor()&&libreria.getTile(p1).getColor()!=t[2].getColor()&&libreria.getTile(p1).getColor()!=t[2].getColor())
				{
					
					for (int j=0;j<3;j++)
					{
						if(t[j].getColor()==null)
						{
							t[j]=libreria.getTile(p1);
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

}