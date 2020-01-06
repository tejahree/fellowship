package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

public class MergeSort {
	public static void mergeSort(int[] array,int l,int h){
		int mid;
		if(l<h){
			mid=(l+h)/2;
			mergeSort(array, l, mid);
			mergeSort(array,mid+1,h);
			merge(array,l,mid,h);
		}
	}
	public static void merge(int[] array,int l,int m,int h){
		int[] mergeArray=new int[10];
		int[] leftArray=new int[];
		int[] rightArray=new int[];
		int k=0;
		int i=l;
		int j=m+1;
		
		while(i<=m && j<=h){
			if(array[i]<array[j]){
				mergeArray[k++]=array[i];
				i++;
				

			}
			else{
				mergeArray[k++]=array[j];
				j++;
				
			}
		}
		for(;i<=m;i++){
			mergeArray[k++]=array[i];
			
		}
		for(;j<=h;j++){
			mergeArray[k++]=array[j];
	
		}
		printArray(mergeArray);
	}
	static void printArray(int[] array){
		int sizeOfArray= array.length;
		for(int i=0;i<sizeOfArray;i++){
			System.out.print(array[i]+"  ");
		}
		System.out.println();
		
	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the number to element to sort\n");
	int sizeOfArray= scanner.nextInt();
	int[] array= new int[sizeOfArray];
	for(int i=0;i<sizeOfArray;i++){
		array[i]=scanner.nextInt();
	}
	
	mergeSort(array,0,sizeOfArray-1);
	System.out.println("this is sorted array\n");
	printArray(array);
}
}
