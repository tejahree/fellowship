package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

import com.bridgelabz.fellowshipprogram.datastructure.Utility;

public class Anagram {
	
	
	
public static void main(String args[]) {
	Utility utility=new Utility();
	
	Scanner sc= new Scanner(System.in);
	
	
	System.out.print("Enter the String 1: ");
	
	char str[]=sc.next().toCharArray();
	
	System.out.println("Enter the String 2: ");
	char str1[]= sc.next().toCharArray();
if(utility.anagramOrNot(str,str1)) {
	System.out.println("both string are Anagram");
}else {
	System.out.println("both string are not anagram");
}
	
}
}
