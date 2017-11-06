package room;

import people.Person;

public abstract class Room {
<<<<<<< HEAD
=======
	    private Item[] items;
	    public boolean explored;
>>>>>>> branch 'master' of https://github.com/lyou8727/TBA.git
	    private int x, y;

<<<<<<< HEAD
	    public Room ( int x, int y)
=======
	    public Room ( Person[] occupants, Item[] items, int x, int y)
>>>>>>> branch 'master' of https://github.com/lyou8727/TBA.git
	    {
	    	this.x = x;
	    	this.y = y;
<<<<<<< HEAD
=======
	        this.items = items;
	        this.explored = false;
>>>>>>> branch 'master' of https://github.com/lyou8727/TBA.git
	    }
<<<<<<< HEAD
	    
=======
   
>>>>>>> branch 'master' of https://github.com/lyou8727/TBA.git
	    public int getX()
	    {
	    	return x;
	    }
	    
	    public int getY()
	    {
	    	return y;
	    }
<<<<<<< HEAD
	    public abstract void print();
=======
	    public static void print()
	    {
	    	System.out.print("[ ]");
	    }

>>>>>>> branch 'master' of https://github.com/lyou8727/TBA.git
}
