package homework;

import java.util.Scanner;

public class hw07 {

	public static void main(String[] args) {
		

		// Take 2 numbers in the form of dividing and dividing from the user and the division operator
		//Let's do the division without using //, let's print a section.
			
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the divisor and the division");
			int b�l�nen = scan.nextInt();
			int b�len = scan.nextInt();
			System.out.println("result: " + b�lme(b�l�nen,b�len));
			//b�lme(18,3);
			scan.close();
		
		}	
		public static int b�lme(int b�l�nen,int b�len) {
			int b�l�m=0;
			while(b�l�nen>=b�len) {
				b�l�nen-=b�len;
				b�l�m++;
			}return b�l�m;
		}
}
