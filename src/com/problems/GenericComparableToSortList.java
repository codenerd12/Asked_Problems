package com.problems;
import java.util.stream.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class GenericComparableToSortList {
	
	
	public static <T extends Comparable<T>> boolean isSorted(List<T> list) {
		
		T prev = list.get(0);
		for(int i=1;i<list.size();i++) {
			
			if(prev.compareTo(list.get(i))>0)
				return false;
			
			
			prev = list.get(i);
		}
		
		return true;
	}

	public static void main(String[] args) {

		
		System.out.println(isSorted(Arrays.asList(1.0,12.0,3.0,4.0,5.0)));
		
	}

}
