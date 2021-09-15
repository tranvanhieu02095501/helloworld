package hello;

import java.util.Scanner;

public class silde_26 {
	
     public static void main(String[] args) {
    	 
    	 final int x=1;
    	 final int y=2;
    	 final int z=3;
    	 final int a=4;
    	 final int b=5;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter to status : ");
		int status = sc.nextInt();
		
		if(status == x) {
		System.out.println(" rate 10 % & $0 -&8,375");
		}else if (status == y)
		{
			System.out.println(" rate 25 % & $0 -&8,375");
			}
		else if (status == z)
		{
			System.out.println(" rate 28 % & $0 -&8,375");
			}
		else if (status == a)
		{
			System.out.println(" rate 33 % & $0 -&8,375");
			}
		else if (status == b)
		{
			System.out.println(" rate 35 % & $0 -&8,375");
			}
	}
}
