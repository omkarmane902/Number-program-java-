package number_program_all;

import java.util.Scanner;

public class Ugly_Number {

	
	public static void main(String[] args) {
		
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Number : ");
		
		int num = sc.nextInt();
		
		if (num <= 0)
		{
			System.out.println(" Is NOT an Ugly Number.");
		}
			
			
			while(num % 2 ==0)
			{
				num /=2;
			}
			
			while(num % 3 ==0)
			{
				num /=3;
			}
			
			while(num % 5 ==0)
			{
				num /=5;
			}
			
			
			if(num == 1)
			{
				System.out.println(" is an Ugly Number.");
			}
			else
			{
				 System.out.println(" is NOT an Ugly Number.");
			}
			
		   sc.close();
		
		
		
	}
	
}
