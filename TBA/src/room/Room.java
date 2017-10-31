package room;

import items.Item;
import people.Person;

public abstract class Room {
	private Person[] occupants;
    private Item[] items;
    private Upgrade[] upgrades;
    public boolean discovered;
    public Room ( Person[] occupants, Item[] items, Upgrade[] upgrades)
    {
    	this.doors = doors;
        this.occupants = occupants;
        this.items = items;
        this.discovered = false;
    }
}
