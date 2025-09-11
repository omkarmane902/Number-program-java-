package number_program_all;

import java.util.Scanner;

public class N_th_Fibonacci_series {

	
	public static void main(String[] args) {
		
		
			Scanner sc = new Scanner(System.in);
		
		
			System.out.print("Enter the number : ");
		
			long num = sc.nextLong();
		
			
			int n1 = 0;
			
			int n2 = 1;
			
			int n3 ;
			
			for(int i = 0 ; i < num ;  i++)
			{
				
				n3 = n1 + n2 ;
				
				n1 = n2 ;
				
				n2 = n3;
				
			}
			
			System.out.print(" N th number Fibonacci_series number :  " + n1);
			
			sc.close();
			
	}
}
