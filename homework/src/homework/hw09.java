package homework;

import java.util.Scanner;

public class hw09 {
	public static void main(String[] args) {
		
		//Let's change the hotmail address we got from the user to gmail
		//abc@hotmail.com ==> abc@gmail.com
			
			Scanner scan = new Scanner(System.in);
			System.out.println("please enter a hotmail ");
			String hotmail = scan.next();	
			if(hotmail.contains("@hotmail")) {
			String gmail = hotmail.replace("@hotmail.com", "@gmail.com");
			System.out.println(gmail);
			}
			else {
				System.out.println("don't include hotmail.");
			}
		}

		public static void mail(String mail1, String mail2) {
			System.out.println(mail1.replace("hotmail", "gmail"));
		}
		

}
