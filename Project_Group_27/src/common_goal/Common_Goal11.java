package common_goal;

import main.Library;
import main.Position;

public class Common_Goal11 extends Common_Goal{
	
	public Common_Goal11(int nPlayers) {
		super(nPlayers);
		this.description="Cinque tessere dello stesso tipo che formano una X";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verify_goal(Library library) {
		for(int i=0;i<3;i++)//colonna
		{
			for(int k=0;k<4;k++)//riga
			{
				if(library.getTile(new Position(k,i))!=null&&library.getTile(new Position(k,i+2))!=null&&library.getTile(new Position(k+1,i+1))!=null&&library.getTile(new Position(k+2,i))!=null&&library.getTile(new Position(k+2,i+2))!=null)
				{
					if(library.getTile(new Position(k,i)).getColor()==library.getTile(new Position(k,i+2)).getColor()&&library.getTile(new Position(k,i)).getColor()==library.getTile(new Position(k+1,i+1)).getColor()&&library.getTile(new Position(k,i)).getColor()==library.getTile(new Position(k+2,i)).getColor()&&library.getTile(new Position(k,i)).getColor()==library.getTile(new Position(k+2,i+2)).getColor())
					{
						return true;
					}
				}
			}
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

}