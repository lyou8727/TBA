package board;

import room.Room;

public class Board {
	private Room[][] DngnMap;

    public Board(Room[][] DngnMap)
    {
        this.DngnMap = DngnMap;
    }
    public void printMap()
    {


        for(Room[] row : schoolMap)
        {
            for (Room room : row)
            {
                room.print();
            }
            System.out.println();
        }
    }
}
