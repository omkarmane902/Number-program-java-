//Pronic Number (ज्याला Oblong Number किंवा Rectangular Number देखील म्हणतात) 
//अशी संख्या आहे जी दोन सलग नैसर्गिक संख्यांच्या (consecutive numbers) गुणाकाराने बनते.

//उदाहरणे:

//0 = 0 × 1 → Pronic ✅

//2 = 1 × 2 → Pronic ✅

//6 = 2 × 3 → Pronic ✅

//12 = 3 × 4 → Pronic ✅

//20 = 4 × 5 → Pronic ✅

//30 = 5 × 6 → Pronic ✅

//👉 म्हणजे Pronic Numbers अशी एक मालिका तयार करतात:
//0, 2, 6, 12, 20, 30, 42, 56, 72, 90 …

package number_program_all;

import java.util.Scanner;

public class Pronic_Number {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		
		int num = sc.nextInt();
		
		for (int i = 0; i <= num ; i++) {
			
			if(i*(i+1)==num)
			{
				System.out.println("This is Pronic Number :" + num);
				return;
			}
			
			 
			
			}
	
			System.out.println("This is not Pronic Number");
		 
			sc.close();
		}
	}
	
	
	
	

