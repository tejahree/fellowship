package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

public class AnagramPlain {
	
	
	public static boolean Anagram(int n) {
		 int i;
		 for(i=2;i<=10;i++) {
			 if(n*i==n)
				 return true;
		 }
		
		return false;
	}
	 public static boolean plaindrom(int i) {
		 int d,c=0,temp=i;
	double sum=0;
		 while(i!=0) {
			 d=i%10;
			 c++;
			 i=i/10;
		 }
		 while (i!=0) {
			 d=i%10;
			 sum=sum+Math.pow(d, c);
			 i=i/10;
		 }
		 if(sum==i)
			  return true;
		 else return false;
		 
	 }
	 
	 public static void check(int n) {
		 
		 
		if(Anagram(n) && plaindrom(n)) {
			System.out.println("NUMBER IS BOTH ANAGRAM AND PLAINDROM NUMBER");
		}else {
			System.out.println("NUMBER IS NOT ANAGRAM AND PLAINDROM NUMBER");
		}
			
	 }
	 

	public static void main(String args[]) {
		int n,i=1;
		System.out.println("Enter the number\n");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		for(int j=500 ;j<=1500;j++) {
		do {
			i++;
		}while (j%i!=0) ;
			if(j==i)
				check(n);
			else
				System.out.println("Number is not prime number");
		}
			
	}
}
