//A Buzz number is a number that is either divisible by 7 or ends with 7.


package number_program_all;

import java.util.Scanner;

public class Buzz_Numbers {

	
	
	public static void main(String[] args) {
		
		
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		
		int num = sc.nextInt();
		
		
		if(num % 7 ==0 || num % 10 ==7 )
		{
			 System.out.println(num + " is a Buzz Number.");
		}
		else {
			 System.out.println(num + " is not a Buzz Number.");
		}
		sc.close();
	}
}
