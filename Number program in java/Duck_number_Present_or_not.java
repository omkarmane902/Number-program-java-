package number_program_all;

import java.util.Scanner;

public class Duck_number_Present_or_not {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner object तयार

        System.out.println("Enter the number:");  // यूजरला संख्या विचारणे
        int num = sc.nextInt();  // यूजरकडून संख्या घेणे

        int originalNum = num;
        boolean isDuck = false;

        // प्रत्येक digit तपासणे
        while (num > 0) {
            if (num % 10 == 0) {
                
                break;
            }
            num /= 10;
        }

        // निकाल दाखवणे
        if (originalNum > 0 && isDuck) {
            System.out.println("Duck number");
        } else {
            System.out.println("Not a duck number");
        }

        sc.close();  // Scanner बंद करणे
    }
}
