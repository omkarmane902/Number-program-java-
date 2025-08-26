package number_program_all;

import java.util.Scanner;

public class Min_digit_of_given_number {

	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		
		int num  = sc.nextInt();
		
		int min = 9;
		
		while(num >0)
		{
			int last = num %  10 ;
			
			if (last < min)
			{
				min = last;
			}
			num /= 10;
		}
		
		System.out.println("minmin numbers of given Digit is : " +min);
		sc.close();
	}
}
