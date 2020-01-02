package com.bridgelabz.fellowshipprogram.junittesting;
import java.util.*;
public class MonthlyPayment {
   
	static void util(int P,int Y,double R)
	{
		  double Payment;
		  double r,n;
		r= R/(12 * 100);
		n=12*Y;
		Payment= P*r/(1-Math.pow((1+r), (-n)));
		System.out.println("paynment is : " + Payment);
	}
	public static void main(String args[]) {
	 int principle,year;
	 double rate;
	 System.out.println("enter the principle,time in year and the rate");
	 Scanner sc= new Scanner(System.in);
	 principle= sc.nextInt();
	 year= sc.nextInt();
	 rate=sc.nextDouble();
	 util(principle,year,rate);
	}
	
	
}
