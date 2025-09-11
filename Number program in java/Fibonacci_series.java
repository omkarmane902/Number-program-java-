
// The sequence begins 0, 1, 1, 2, 3, 5, 8, 13, 21, and continues infinitely .


//  Here's how the sequence grows: 
//0
//1
//0 + 1 = 1
//1 + 1 = 2
//1 + 2 = 3
//2 + 3 = 5
//3 + 5 = 8
//And so on..


package number_program_all;

import java.util.Scanner;

public class Fibonacci_series {

	
	
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the number : ");
		
		int num = sc.nextInt();
		
		int n1 = 0 , n2 = 1 , n3;
		
		for(int i = 0; i<num; i++)
		{
			
			
		System.out.print(n1 + " ");
			
		n3 = n1 + n2 ;
		
		n1 = n2 ;
		
		n2 = n3;
		
		
			sc.close();
			
		}
	}
}
