package room;

import java.util.Random;

import people.Person;

public abstract class defenseRoom extends Room {

	public defenseRoom( int x, int y) {
		super( x, y);
	}

	public void increaseDefense(Person player1)
	{
		player1.defense += 5;
	}
	public void changeRegen(Person player1)
	{
		Random rand = new Random();
		int  n = rand.nextInt(10) + 1;
		if(n>5)
		{
			player1.health += 5;
		}
	}
	@Override
	public abstract void print();
}