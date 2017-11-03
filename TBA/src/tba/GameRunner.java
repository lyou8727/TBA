package tba;

import items.Item;
import people.Person;
import room.Room;

import java.util.Scanner;

import board.Board;



public class GameRunner {


	public static void main (String[] args)
	    {
	        Room[][] map = new Room[8][8];
	        for (int j = 0; j<5; j++)
	        {
	            for (int i = 0; i<5;i++)
	            {
	                
	            }

	        }

	        Board tech = new Board(map);

	        //Person player1 = Utilities.createPerson();
	       Scanner in = new Scanner(System.in);
	           // System.out.println("Welcome to the Halls of Tech, " + player1.getFirstName());
	           // map[0][0].addOccupant(player1);
	        tech.printMap();
			in.close();
}
}



