package number_program_all;

import java.util.Scanner;



public class Given_digit_present_or_not {

	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Digit : ");
		int num = sc.nextInt();
		
		System.out.print("Enter the Search Digit : ");
		
		 int search = sc.nextInt();
		
		while (num > 0)
		{
			if( num % 10 == search)
			{
			    break;	
			}
			else {
				 num /= 10;
			}
			
		}
		
		if(num > 0)
		{
			System.out.println("Element is fount!");
		}
		else
		{
			System.out.println("Element is not fount!");
		}
		
		sc.close();
	}
	
}
