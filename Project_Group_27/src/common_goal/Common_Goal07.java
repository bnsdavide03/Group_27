package common_goal;

import main.Library;

public class Common_Goal07 extends Common_Goal{
	
	public Common_Goal07(int Numero_Giocatori) {
		super(Numero_Giocatori);
		this.description="cinque tessere dello stesso tipo che formano una diagonale";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verify_goal(Library libreria) {
		// TODO Auto-generated method stub
		return false;
	}

}