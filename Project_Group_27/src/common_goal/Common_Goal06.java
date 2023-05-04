package common_goal;

import main.Library;

public class Common_Goal06 extends Common_Goal{
	
	public Common_Goal06(int Numero_Giocatori) {
		super(Numero_Giocatori);
		this.description="Otto tessere dello stesso tipo. Non ci sono restrizioni sulla posizione di queste tessere";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verify_goal(Library libreria) {
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