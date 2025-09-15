package number_program_all;

import java.util.Scanner;

public class Strong_Number {

    
 public static void main(String[] args) {
	
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print(" Enter The Number : ");
	 
	 int number = sc.nextInt();
	 
	 
	 int temp = number;
	 
	 int sum  = 0;
	 
	 while (number != 0)
	 {
		int extract = number % 10 ;
		
		
		
		int fact = 1;
		
	
		while (extract > 0)
		{
			fact = fact * extract;
			
			extract --;
			
		}
		
		sum += fact;
		number /= 10;
	 }
	 
	 if (sum == temp) 
	 {
         System.out.println(temp + " is a Strong number");
     } else
     {
         System.out.println(temp + " is NOT a Strong number");
     }

	 
	sc.close(); 
	 
	
 	}  
 
}