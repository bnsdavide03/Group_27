package common_goal;

public class Common_Goal01 extends Common_Goal{
	
	public Common_Goal01(int Numero_Giocatori) {
		super(Numero_Giocatori);
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
		this.description="Sei gruppi separati formati ciascuno da duetessere adiacenti dello stesso tipo. le tessere di un gruppo possono essere diverse da quelle di un altro gruppo";
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public int verify_goal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
