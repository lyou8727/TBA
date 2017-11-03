package tba;

import items.Item;
import people.Person;
import room.Hallway;
import room.Room;

import java.util.Scanner;

import board.Board;



public class GameRunner {


	public static void main (String[] args)
	    {
	        Room[][] map = new Room[5][5];
	        for (int j = 0; j<map.length; j++)
	        {
	        	Room[] row = map[j];
	            for (int i = 0; i<row.length;i++)
	            {
	                Person[] people = {};
	                Item[] items = {};

	                row[i] = new Hallway(null, people, items, i, j);
	            }

	        }

	        Board tech = new Board(map);


	       boolean gameOn = true;
	        //Person player1 = Utilities.createPerson();
	        Scanner in = new Scanner(System.in);
	        while(gameOn)
	        {
	           // System.out.println("Welcome to the Halls of Tech, " + player1.getFirstName());
	           // map[0][0].addOccupant(player1);

	          tech.printMap();
	            //player1.printRoom();
	           // String move = player1.chooseMove();
	           // Utilities.movePlayer(tech, player1,move);
	           // gameOn = false;   
	        }
			in.close();
}
}



