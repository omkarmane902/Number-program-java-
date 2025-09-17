package number_program_all;

import java.util.Scanner;

public class HCM_Highest_Common_Factor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		
		int num1 = sc.nextInt();
		
		
		System.out.print("Enter the first number : ");
		
		int num2 = sc.nextInt();
		
		
		// int hcm = (num1 > num2)?num1:num2;
		
		
		int hcm;
		
		if(num1 > num2)
		{
			hcm = num1;
		}
		else
		{
			hcm = num2;
		}
		
		
		
		while(true)
		{
			if(hcm % num2 == 0 && hcm % num1 == 0 )
			{
				System.out.println("Highest Common Factor : " + hcm);
				
				break;
			}
			hcm++;
		}
		sc.close();
		
	}

}
