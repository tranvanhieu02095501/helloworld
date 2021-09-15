package hello;

import java.util.Scanner;

public class slide_24 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to number 1 : ");
		int number1 = sc.nextInt();
		
		System.out.println("Enter to nember 2 : ");
		int number2 = sc.nextInt();
		
		System.out.println("Enter to result : ");
		int result = sc.nextInt();
		
		
		if(number1 >= number2) {
			int c = number1 - number2;
			if(c == result) {
				System.out.println(" kq đúng");
			}else {
				System.out.println(" kq sai");
			}
			
		}else if(number2 >= number1) {
			System.out.println(" nhap lai" );
			
		}
		
		
	}
}
