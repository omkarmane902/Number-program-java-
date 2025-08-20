//print only even number

import java.util.Scanner;

public class print_even_number {
    
public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);

     System.out.print("Enter the number");

     int number = sc.nextInt();


     while(number > 0)
     {
       int temp = number % 10;

       if (temp % 2 ==0)
        {
        System.out.println("Even number :"+temp);
        }
        number = number/10;
     }
     sc.close();
    }
}
