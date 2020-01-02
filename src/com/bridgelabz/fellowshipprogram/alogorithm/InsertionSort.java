package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

public class InsertionSort {
 public static void main(String args[]) {
	 int n,y,j;
	 System.out.println("ENTER THE NUMBER OF ELEMENT:\n");
	 Scanner sc= new Scanner(System.in);
	 n=sc.nextInt();
	 int a[]= new int[n];
	 System.out.println("ARRAY:-\n");
	 for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	 }
	 for(int i=1;i<n;i++) {
		 y=a[i];
		 for( j=i;j>0 && y<a[j-1];j-- )
			 a[j]=a[j-1];
		  a[j]=y;
	 }
	 System.out.println("SORTED ARRAY:- ");
	 for(int i=0;i<n;i++) {
		 System.out.print(a[i] +" ");
	 }
 }
}
