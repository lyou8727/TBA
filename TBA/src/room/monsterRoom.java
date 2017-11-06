package room;

import java.util.Random;

public abstract class monsterRoom extends Room{

	public int monHealth;
	public int monAttack;
	
	public monsterRoom(int x, int y) {
		super(x, y);
	}
	
	public int getHealth()
	{
		Random rand = new Random();
		int  n = rand.nextInt(10) + 5;
		return monHealth = n;	
	}
	
	public int getAttack()
	{
		Random rand = new Random();
		int  n = rand.nextInt(7) + 2;
		return monAttack = n;
	}
}
