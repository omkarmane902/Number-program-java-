//Xylem Number: जर संख्येच्या extreme digits (पहिला आणि शेवटचा अंक) यांची बेरीज = mean digits (मध्ये असलेल्या अंकांची बेरीज) असेल, तर ती संख्या Xylem Number आहे. 
//👉 Phloem Number: जर संख्येच्या extreme digits यांची बेरीज ≠ mean digits यांची बेरीज असेल, तर ती संख्या Phloem Number आहे. 
//1) 12321 //Extreme digits → 1 + 1 = 2 
//Mean digits → 2 + 3 + 2 = 7 
//(2 ≠ 7) → Phloem Number 



//2)132 
//Extreme digits → 1 + 2 = 3
//Mean digit → 3 
//(3 = 3) → Xylem Number
package number_program_all;

import java.util.Scanner;

public class Xylem_Phloem_Number 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :  ");
        int num = sc.nextInt();

        int temp = num;

        
        int lastDigit = temp % 10;
        temp /= 10;

        
        int middleSum = 0;
        while (temp > 9)
        {   
            middleSum += temp % 10;
            temp /= 10;
        }

        
        int firstDigit = temp;

        
        int endsum = firstDigit + lastDigit;

        if (endsum == middleSum) 
        {
            System.out.println("This is the Xylem number : " + num);
        } 
        else 
        {
            System.out.println("This is the Phloem number : " + num);
        }

        sc.close();
    }
}
