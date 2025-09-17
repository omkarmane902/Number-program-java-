//दोन संख्यांना Co-Prime किंवा सापेक्ष प्रमुख म्हणतात जर त्यांचा GCD (Greatest Common Divisor / महत्तम सामान्य विभागक) = 1 असेल.
//म्हणजेच, त्या दोन संख्यांकडे फक्त 1 हा एकमेव सामान्य भागकर्ता आहे.

package number_program_all;

import java.util.Scanner;

public class Co_Prime_Numbers {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		
		int num1 = sc.nextInt();
		
		
		System.out.print("Enter the first number : ");
		
		int num2 = sc.nextInt();
		
		//int small = (num1 < num2)? num1 : num2; 
		
		int small;
		
		if (num1 < num2)
		{
		   small = num1;	
		}
		else
		{
			small = num2;
		}
		
		 
		while(true)
		{
		if(num1 % small == 0 && num2 %small==0)
		{
		  
		   break;
		}
		small--;
		}
		
		if(small == 1)
		{
			System.out.println("This is Co-Prime Numbers");
		}
		else
		{
            System.out.println("This is Co-Prime Numbers");
		}
		sc.close();
		
	}
}
