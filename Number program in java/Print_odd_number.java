// print only odd number


import java.util.Scanner;

public class Print_odd_number {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int number = sc.nextInt();


        while (number > 0) {
            int temp = number % 10;
            if (number%2 !=0) {
               System.out.println("Odd number :" +temp);
               
            }
            number = number /10;
        }
        sc.close();
    }
}
