package common_goal;

import main.Library;

public class Common_Goal08 extends Common_Goal{
	
	public Common_Goal08(int Numero_Giocatori) {
		super(Numero_Giocatori);
		this.description="Quattro righe formate ciascuna da 5 tessere di uno, due o tre tipi differenti. Righediverse possono avere combinazioni diversedi tipi di tessere";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verify_goal(Library libreria) {
		// TODO Auto-generated method stub
		return false;
	}

}