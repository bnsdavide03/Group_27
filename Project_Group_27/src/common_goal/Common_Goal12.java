package common_goal;

import java.util.ArrayList;

import main.Library;
import main.Position;

public class Common_Goal12 extends Common_Goal{
	
	public Common_Goal12(int nPlayers) {
		super(nPlayers);
		this.description="Cinque colonne di altezza crescente o decrescente: a partire dalla prima colonna a sinistra o a destra, ogni colonna successiva deve essere formata da una tessera in più. Le tessere possono essere di qualsiasi tipo";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verify_goal(Library library) {
		int[] nTilesOnColumns=new int[5];
		nTilesOnColumns[0]=calculateNumberTilesColumn(library,0);
		nTilesOnColumns[1]=calculateNumberTilesColumn(library,1);
		nTilesOnColumns[2]=calculateNumberTilesColumn(library,2);
		nTilesOnColumns[3]=calculateNumberTilesColumn(library,3);
		nTilesOnColumns[4]=calculateNumberTilesColumn(library,4);
		if(nTilesOnColumns[0]<nTilesOnColumns[1]&&nTilesOnColumns[1]<nTilesOnColumns[2]&&nTilesOnColumns[2]<nTilesOnColumns[3]&&nTilesOnColumns[3]<nTilesOnColumns[4]) {
			return true;
		}
		else if(nTilesOnColumns[4]<nTilesOnColumns[3]&&nTilesOnColumns[3]<nTilesOnColumns[2]&&nTilesOnColumns[2]<nTilesOnColumns[1]&&nTilesOnColumns[1]<nTilesOnColumns[0]) {
			return true;
		}
		return false;
	}
	
	private int calculateNumberTilesColumn(Library library, int column){
		int nTiles=0;
		for(int i=5;i>=0;i--){
			if(library.getTile(new Position(i,column))!=null) {
				nTiles++;
			}
			else {
				//System.out.println("Number tile on column "+column+": "+nTiles);
				return nTiles;
			}
		}
		//System.out.println("Number tile on column "+column+": "+nTiles);
		return nTiles;
	}

}
