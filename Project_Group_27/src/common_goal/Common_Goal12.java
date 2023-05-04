package common_goal;

import main.Library;

public class Common_Goal12 extends Common_Goal{
	
	public Common_Goal12(int Numero_Giocatori) {
		super(Numero_Giocatori);
		this.description="Cinque colonne di altezza crescente o decrescente: a partire dalla prima colonna a sinistra o a destra, ogni colonna successiva deve essere formata da una tessera in più. Le tessere possono essere di qualsiasi tipo";
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
