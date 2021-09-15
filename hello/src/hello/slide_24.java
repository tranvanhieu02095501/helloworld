package hello;

import java.util.Scanner;

public class slide_24 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to number 1 : ");
		int number1 = sc.nextInt();
		
		System.out.println("Enter to nember 2 : ");
		int number2 = sc.nextInt();
		 
		if(number1 >= number2) {
			System.out.println("number1 - number2 = " +( number1 - number2));
			
		}else if(number2 >= number1) {
			System.out.println("number2 - number1 = " +( number2 - number1));
			
		}
		
	}
}
