package number_program_all;


import java.util.Scanner;

public class Range_of_prime_number {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number ");
		
		int start = sc.nextInt();
		
		
		
		System.out.println("Enter the Second number ");
		
		int end = sc.nextInt();
		
		
		
		while (start <= end)
		{
			int den = 2;
			
			while(den <= start)
			{
				if(start % den == 0)
				{
					break;
				}
				den++;
			}
			
			
			if(start==den)
			{
				System.out.print(start + " ");
			}
			start++;
			
		}
		
	}
	
}
