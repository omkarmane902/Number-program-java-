package number_program_all;

import java.util.Scanner;

public class reverse_number_1 {

	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		
		
		int num = sc.nextInt();
		
		
		
		int rev = 0;
		
		
		
		while(num != 0)
		{
			int extractlastdigit = num % 10;
			
			rev = rev * 10 + extractlastdigit;
	
			num /= 10;
		}
		
		System.out.println("Reverse the given number : " + rev);
		
		sc.close();
		
	}
}
