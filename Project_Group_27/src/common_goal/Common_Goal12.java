package common_goal;

import java.util.ArrayList;

import main.Library;
import main.Position;

public class Common_Goal12 extends Common_Goal{
	
	public Common_Goal12(int Numero_Giocatori) {
		super(Numero_Giocatori);
		this.description="Cinque colonne di altezza crescente o decrescente: a partire dalla prima colonna a sinistra o a destra, ogni colonna successiva deve essere formata da una tessera in più. Le tessere possono essere di qualsiasi tipo";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verify_goal(Library libreria) {
		int[] nTilesOnColumns=new int[5];
		nTilesOnColumns[0]=calculateNumberTilesColumn(libreria,0);
		nTilesOnColumns[1]=calculateNumberTilesColumn(libreria,1);
		nTilesOnColumns[2]=calculateNumberTilesColumn(libreria,2);
		nTilesOnColumns[3]=calculateNumberTilesColumn(libreria,3);
		nTilesOnColumns[4]=calculateNumberTilesColumn(libreria,4);
		if(nTilesOnColumns[0]<nTilesOnColumns[1]&&nTilesOnColumns[1]<nTilesOnColumns[2]&&nTilesOnColumns[2]<nTilesOnColumns[3]&&nTilesOnColumns[3]<nTilesOnColumns[4]) {
			return true;
		}
		else if(nTilesOnColumns[4]<nTilesOnColumns[3]&&nTilesOnColumns[3]<nTilesOnColumns[2]&&nTilesOnColumns[2]<nTilesOnColumns[1]&&nTilesOnColumns[1]<nTilesOnColumns[0]) {
			return true;
		}
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
	
	private int calculateNumberTilesColumn(Library libreria, int column){
		int nTiles=0;
		for(int i=5;i>=0;i--){
			if(libreria.getTile(new Position(i,column))!=null) {
				nTiles++;
			}
			else {
				return nTiles;
			}
		}
		return nTiles;
	}

}
