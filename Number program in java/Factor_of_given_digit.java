package number_program_all;

import java.util.Scanner;

public class Factor_of_given_digit {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		
		int num  = sc.nextInt();
		
		
		for (int den = 1; den <num/2 ; den++)
		{
			if (num%den==0)
			{
				System.out.print(den+",");
			}
		}
		sc.close();
	}
}
