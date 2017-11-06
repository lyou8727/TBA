package board;

import room.Room;
import people.Person;

public class Board {
	private Room[][]map;
	
	public Board(Room[][] map) {
		this.map = map;
	}

	public void printMap(Person player1) {
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				if (j == player1.getX() && i == player1.getY())
				{
					System.out.print(" [ " + "u" + " ] ");
				}
				else
					System.out.print(" [   ] ");
			}
			System.out.println(" ");
		} 
	}
	public Room[][] getMap() {
	       return map;
	}
}
