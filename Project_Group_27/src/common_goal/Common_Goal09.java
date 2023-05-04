package common_goal;

import main.Library;
import main.Position;

public class Common_Goal09 extends Common_Goal{
	
	public Common_Goal09(int Numero_Giocatori) {
		super(Numero_Giocatori);
		this.description="due colonne formate ciascuna da 6 diversi tipi di tessere";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verify_goal(Library libreria) {
		int count=0;
		int controllo=0;
		for (int i=0;i<6;i++)
		{
			for (int k=0;k<7&&controllo==0;k++)
			{
				Position p= new Position(k,i);
				for(int j=k;j<6;j++)
				{
					Position p1= new Position(i,j);
					if(libreria.getTile(p).getColor()==libreria.getTile(p1).getColor())
					{
						controllo=-1;
						break;
					}
				}
			}
			if (controllo==0)
			{
				count++;
			}
			else
			{
				controllo=0;
			}
			if (count==2)
			{
				return true;
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