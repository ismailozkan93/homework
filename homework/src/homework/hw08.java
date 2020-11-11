package homework;

import java.util.Scanner;

public class hw08 {
	public static void main(String[] args) {

	// The user will be asked to enter two numbers and then choose an action.
	// All operations will be done in methods.
	// Add, subtract, multiply, divide
				
					Scanner scan = new Scanner(System.in);
					System.out.println("enter first number");
					double num1 = scan.nextDouble();
					System.out.println("enter second number");
					double num2 = scan.nextDouble();
				System.out.println("select add,substract,multiply oder divide");
				String islem = scan.next().toLowerCase();
				islem(islem,num1,num2);
				
				
				}
		
		
		public static void islem(String islem, double num1 , double num2) {
			switch(islem) {
			case "add":
				add(num1,num2);
				break;
			case "substract":
				substract(num1,num2);
				break;
			case "multiply":
				multiply(num1,num2);
				break;
			case "divide":
				divide(num1,num2);
				break;
			default:System.out.println("please enter operation");
			
			
			
			
			}
		}

		public static void add(double num1,double num2) {
			System.out.println(num1+num2);
		}
		public static void substract(double num1,double num2) {
			System.out.println(num1-num2);
		}
		public static void multiply(double num1,double num2) {
			System.out.println(num1*num2);
		}
		public static void divide(double num1,double num2) {
			System.out.println(num1/num2);
		}
		
		

}
