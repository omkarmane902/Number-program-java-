package number_program_all;

import java.util.Scanner;

public class Max_digit_of_given_number {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		
		int num = sc.nextInt();	
		
		int max = 0;
		
		
		while(num > 0)
		{
			int last =  num % 10;
			
			if(last>max)
			{
				max = last;
			}
			
			num /= 10;
		}
		
		
		System.out.print("Max digit of given number : " +max);
		sc.close();
	}
}
