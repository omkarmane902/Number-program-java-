package number_program_all;

import java.util.Scanner;

public class Armstrong_Number {

    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        
        int num = sc.nextInt();
        
        int count = 0;
        
        int temp = num;
        
        int num1 = num;
        
        int sum = 0;
        while (num != 0) 
        {
            num /= 10;
           
            count++;
        }
        
        
        
        while (num1 != 0)
        {
        	int extract = num1 % 10 ;
        	
        	int fact = 1;
        	
        	
        	for(int time = 0 ; time < count ; time++)
        	{
        	   fact = fact * extract;	
        	}
        	
        	sum = sum + fact;
        	
        	num1 /= 10 ;
           
        
        }
        
        if (temp == sum)
        {
            System.out.println(temp + " is an Armstrong Number");
        } else 
        {
            System.out.println(temp + " is NOT an Armstrong Number");
        }
        
        
        sc.close();
    }
}
