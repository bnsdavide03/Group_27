package common_goal;

public class Common_Goal01 extends Common_Goal{
	
	public Common_Goal01(int Numero_Giocatori) {
		super(Numero_Giocatori);
		this.description="Sei gruppi separati formati ciascuno da duetessere adiacenti dello stesso tipo. le tessere di un gruppo possono essere diverse da quelle di un altro gruppo";
		
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
	}}
