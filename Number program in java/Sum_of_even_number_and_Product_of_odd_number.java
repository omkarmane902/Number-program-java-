package number_program_all;

import java.util.Scanner;



public class Sum_of_even_number_and_Product_of_odd_number {
  
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		
		int num = sc.nextInt();
		
		
		int sum  = 0;
		
		int product = 1;
		
		
		while(num > 0)
		{
			int last = num % 10;
			
			if(last % 2 == 0)
			{
				sum += last;
			}
			else
			{
				product *= last;
			}
			 
			num /= 10;
		}
		
		
		System.out.println("Sum of given digit is : " +sum + " and product of given digit : " +product);
		sc.close();
	}
	
}
