package com.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CombinationSum {
	
	public static int combination(int[] arr, int ind, int target, int[] dp) {
        
        if(target<0)
            return 0;
        
        if(dp[target]!=0)
        	return dp[target];
        
        if(target==0)
        	return 1;
        
        int ans = 0;
        for(int i=0;i<arr.length;i++) {
            ans += combination(arr, i, target-arr[i], dp);
        }
        
        dp[target] = ans;
        
        return dp[target];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3};
		int target = 4;
		int[] dp = new int[target+1];
        int res = combination(nums, 0, target, dp);    
        System.out.println(res);
        
        

	}

}
