package common_goal;

import main.Library;

public class Common_Goal11 extends Common_Goal{
	
	public Common_Goal11(int nPlayers) {
		super(nPlayers);
		this.description="Cinque tessere dello stesso tipo che formano una X";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verify_goal(Library library) {
		// TODO Auto-generated method stub
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