package hello;

import java.util.Scanner;

public class silde_26 {
     public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter to status : ");
		int status = sc.nextInt();
		
		if(status == 1) {
		System.out.println(" rate 10 % & $0 -&8,375");
		}else if (status == 2)
		{
			System.out.println(" rate 25 % & $0 -&8,375");
			}
		else if (status == 3)
		{
			System.out.println(" rate 28 % & $0 -&8,375");
			}
		else if (status == 4)
		{
			System.out.println(" rate 33 % & $0 -&8,375");
			}
		else if (status == 5)
		{
			System.out.println(" rate 35 % & $0 -&8,375");
			}
	}
}
