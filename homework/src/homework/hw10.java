package homework;

import java.util.Scanner;

public class hw10 {
	public static void main(String[] args) {
		// Define 2 strings as name1 and name2.
		// If name1 has an odd number of characters, write the common name of name1 inside it.
		// mehmet 6
		//Ahmet
		// mehahmetmet
		// If the number of characters in name1 is odd, it cannot be added.
			
			
			Scanner scan = new Scanner(System.in);
			System.out.println("please enter name1");
			String name1 = scan.next();	
			System.out.println("please enter name2");
			String name2 = scan.next();	
			if(name1.length()%2==0) {
				System.out.println(name1.substring(0, name1.length()/2) + name2 + name1.substring(name1.length()/2, name1.length()));
			}
			else {
				System.out.println("\r\n" + 
						"Cannot add if Name1 character number is odd");
			}
			
			
			
		}


}
