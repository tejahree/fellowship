package com.bridgelabz.fellowshipprogram.junittesting;
import java.util.*;
public class Temperature {
  static void temperatureconversion(int n) {
	  double t,a,celsius,fahrenheit;
	  Scanner s= new Scanner(System.in);
	  if(n==1) {
		  System.out.println("enter the temperature in fahrenheit");
		  t=s.nextDouble();
		  celsius = (t-32)*5/9;
		  System.out.println("fahrenheit to celsius: "+ celsius);
	  }else {
		  System.out.println("enter the temperature in celsius");
		  a=s.nextDouble();
		  fahrenheit=(a*9/5)+32;
		  System.out.println(" celsius to fahrenheit: "+ fahrenheit);
	  }
	  
  }
  public static void main(String args[]) {
	  int n;
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter 1 if change the temperature to Celsius or 0 for fahrenheit");
	  n=sc.nextInt();
	  temperatureconversion(n);
	  
	  
  }
}
