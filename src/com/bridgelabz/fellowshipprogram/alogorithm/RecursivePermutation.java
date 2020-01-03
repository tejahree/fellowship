package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

public class RecursivePermutation {
	
public static void main(String[] args) {
	String s;
	System.out.println("Enter the string\n");
	Scanner sc = new Scanner(System.in);
	s=sc.next();
	char[] array=new char[s.length()];
	for(int i=0;i<s.length();i++)
		array[i]=s.charAt(i);
	recursion(array);
	
}

static void recursion(char[] array) {
	int length=array.length;
	int count=0;
	int fact=factorial(length);
	char[] duplicate=new char[length];
	
	while(count!=fact) {
			for(int i=0;i<length;i++) {
				for(int j=0;j<length;j++) {
					
					duplicate=swap(array,i,j);
						if(i!=j) {
							for(char c:duplicate) {
								System.out.print(c);
							}
							count++;
						}
						
						System.out.println();
						
				}
			
			System.out.println();
			}
			
	}
	
}

static char[] swap(char[] array,int a,int b) {
	char temp;
	temp=array[a];
	array[a]=array[b];
	array[b]=temp;
	return array;
}

static int factorial(int length) {//this is calculating factorial of the length of string
	int sum=1;
for(int i=length;i>=1;i--) {
	sum=sum*i;
}
	return sum;
}
}
