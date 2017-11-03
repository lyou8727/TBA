package room;

import people.Person;
import items.Item;


public class Hallway extends Room {

    public Hallway(boolean[] doors, Person[] people, Item[] items, int x, int y)
    {
        super(doors, people, items, x, y);
    }

    public void print()
    {
        if (getOccupants().length != 0)
        {
            System.out.print(getOccupants()[0].print());
        }
        else if (this.explored)
        {
            System.out.print("[ H ]");
        }
        else
        {
            System.out.print("[  ]");
        }

    }
    
}

