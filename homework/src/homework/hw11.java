package homework;

import java.util.Scanner;

public class hw11 {
	public static void main(String[] args) {

		// Let's check whether the email address to be entered is legal or not.

		// prefix @ lastname.
		// ""
		// getEmailDogrulama (String email)

		// return type ==> boolean	
				
				Scanner scan = new Scanner(System.in);
				System.out.println("please enter a mail");
				String mail = scan.nextLine();			
				System.out.println("Email: " + confirmEmail(mail));
			}
			public static boolean confirmEmail(String mail) {
				
				if(!mail.contains("@")) {
					return false;
				}if(mail.length()<=4) {
					return false;
				}if(mail.contains(" ")) {
					return false;
				}
				if(!mail.contains(".")) {
					return false;
				}
				return true;
			}
}
