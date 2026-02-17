package com.jsp.Reverse_A_String;

public class Find_Duplicate_Number {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 2, 5};
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i +1; j < arr.length; j++) {
				
				if(arr[i]==arr[j])
				{
					  System.out.println("Duplicate Number: " + arr[i]);
				}
				
			}
			
		}
		
	}

}
