package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

import com.bridgelabz.fellowshipprogram.datastructure.Utility;

public class NewGEneric {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter no.of element\n");
	int numberOfElement=scanner.nextInt();
	Integer[] integerArray=new Integer[numberOfElement];
	
	System.out.println("Enter element\n");
	for(int i=0;i<numberOfElement;i++) {
		integerArray[i]=scanner.nextInt();
	}
	
	NewGenericType<Integer> newGeneric=new NewGenericType<Integer>(integerArray);
	int[] intArray=new int[numberOfElement];
	for(int i=0;i<numberOfElement;i++) {
		intArray[i]=newGeneric.getArray(i);
	}
	System.out.println("This is Sorted Array using Bubble Sort\n");
	intArray=Utility.bubblesort(intArray);
	for(int i=0;i<numberOfElement;i++) {
		System.out.print(intArray[i]+"  ");
	}
	
	
	
}
}
