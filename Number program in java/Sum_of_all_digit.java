package number_program_all;

import java.util.Scanner;

public class Sum_of_all_digit {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		
		int num = sc.nextInt();
		
		int sum = 0;
		
		while(num > 0 )
		{
			sum +=  num % 10;
			num /=10;
		}
		
		System.out.print("Total sum of given Digit : " + sum);
		sc.close();
	}
}
