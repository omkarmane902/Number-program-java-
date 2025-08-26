package number_program_all;

import java.util.Scanner;

public class Power_calculate_of_given_digit {
  
	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the Raise : ");
			
			int raise  = sc.nextInt();
			
			
			
			int calculate = 1;
		
			for( int time = 0; time < raise; time++ )
			{
			    calculate = calculate * raise;	
			}
			
			
			System.out.println(calculate);
			sc.close();
			
	}
	
}
