package number_program_all;

import java.util.Scanner;

public class Twisted_Prime {

	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int num = sc.nextInt();

		int original = num;  
		int rev = 0;
		int count = 0, count1 = 0;

		
		for(int i = 1; i <= original; i++) 
		{
		    if(original % i == 0) 
		    {
		    	count++;
		    }
		}

		
		int temp = original;
		while(temp > 0) 
		{
		    rev = rev * 10 + (temp % 10);
		    temp /= 10;
		}

		
		for(int i = 1; i <= rev; i++) 
		{
		    if(rev % i == 0)
		    {
		    	 count1++;
		    }
		}

		
		if(count == 2 && count1 == 2) 
		{
		    System.out.println(original + " : is a Twisted Prime Number.");
		} else {
		    System.out.println(original + " : is NOT a Twisted Prime Number.");
		}

		sc.close();

		
	}
}
