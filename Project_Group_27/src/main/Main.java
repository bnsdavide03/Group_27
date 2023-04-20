package main;

public class Main {

	public static void main(String[] args) {
		Tile ciao[][]=new Tile[4][4];
		ciao[2][2]=new Tile();
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++){
				System.out.println("posizione: "+i+" "+j+" valore: "+ciao[i][j]);
				System.out.println("posizione: "+i+" "+j+" valore: "+ciao[i][j]);
				System.out.println("posizione: "+i+" "+j+" valore: "+ciao[i][j]);
			}
		}
	}

}
