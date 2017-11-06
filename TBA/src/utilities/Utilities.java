package utilities;

import people.Person;
import java.util.Scanner;

public class Utilities {
	
	public static Person createPerson() {
		System.out.println("What is your name?");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		 
		return new Person (name,20,10,10,false,0,0);
	}
}
