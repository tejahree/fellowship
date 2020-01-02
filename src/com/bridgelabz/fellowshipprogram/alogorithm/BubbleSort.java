package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String args[])
{int i,j,n,temp;
System.out.println("Enter the Number of  element");
Scanner sc= new Scanner(System.in);
n=sc.nextInt();

int arr[]=new int[n];
System.out.println("Enter the Array");
for(i=0;i<n;i++) {
	arr[i]=sc.nextInt();
	
}

for(i=0;i<n-1;i++)
	for(j=0;j<n-1;j++) {
		if(arr[j]>arr[j+1]) {
			temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		
	}}
System.out.println("Sorted Array: ");
for(int k=0;k<n;k++) {
	
	System.out.print(arr[k]+" ");
}
}
}