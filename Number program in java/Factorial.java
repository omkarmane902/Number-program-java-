package number_program_all;

import java.util.Scanner;

public class Factorial {

	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the NUmber : ");
		
		int num = sc.nextInt();
		
		int product = 1;
		
		while(num > 0)
		{
			product = product * num ;
			
			num --;
		}
		
		
		System.out.println("Factorial of given number is : "+product);
		sc.close();
	}
}
