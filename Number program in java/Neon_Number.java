// 9
// 9² = 81
// 8 + 1 = 9 ✅ → Neon Number

//7

//7² = 49

//4 + 9 = 13 ❌ → neon Number नाही

package number_program_all;


import java.util.Scanner;

public class Neon_Number {

	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the  number : ");
		
		int num = sc.nextInt();
		
		
		
		int square = num * num;
		
		int sum = 0;
		
		while (square!=0)
		{
			int extract = square % 10;
			
			 sum += extract;
			 
			 square /=10;
			 
		}
		
		
		
		if(sum == num)
		{
			System.out.println("This is Neon Number");
		}
		else
		{
			System.out.println("This is not Neon Number");
		}

		
		sc.close();
		
	}
}

