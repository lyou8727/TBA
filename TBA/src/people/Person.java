package people;

public class Person {
	private int health = 100;
	private int attack = 10;
	private int defense = 10;
	private boolean superMode;
	private int x, y;
	
	 public Person ( int health, int attack, int defense, boolean superMode, int x, int y)
	 {
		 this.attack = attack;
		 this.defense = defense;
		 this.superMode = false;
		 this.health = health;
		 this.x = x;
		 this.y = y;
	 }


}
