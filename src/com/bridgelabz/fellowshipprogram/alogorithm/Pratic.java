package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.HashSet;
import java.util.Set;

import com.bridgelabz.fellowshipprogram.datastructure.Utility;

public class Pratic {
	public static void main(String[] args) {
		int[] array= {24,89,98,65,56};
		Set<Integer> set= new HashSet<Integer>();
		for(int i=0;i<array.length;i++  ) {
			for(int j=0;j<array.length;j++){
				if(i!=j) {
				if(Utility.anagramnumber(array[i],array[j])) {
					set.add(array[i]);
					set.add(array[j]);
				}
				else
					continue;
				}
			}
		}
System.out.println(set);
	}
}
