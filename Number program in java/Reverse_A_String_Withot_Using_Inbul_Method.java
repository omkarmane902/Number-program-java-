package com.jsp.Reverse_A_String;



public class Reverse_A_String_Withot_Using_Inbul_Method {
	
	public static void main(String[] args) {
		
		String input = "hello";
		String reverse = "";
		
		
        for (int i = input.length()-1; i >= 0 ; i--) {
        	
        	
        	reverse = reverse + input.charAt(i);
			
		}
        System.out.println("Reversed String: " + reverse);
	}

}
