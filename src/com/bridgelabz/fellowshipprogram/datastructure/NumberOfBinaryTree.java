package com.bridgelabz.fellowshipprogram.datastructure;

import java.util.Scanner;

public class NumberOfBinaryTree<T> {
	void binaryTreeMethod(int number) {
		

		long[] G= new long[number+1];
	
		G[0]=1;
		G[1]=1;
		for(int i=2;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				G[i]+=G[j-1]*G[i-j];
				
			}
		}
		System.out.println(G[number]);
	}
	public static void main(String[] args) {
	 NumberOfBinaryTree<Integer> binaryTree= new NumberOfBinaryTree<Integer>();
	 System.out.println("Enter the number of element\n");
	 Scanner scanner= new Scanner(System.in);
	 int numberOfElement=scanner.nextInt();
int[] numberOfTestCase= new int[numberOfElement];
	 for(int i=0;i<numberOfElement;i++) {
		 numberOfTestCase[i]=scanner.nextInt();
	 }
	 System.out.println(numberOfTestCase[3]);
	 for(int i=0;i<numberOfElement;i++) {
	 binaryTree.binaryTreeMethod(numberOfTestCase[i]);
	 }
	}
}
