package com.problems;

public class SquareRootOfNumber {
	
	private static float sqrt(int num) {
		
		if(num==0 || num==1)
			return num;
		
		double ans = 0;
		
		long start = 1;
		long end = num/2;
		
		while(start<=end) {
			
			long mid = (start+end)/2;
			
			if(mid*mid==num) {
				ans = mid;
				break;
			}
			
			if(mid*mid<num) {
				start = mid+1;
				ans = mid;
			} else
				end = mid-1;
				
		}
		
		//System.out.println("-->"+ans);
		//with precision 2 for decimal which is not perfect square
		double increment = 0.1;
		for(int i=0;i<2;i++) {
			
			while(ans*ans<=num)
				ans += increment;
			
			ans = ans-increment;
			//System.out.println("-->"+ans);
			increment = increment/10;
			//System.out.println("****"+increment);
			
		}
		
		System.out.println(ans);
		//System.out.printf("%.2f", ans);
		return (float)ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		System.out.println("Square Root:"+sqrt(num));

	}


}
