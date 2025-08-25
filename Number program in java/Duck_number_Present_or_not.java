package number_program_all;

import java.util.Scanner;

public class Duck_number_Present_or_not 
{
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);  

        System.out.println("Enter the number:");  
        int num = sc.nextInt();  

     

        while(num > 0  )
        {
        	if(num % 10 == 0)
        	{
        		break;
        	}
        	else
        	{
        		num /= 10;
        	}
        	
        }
        
        if(num>0)
        {
        	System.out.println("This Number is Duck Number");
        }
        else 
        {
        	System.out.println("This Number is not Duck Number");
        }
        
        
        sc.close();
         
    }
	
}
