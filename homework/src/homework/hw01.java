package homework;

import java.util.Scanner;

public class hw01 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a word");
		String a = scan.nextLine();
		System.out.println(reverseWord(a));
	}
	
	public static String reverseWord(String a) {
		String b="";
		for(int i=a.length()-1 ; i>=0; i--) {
			char ch = a.charAt(i);
			b = b+ch;
		}return b;
	//homework	
		
	}
}
