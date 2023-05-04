package common_goal;

public class Common_Goal03 extends Common_Goal{
	
	public Common_Goal03(int Numero_Giocatori) {
		super(Numero_Giocatori);
		this.description="quattro gruppi separaati formati ciascuno da quattro tessere adiacenti dello stesso tipo. Le tessere di un gruppo possono essere diverse da quelle di un altro gruppo.";
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public int verify_goal() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void getRemaningCards() {
		for(int i=0; i<4;i++) {
			System.out.println(this.remaningCards[i]);
		
	}

	}

	@Override
	public String getDescription() {
		return this.description;
	}

}