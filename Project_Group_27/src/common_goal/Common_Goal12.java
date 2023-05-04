package common_goal;

public class Common_Goal12 extends Common_Goal{
	
	public Common_Goal12(int Numero_Giocatori) {
		super(Numero_Giocatori);
		this.description="Cinque colonne di altezza crescente o decrescente: a partire dalla prima colonna a sinistra o a destra, ogni colonna successiva deve essere formata da una tessera in più. Le tessere possono essere di qualsiasi tipo";
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
