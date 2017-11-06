package people;

import java.util.Scanner;
import room.Room;

public class Person {
	
	public int health;
	public int attack;
	public int defense;
	private boolean superMode;
	public int x;
	public int y;
	private String name; 
	
	 public Person ( String name,int health, int attack, int defense, boolean superMode, int x, int y)
	 {
		 this.name = name;
		 this.attack = attack;
		 this.defense = defense;
		 this.superMode = false;
		 this.health = health;
		 this.x = x;
		 this.y = y;
	 }
	 
	 public boolean getSuper()
	 {
		 return superMode;
	 }
	 
	 public String getName()
	 {
		 return name;
	 }

	 public void chooseMove()
	{
		System.out.println("Choose a direction.");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		
		if (response.equals("up"))
		{
			this.y -= 1;
		}
		else if (response.equals("down"))
		{
			this.y += 1;
		}
		else if (response.equals("right"))
		{
			this.x += 1;
		}
		else if (response.equals("left"))	
		{
			this.x -= 1 ;
		}
		else
		{
			System.out.println("You cant do that!");
		}
	}
	 
	 public int getX()
	 {
		return x;
	 }
		
	 public int getY()
	 {
		return y;
	 }
}
