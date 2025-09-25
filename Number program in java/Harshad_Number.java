//उदाहरणे

// 💡 18 → digits sum = 1 + 8 = 9
//    18 % 9 == 0 ✅ → Harshad Number

// 💡 19 → digits sum = 1 + 9 = 10
//    19 % 10 != 0 ❌ → NOT Harshad Number


package number_program_all;

import java.util.Scanner;

public class Harshad_Number {
	
	
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the starting number: ");
		int num = sc.nextInt();
		
		
		
		int temp = num;
		
		int sum = 0;
		
		
		
		while(num > 0)
		{
			
			
			 sum += num % 10;
			
			 num /=10;
			
		}
		
		if (temp % sum == 0)
		{
			 System.out.println(temp + " : is a Harshad Number.");
		}
		else
		{
			System.out.println(temp + " : is NOT a Harshad Number.");
		}
		sc.close();
		
		
	
}
	
   


}
