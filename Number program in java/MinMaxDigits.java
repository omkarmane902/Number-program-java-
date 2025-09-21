package number_program_all;

import java.util.Scanner;

public class MinMaxDigits {

	
	public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        
        int number = input.nextInt();
        
        int originalNumber = number; 
        
        int minDigit = 9;
        
        int maxDigit = 0; 

        if (number == 0)
        {
            minDigit = 0;
            maxDigit = 0;
        } 
        else 
        {
            while (number != 0) 
            {
                int digit = number % 10;
                
                
                if (digit < minDigit)
                {
                    minDigit = digit;
                }
                if (digit > maxDigit) 
                {
                    maxDigit = digit;
                }
                
                number /= 10;
            }
        }

        System.out.println("For the number " + originalNumber + ":");
        System.out.println("Smallest digit is: " + minDigit);
        System.out.println("Largest digit is: " + maxDigit);
        
        input.close();
    }
}
