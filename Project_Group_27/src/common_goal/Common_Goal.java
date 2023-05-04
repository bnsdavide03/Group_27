package common_goal;

import main.Library;

public abstract class Common_Goal {
		

	protected String description;
	protected int remaningCards[];
	
	
	public Common_Goal(int Numero_Giocatori)
	{
		this.remaningCards[1]=4;
		this.remaningCards[3]=8;
		if(Numero_Giocatori>2)
		{
			this.remaningCards[2]=6;
		}
		if(Numero_Giocatori==4)
		{
			this.remaningCards[0]=2;
		}
		
	}
	public abstract boolean verify_goal(Library libreria);
	{
		
	}
}
