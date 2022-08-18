package com.problems;

public class PowerSet {
	
	
	private static void printAllSubSequence(String str) {
		
		int n = str.length();
		
		for(int i=0;i<=Math.pow(2, n)-1;i++) {
			
			String temp = "";
			
			for(int j=0;j<str.length();j++) {
				
				int a = i & (1<<j);
				
				if(a!=0)
					temp += str.charAt(j); 
				
				
			}
			
			System.out.println(temp);
		}
		
		
	}
	

	public static void main(String[] args) {
		String str = "abc";
		
		printAllSubSequence(str);

	}

}
