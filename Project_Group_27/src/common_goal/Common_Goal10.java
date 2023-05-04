package common_goal;

public class Common_Goal10 extends Common_Goal{
	
	public Common_Goal10(int Numero_Giocatori) {
		super(Numero_Giocatori);
		this.description="Due righe formate ciascuna da 5 diversi tipi di tessere";
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