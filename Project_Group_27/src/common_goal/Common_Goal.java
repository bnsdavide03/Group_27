package common_goal;

import main.Library;

public abstract class Common_Goal {
		

	protected String description;
	protected int remaningCards[]=new int[4];
	
	
	public Common_Goal(int nPlayers)
	{
		this.remaningCards[1]=4;
		this.remaningCards[3]=8;
		if(nPlayers>2)
		{
			this.remaningCards[2]=6;
		}
		if(nPlayers==4)
		{
			this.remaningCards[0]=2;
		}
		
	}
	public abstract boolean verify_goal(Library library);
	
	public abstract String getDescription();
		
	public abstract void getRemaningCards();
	
}
