package room;

import items.Item;
import people.Person;

public abstract class Room {
	    private Item[] items;
	    public boolean explored;
	    private int x, y;

	    public Room ( Person[] occupants, Item[] items, int x, int y)
	    {
	    	this.x = x;
	    	this.y = y;
	        this.items = items;
	        this.explored = false;
	    }
   
	    public int getX()
	    {
	    	return x;
	    }
	    
	    public int getY()
	    {
	    	return y;
	    }
	    public static void print()
	    {
	    	System.out.print("[ ]");
	    }

}
