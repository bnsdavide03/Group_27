package main;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Common_Goal {
	
	private static final AtomicInteger count = new AtomicInteger(0);
	private final int id;
	protected String description;
	private int remaningCards[];
	
	
	public Common_Goal(int Numero_Giocatori)
	{
		id=count.incrementAndGet();
		remaningCards[1]=4;
		remaningCards[3]=8;
		if(Numero_Giocatori>2)
		{
			remaningCards[2]=6;
		}
		if(Numero_Giocatori==4)
		{
			remaningCards[0]=2;
		}
		
	}
	public abstract int verify_goal();
	{
		
	}
}
