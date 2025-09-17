//उदाहरणे:

//1) 1124

//Digits = 1, 1, 2, 4

//Sum = 1 + 1 + 2 + 4 = 8

//Product = 1 × 1 × 2 × 4 = 8 ✅

//त्यामुळे 1124 हा Spy Number आहे

//2) 123

//Digits = 1, 2, 3

//Sum = 1 + 2 + 3 = 6

//Product = 1 × 2 × 3 = 6 ✅

//त्यामुळे 123 हा Spy Number आहे

//3) 45

//Digits = 4, 5

//Sum = 4 + 5 = 9

//Product = 4 × 5 = 20 ❌

//त्यामुळे 45 हा Spy Number नाही


package number_program_all;

import java.util.Scanner;

public class Spy_Number {

	
	
 public static void main(String[] args) {
	
	 

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the  number : ");
		
		int num = sc.nextInt();
		
	
		
		
		
		int sum = 0;
		
		int product = 1;
		
	
		
		while(num !=0)
		{
			int extract = num % 10;
			
			product *= extract;
			sum += extract;
			
			num /= 10;
		}
		
		if(sum == product)
		{
			System.out.println("This is Spy Number");
		}
		else
		{
			System.out.println("This is not Spy Number");
		}
		
		sc.close();
	 
}	
	
}
