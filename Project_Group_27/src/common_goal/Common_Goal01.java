package common_goal;

import main.Library;

public class Common_Goal01 extends Common_Goal{
	
	public Common_Goal01(int nPlayers) {
		super(nPlayers);
		this.description="Sei gruppi separati formati ciascuno da due tessere adiacenti dello stesso tipo. Le tessere di un gruppo possono essere diverse da quelle di un altro gruppo";
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verify_goal(Library library) {
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
