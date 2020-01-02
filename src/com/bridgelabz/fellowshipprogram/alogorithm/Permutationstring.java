package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

public class Permutationstring {
	
	static void combination(char[] array) {
		int length=array.length;
		int n=fact(length);
		int count=0;
		char temp;
		
		while(count!=n) {
			for(int i=0;i<length;i++) {
				for(int j=0;j<length;j++) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					if(i!=j) {
						 for (char c : array) { 
					            System.out.print(c); 
					        } 
						 count++;
						}
					System.out.println();
					}
			}
		}
	}
	
	static int fact(int length) {
		int sum=1;
		for(int i=length;i>=1;i--)
			sum=sum*i;
		return sum;
	}
	
public static void main(String[] args) {
	System.out.println("Enter the string\n");
	String s;
	Scanner sc=new Scanner(System.in);
	s=sc.next();
	char[] array= new char[s.length()];
	for(int i=0;i<s.length();i++) {
		array[i]=s.charAt(i);
	}
	combination(array);
	
}
}
