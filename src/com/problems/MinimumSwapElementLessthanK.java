package com.problems;

public class MinimumSwapElementLessthanK {
	
	private static int minimumSwap(int[] arr, int k) {
		
		int greater = 0;
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>k) {
				greater++;
			} else if(greater > 0) {
				int temp = arr[i];
				arr[i] = arr[i-greater];
				arr[i-greater] = temp;
				count++;
			}
			
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		int arr[] = {2, 7, 9, 5, 8, 7, 4};
		int k = 5;
		
		System.out.println("Min SWAP: "+minimumSwap(arr, k));

	}

}
