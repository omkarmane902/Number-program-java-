package number_program_all;

import java.util.Scanner;

public class count_of_odd_and_even_number {
	
	
 public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the number");
	 
	 
	 int num = sc.nextInt();
	 
	 int oddcount = 0, evencount = 0;
	 
	 
	 while( num >0)
	 {
		 @SuppressWarnings("unused")
		 int digit = num % 10; 
		 
		 if(num%2==0)
		 {
			evencount ++; 
		 }
		 else
		 {
			 oddcount++;
		 }
		 
		 num = num /10;
	 }
	 
	 
	 System.out.println("Count the odd Number : " + oddcount);
	 System.out.println("Count  the even Number : " + evencount);
	 
	 sc.close();
	 
	 
	 
	 
	 
	
}

}
