package common_goal;

import main.Library;

public class Common_Goal01 extends Common_Goal{
	
	public Common_Goal01(int Numero_Giocatori) {
		super(Numero_Giocatori);
		this.description="Sei gruppi separati formati ciascuno da duetessere adiacenti dello stesso tipo. le tessere di un gruppo possono essere diverse da quelle di un altro gruppo";
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verify_goal(Library libreria) {
		// libreria 6x5
		for(int i=0;i<7;i++)
		{
			for(int k=0;k<6;k++)
			{
				
			}
		}
		return false;
	}

}
