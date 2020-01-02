package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generic {
	
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter no.of element\n");
	int n=sc.nextInt();
	List<Integer> list=new ArrayList<Integer>();
	System.out.println("Enter element\n");
	for(int i=0;i<n;i++) {
		list.add(sc.nextInt());
	}
	//System.out.println(list);
	Integer[] arr= new Integer[n];
	arr=list.toArray(arr);
	System.out.println("This is conversion of list to array \n");
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+"   ");
	}
	System.out.println("\n");
	bubblesort(arr);
}
static void bubblesort(Integer[] arr) {
	for(int i=0;i<arr.length-1;i++)
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				arr[j]=arr[j]+arr[j+1];
				arr[j+1]=arr[j]-arr[j+1];
				arr[j]=arr[j]-arr[j+1];
			}
		}
	System.out.println("Sorted array using generic"
			+ "\n");
	for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+"   ");
}
}
