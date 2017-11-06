package tba;

import people.Person;
import room.Room;
import utilities.Utilities;

import java.util.Scanner;

import board.Board;



public class GameRunner {

// Leon You pd 6-7
	public static void main (String[] args)
	    {

	        Room[][] map = new Room[8][8];

	        Board tech = new Board(map);



	       boolean gameOn = true;
	        Person player1 = Utilities.createPerson();
	        Scanner in = new Scanner(System.in);
	        System.out.println("Welcome to the Great Dungeon, " + player1.getName());
	        while(gameOn)
	        {
	          tech.printMap(player1);
	          player1.chooseMove();  
	          System.out.println("Health:" + player1.health + " Attack:" + player1.attack + " Defense:" + player1.defense);
	          
	          if(player1.health < 1)
	          {
	        	  System.out.println("Game Over, You have Died");
	        	  gameOn = false;
	          }
	          if(player1.getY() > 5)
			  {
	            System.out.print("You cannot move this way.\n");
	            player1.y -=1;
				
			  }
	          if(player1.getY() < 0)
	          {
	        	System.out.print("You cannot move this way.\n");
	        	player1.y +=1;
	          }
	          if( player1.getX() > 5)
	          {
	        	System.out.print("You cannot move this way.\n"); 
	        	player1.x -=1;
	          }
	          if(player1.getX() < 0)
	          {
	        	System.out.print("You cannot move this way.\n");  
	        	player1.x +=1;
	          }  
	        }
	        
			in.close();
}
}



