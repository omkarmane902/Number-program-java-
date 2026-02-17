package com.jsp.Reverse_A_String;

import java.util.Arrays;

public class Merge_Two_Sorted_Arrays {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1, 3, 5};
		int[] arr2 = {2, 4, 6, 5, 46};  // ⚠ This is NOT fully sorted
		
		int[] merged = new int[arr1.length + arr2.length];
		
		int i = 0, j = 0, k = 0;

		// Main merge loop
		while (i < arr1.length && j < arr2.length) {
			
			if (arr1[i] < arr2[j]) {
				merged[k] = arr1[i];
				i++;
			} else {
				merged[k] = arr2[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of arr1
		while (i < arr1.length) {
			merged[k] = arr1[i];
			i++;
			k++;
		}

		// Copy remaining elements of arr2
		while (j < arr2.length) {
			merged[k] = arr2[j];
			j++;
			k++;
		}

		System.out.println(Arrays.toString(merged));
	}
}
