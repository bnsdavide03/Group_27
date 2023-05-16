package common_goal;

import main.Library;
import main.Position;

public class Common_Goal02 extends Common_Goal{
	
	public Common_Goal02(int nPlayers) {
		super(nPlayers);
		this.description="quattro tessere dello stesso tipo ai quattro angoli della library";
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verify_goal(Library library) {
		Position p1=new Position(0,0);
		Position p2=new Position(0,4);
		Position p3=new Position(5,0);
		Position p4=new Position(5,4);
		if(library.getTile(p1)!=null && library.getTile(p2)!=null&&library.getTile(p3)!=null&&library.getTile(p4)!=null)
		{
		if(library.getTile(p1).getColor()==library.getTile(p2).getColor()&&library.getTile(p2).getColor()==library.getTile(p3).getColor()&&library.getTile(p3).getColor()==library.getTile(p4).getColor())
				{
					return true;
				}	
		}
		return false;
	}
}