package com.jsp.Reverse_A_String;

public class SecondLargest {

	public static void main(String[] args) {
		
		int [] arr = {10, 20, 5, 8, 25};
		
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>largest)
			{
				
				secondLargest = largest;
				 largest = arr[i];
			}
			else if (arr[i] > secondLargest) 
			{
				 	secondLargest = arr[i];
			}	
			
		}
		
		System.out.println(secondLargest);
	}
}
