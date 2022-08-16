package com.problems;

public class ReverseWordInString {
	
	public static String reverse(String str) {
		
		StringBuffer sb = new StringBuffer(str);
		
		for(int i=0;i<sb.length()/2;i++) {
			
			char ch = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(sb.length()-i-1));
			sb.setCharAt(sb.length()-i-1, ch);
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "this book is mine";
		String rev1 = reverse(str);
		
		StringBuffer sb = new StringBuffer();
		int from = 0;
		for(int i=0;i<rev1.length();) {
			
			int ind = rev1.indexOf(" ", i);
			
			if(ind==-1 && i<rev1.length()) {
				ind = rev1.length();
			}
			
			String temp = rev1.substring(i, ind);
			System.out.print(reverse(temp));
			i = ind+1;
		}
			
		
	}

}
