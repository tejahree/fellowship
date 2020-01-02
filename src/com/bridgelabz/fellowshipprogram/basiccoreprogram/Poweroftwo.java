package com.bridgelabz.fellowshipprogram.basiccoreprogram;
import java.util.*;
import java.io.*;

public class Poweroftwo {
	public static void main(String args[]){
		int n;
		int
		sum=1;
		System.out.println("enter the number for power of two");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Table of 2^"+n);
		for(int i=1;i<=n;i++) {
			sum=sum*2;
			System.out.println("2^"+i+ "="+sum);
		}
		System.out.println("\n");
		for(int i=0;i<n;i++){
		sum= sum* 2;

		}
		System.out.println("Whether year is leap year or not\n");
		if(sum%4==0){
		if(sum%100==0){
		if(sum%400==0)
		System.out.println("it is a leap year");

		}else
		System.out.println("it is not a leap year");
		}else
		System.out.println("it is a leap year");

		}



		}

