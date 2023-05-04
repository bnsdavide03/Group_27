package common_goal;

import main.Library;

public class Common_Goal11 extends Common_Goal{
	
	public Common_Goal11(int Numero_Giocatori) {
		super(Numero_Giocatori);
		this.description="Cinque tessere dello stesso tipo che formano una X";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verify_goal(Library libreria) {
		// TODO Auto-generated method stub
		return false;
	}

}