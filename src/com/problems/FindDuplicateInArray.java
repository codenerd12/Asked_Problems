package com.problems;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateInArray {
	
	//Find Duplicate in Array for range 1 to n-1 and range 1 to n+1 
	public static List<Integer> findDuplicate(int[] arr) {
		
		int n = arr.length;
		List<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++)
            arr[arr[i]%n] = arr[arr[i]%n]+n;
        
        
        for(int i=0;i<n;i++) {
        	
        	if(arr[i]/n>1)
        		ans.add(i);
        }
          
        
        
        if(ans.size()==0)
            ans.add(-1);
        
        return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {13, 9, 25, 1, 1, 0, 22, 13, 22, 
				20, 3, 8, 11, 25, 10, 3, 15, 11, 19, 
				20, 2, 4, 25, 14, 23, 14};
		
		System.out.println(findDuplicate(arr));

	}

}
