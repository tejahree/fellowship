package com.bridgelabz.fellowshipprogram.basiccoreprogram;
import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]){
		int n,d,c=0,a=4;
		System.out.println("enter the year");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		while (n!=0){
		d=n%10;
		c++;
		n=n/10;
		}
	
		if(c==a){
		if(n%4==0){
		if(n%100==0){
		if(n%400==0)
		System.out.println("it is a leap year");

		}else
		System.out.println("it is not a leap year");
		}else
		System.out.println("it is a leap year");

		}
		else {
			System.out.println("Please enter the 4 digit number");
		}
}
}
