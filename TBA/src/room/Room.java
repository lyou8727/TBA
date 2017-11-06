package room;

import people.Person;

public abstract class Room {

	    private int  x, y;

	    public Room ( int x, int y)
	    {
	    	this.x = x;
	    	this.y = y;
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
	    public abstract void print();

}
