package homework;

import java.util.Scanner;

public class hw07 {

	public static void main(String[] args) {
		

		// Take 2 numbers in the form of dividing and dividing from the user and the division operator
		//Let's do the division without using //, let's print a section.
			
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the divisor and the division");
			int bölünen = scan.nextInt();
			int bölen = scan.nextInt();
			System.out.println("result: " + bölme(bölünen,bölen));
			//bölme(18,3);
			scan.close();
		
		}	
		public static int bölme(int bölünen,int bölen) {
			int bölüm=0;
			while(bölünen>=bölen) {
				bölünen-=bölen;
				bölüm++;
			}return bölüm;
		}
}
