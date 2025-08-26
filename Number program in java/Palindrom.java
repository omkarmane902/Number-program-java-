package number_program_all;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the NUmber : ");
		
		int num = sc.nextInt();

		int temp = num ;
		
		int reverse = 0;
		while(num != 0)
		{
			 reverse = reverse * 10 + (num % 10);
			 num/=10;
		}
		
		
		if(temp == reverse)
		{
			System.out.println(" This Number is Palindrom : " + reverse);
		}
		else
		{
			System.out.println(" This Number is not Palindrom : " + reverse);
		}
		sc.close();
	}
	
}
