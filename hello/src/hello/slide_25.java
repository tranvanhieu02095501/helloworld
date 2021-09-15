package hello;

import java.util.Scanner;

public class slide_25 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to  age : ");
		int age = sc.nextInt();
		System.out.println("Enter to  weight : ");
		float weight = sc.nextFloat();
		System.out.println("Enter to  height : ");
		float height = sc.nextFloat();
		System.out.println("Enter to  BMI : ");
		float BMI = weight /(height * height);
		
		 if(BMI< 18.5) {
			 System.out.println("UNDERWEIGHT");
		 } else if(BMI >= 18.5 && BMI < 25.0) {
			 System.out.println("NORMAL");
		 } else if(BMI >= 25.0 && BMI < 30.0) {
			 System.out.println("OVERWEIGHT");
		 } else if(BMI >= 30.0) {
			 System.out.println("OBESE");
		 } 
	}
}
