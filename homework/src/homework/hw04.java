package homework;

public class hw04 {

	public static void main(String[] args) {

		// Let's print the numbers that are divided by 3, 5 and 15 of the numbers 1 to 100
		// Numbers divided by 3: 3 6 9 12
		// Numbers divided by 5: 5 10 15 20
		System.out.println("divided by 3");
		for(int i =1;i<100;i++) {
			if(i%3==0) {	
			System.out.print(i+" ");}
		}
		System.out.println();
		System.out.println("divided by 5");
		for(int i =1;i<100;i++) {	
			 if(i%5==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("divided by 15");
		for	(int i=1;i<100;i++) {
			if(i%5==0 && i%3==0) {
				System.out.print(i+" ");

	}

		}}

	}


