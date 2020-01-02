package com.bridgelabz.fellowshipprogram.junittesting;

import java.util.Scanner;

public class BinarySwapNibbles {
	
		static int[] swap(int[] binary2,int length) {//this SWAP METHOD will swap the nibble and return the array
			int temp;
			for(int l=0;l<(length/2);l++) {
				temp=binary2[l+4];
				binary2[l+4]=binary2[l];
				binary2[l]=temp;
			}
			return binary2;
		}
	
		static void tobinary(int n) { //this method convert the decimal number to binary number{
			int binary[]= new int[32];
			int binary2[]= new int[8];
			int i=0;
				while(n>0) {
					binary[i]=n%2;
					n= n/2;
					i++;
				}

				if(i<8) {
					while(i!=7) {
						binary[i]=0;
						i++;
					}
				}
				
				int k=0;
				System.out.println("DECIMAL TO BINARY CONVERSION: \n");
				for(int j=i;j>=0;j--) {
					binary2[k]=binary[j];
					k++;
				}
	
				for(int f=0;f<8;f++) {
					System.out.print(binary2[f]);//this for loop will print the binary number of decimal number
				}
				System.out.println("\n");
		
				System.out.println("SWAP THE NIBBLES :--\n");
				int length=binary2.length;
				int[] swaparray=new int[8];//this is an new created array to assign the swap binary number
				
				swaparray=swap(binary2,length);//this binary2 array will passed to the swap method and return the swap array
				for(int f=0;f<8;f++) {
					System.out.print(swaparray[f]);
				}//this for loop will print the swap array
				System.out.println("\n");
	
				int decimal=binarytodecimal(swaparray);//the swaparray will passed to binarytodecimal method and return the int value
		
				System.out.println("BINARY TO DECIMAL CONVERSION :-\n");
				System.out.println(decimal);
	}	
	
	static int binarytodecimal(int[] swaparray) {//this method will return binary to decimal conversion
		int k=0;
			int sum=0;
		int[] decimalarray=new int[8];
		for(int j=7;j>=0;j--) {
			decimalarray[k]=swaparray[j];
			k++;
		}
		
		for(int l=0;l<8;l++) {
			int n=(int)(Math.pow(2, l));
			sum=sum+(decimalarray[l]*n);
		}
		return sum;
	}
	
public static void main(String args[]){
	int n;
	DecimalToBinary d=new DecimalToBinary();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Decimal Number");
	n= sc.nextInt();
	tobinary(n);
}
}
