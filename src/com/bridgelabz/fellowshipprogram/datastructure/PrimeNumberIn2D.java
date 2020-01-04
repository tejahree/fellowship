package com.bridgelabz.fellowshipprogram.datastructure;

public class PrimeNumberIn2D {
	
	
	
	public static void main(String args[]) {
		
			int[] primeNumberArray=new int[168];
			primeNumberArray=Utility.returnPrimeNumberArray();
			/**
			 * array2d is 2D array to save primenumber in a specific range 
			 */
			int[][] array2d=new int[10][25];
			int f=0;
			int num=0;
			int rangeNo1=0;
			int rangeNo2=100;
				for(int m=0;m<10;m++) {
					for(int n=0;n<25;n++) {
			
						if((f<168)) {
							num=primeNumberArray[f];
								//	if(num<rangeNo2)
							array2d[m][n]=primeNumberArray[f];
							f++;
						}
						//if its is less or greater then given range this column loop will stop and 
						//row mean i value will increase
						if(!(num>rangeNo1 && num<rangeNo2-1))
							break;
					}
						rangeNo1=rangeNo1+100;//this increase the range by 100
						rangeNo2=rangeNo2+100;
				}

				/**
				 * this reverseArray will save the value of column into row and row into
				 * column
				 */
				int[][] reverseArray=new int[25][10];
					for(int m=0;m<10;m++) {
						for(int n=0;n<25;n++) {
							reverseArray[n][m]=array2d[m][n];
						}
		
					}
					/**
					 * this print the reverse Array
					 */
					System.out.println("100"+"  "+"200"+"  "+"300"+"  "+"400"+"  "+"500"+"  "+"600"+"  "+"700"+"  "+"800"+"  "+"900"+" "+"1000"+"\n");
						for(int m=0;m<25;m++) {
							for(int n=0;n<10;n++) {
								String p=String.format("%3d", reverseArray[m][n]);
								System.out.print(p+"  ");
							}
							System.out.println();
						}
			}

	}

