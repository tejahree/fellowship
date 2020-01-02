package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	
	static boolean anagramOrNot(char[] str,char[] str1) {
		int n1=str.length;
		int n2=str1.length;
		
		if(n1!=n2)
	
			return false;
		Arrays.sort(str);
		Arrays.sort(str1);
		for(int i=0;i<n1;i++) 
			if(str[i]!=str1[i])
				return false;
		
		
		
		return true;
	}
public static void main(String args[]) {
	
	
	Scanner sc= new Scanner(System.in);
	
	
	System.out.print("Enter the String 1: ");
	
	char str[]=sc.next().toCharArray();
	
	System.out.println("Enter the String 2: ");
	char str1[]= sc.next().toCharArray();
if(anagramOrNot(str,str1)) {
	System.out.println("both string are Anagram");
}else {
	System.out.println("both string are not anagram");
}
	
}
}
