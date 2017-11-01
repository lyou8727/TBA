package room;

import items.Item;
import people.Person;

public abstract class Room {
	    private Person[] occupants;
	    private Item[] items;
	    public boolean explored;
	    private int x, y;

	    public Room (Person[] occupants, Item[] items, int x, int y)
	    {
	    	this.x = x;
	    	this.y = y;
	        this.occupants = occupants;
	        this.items = items;
	        this.explored = false;
	    }

	    public  Person[] getOccupants() {
	        return occupants;
	    }

	    public void setOccupants(Person[] occupants) {
	        this.occupants = occupants;
	    }

	    
	    public void addOccupant(Person p)
	    {
	        this.occupants = Arrays.copyOf(this.occupants,this.occupants.length+1);
	        this.occupants[this.occupants.length-1] = p;
	        p.setRoom(this);
	    }

	    
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
