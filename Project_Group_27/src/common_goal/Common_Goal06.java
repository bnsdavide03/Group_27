package common_goal;

public class Common_Goal06 extends Common_Goal{
	
	public Common_Goal06(int Numero_Giocatori) {
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
		this.description="Otto tessere dello stesso tipo. Non ci sono restrizioni sulla posizione di queste tessere";
		// TODO Auto-generated constructor stub
	}

	@Override
	public int verify_goal() {
		// TODO Auto-generated method stub
		return 0;
	}

}