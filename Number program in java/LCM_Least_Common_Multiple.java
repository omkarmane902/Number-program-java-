package number_program_all;

import java.util.Scanner;





public class LCM_Least_Common_Multiple {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number");
		
		int num1 = sc.nextInt();
		
		
		System.out.print("Enter the first number");
		
		int num2 = sc.nextInt();
		
		
//		 int lcm = (num1 > num2) ? num1 : num2;
		
		
		
		
		int lcm;
		
		if(num1 < num2)
		{
			lcm = num1;
		}
		else
		{
			lcm = num2;
		}
		
		
		while(true)
		{
			if (lcm % num1 == 0 && lcm % num2 == 0)
			{
				System.out.println("Least Common Multiple : " + lcm);
				break;
			}
			lcm++;
		}
		sc.close();
	}
}

