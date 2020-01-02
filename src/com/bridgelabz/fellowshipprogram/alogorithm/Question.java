package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

public class Question {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
System.out.println("enter number\n");
	int a=sc.nextInt();
	int n=(int)Math.pow(2, a);
	System.out.println("Think any number between " + 0 +"and " + (n-1));
	int scerate = find(0,n);
	System.out.println("you guess is:  " + scerate);
}

private static int find(int l, int h) {
	Scanner sc= new Scanner(System.in);
  if((h-l)==1)
	  return l;
 int mid=(l+h)/2;
 System.out.println("Is it less then this number ?  "+mid);
 boolean result=sc.nextBoolean();
 if(result==true) {
	 return find(l,mid);
 }
 else {
	return find(mid,h);
 }
}
}
