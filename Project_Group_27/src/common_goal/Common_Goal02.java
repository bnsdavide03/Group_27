package common_goal;

import main.Library;
import main.Position;

public class Common_Goal02 extends Common_Goal{
	
	public Common_Goal02(int Numero_Giocatori) {
		super(Numero_Giocatori);
		this.description="quattro tessere dello stesso tipo ai quattro angoli della libreria";
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verify_goal(Library libreria) {
		Position p1=new Position(0,0);
		Position p2=new Position(4,0);
		Position p3=new Position(0,5);
		Position p4=new Position(4,5);
		if(libreria.getTile(p1).getColor()==libreria.getTile(p2).getColor()&&libreria.getTile(p2).getColor()==libreria.getTile(p3).getColor()&&libreria.getTile(p3).getColor()==libreria.getTile(p4).getColor())
				{
					return true;
				}
		else 
		{
			return false;
		}
		
	}

}