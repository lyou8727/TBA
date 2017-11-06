package room;

import java.util.Random;

public abstract class bossRoom extends Room{

	public int bossHealth;
	public int bossAttack;
	public int bossDefense;
	
	public bossRoom(int x, int y) {
		super(x, y);
	}
	//gets health
	public int getHealth()
	{
		Random rand = new Random();
		int  n = rand.nextInt(30) + 25;
		return bossHealth = n;	
	}
	//gets attack
	public int getAttack()
	{
		Random rand = new Random();
		int  n = rand.nextInt(13) + 10;
		return bossAttack = n;
	}
	//gets defense
	public int getDefense()
	{
		Random rand = new Random();
		int  n = rand.nextInt(7) + 5;
		return bossAttack = n;
	}
}
