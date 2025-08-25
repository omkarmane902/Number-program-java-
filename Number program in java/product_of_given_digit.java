package number_program_all;

import java.util.Scanner;

public class product_of_given_digit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		
		
		int num = sc.nextInt();
		
		
		int product = 1;
		
		while(num > 0)
		{
			product *= num %10;
			
			num /=10;
		}
		
		System.out.println("Total product of given Digit : " +product);
		
		sc.close();
		
	}
}
