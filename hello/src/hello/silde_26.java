package hello;

import java.util.Scanner;

public class silde_26 {
	
     public static void main(String[] args) {
    	 
    	 final int Single=1;
    	 final int Er=2;
    	 final int Mfs=3;
    	 final int Hoh=4;
    	 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter to status : ");
		int status = sc.nextInt();
		
		if(status == Single) {
		System.out.println(" rate 10 % & $0 -&8,375");
		}else if (status == Er)
		{
			System.out.println(" rate 25 % & $0 -&8,375");
			}
		else if (status == Mfs)
		{
			System.out.println(" rate 28 % & $0 -&8,375");
			}
		else if (status == Hoh)
		{
			System.out.println(" rate 33 % & $0 -&8,375");
			}
	
	}
}
