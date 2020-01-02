package com.bridgelabz.fellowshipprogram.basiccoreprogram;
import java.util.*;
public class Harmonic {
	public static void main(String args[]) {
		int n;
		float sum=1;
		System.out.println("enter the number to find harmonic");
	 Scanner sc= new Scanner(System.in);
	 n=sc.nextInt();
	
	 for(int i=2 ;i<=n;i++) {
	 sum= sum+(float)1/i;
		}
	 System.out.println("harmonic value of "+ n+"th term is  "+ sum );
	 
	 
	
	
}}
