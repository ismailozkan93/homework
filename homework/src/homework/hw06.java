package homework;

import java.util.Scanner;

public class hw06 {
	//	Let's take a word from the user and write the opposite
	public static void main(String []args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("type a word");
	String st = scan.nextLine();
	String reverse = "";
	for(int i = st.length()-1 ; i>=0 ; i--) {
		char ch = st.charAt(i);
		reverse +=ch;
	}
	System.out.println(reverse);
	
	}
}

