package common_goal;

public class Common_Goal02 extends Common_Goal{
	
	public Common_Goal02(int Numero_Giocatori) {
		super(Numero_Giocatori);
		this.description="quattro tessere dello stesso tipo ai quattro angoli della libreria";
		
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