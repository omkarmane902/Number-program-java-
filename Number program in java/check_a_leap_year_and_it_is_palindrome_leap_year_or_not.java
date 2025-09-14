package number_program_all;

import java.util.Scanner;

public class check_a_leap_year_and_it_is_palindrome_leap_year_or_not {

    public static void main(String [] args) {
        
        Scanner sc = new Scanner(System.in);  
        
        System.out.print("Enter the year : ");
        int year  = sc.nextInt();
        
        int temp = year;   
        int rev = 0;
        
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(temp + " is Leap Year ");    
             
            
            while (year > 0) {
                rev  = rev * 10 + (year % 10);
                year /= 10;
            }
            
            
            if (temp == rev) {
                System.out.println(temp + " : is palindrome Leap Year"); 
            } else {
                System.out.println(temp + " : is not palindrome Leap Year"); 
            }
        } else {
            System.out.println(temp + " is not Leap Year");  
        }
        
        sc.close();
    }
}
