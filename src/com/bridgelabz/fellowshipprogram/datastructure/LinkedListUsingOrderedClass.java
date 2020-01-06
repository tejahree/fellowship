package com.bridgelabz.fellowshipprogram.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.fellowshipprogram.datastructure.OrderedList.Node;

public class LinkedListUsingOrderedClass {
	
	
	public static void main(String[] args) throws IOException {
		String stringFromFile;
		
		Utility utility= new Utility();
		File file =new File("/home/kumar/Desktop/dir/String44.txt");
		BufferedReader bufferedReader= new BufferedReader(new FileReader(file));
		stringFromFile = bufferedReader.readLine();//take the data from file and put it into str varibale of type string
		System.out.println(stringFromFile);
		
		String[] arrSplit = stringFromFile.split(" ");
		
		for(int i=0;i<arrSplit.length;i++){
		System.out.print(arrSplit[i]+"  "+"\n");	
		}
		System.out.println();
	
		int intArray[]= new int[arrSplit.length];// this create the array of integer 
		// so that we can convert the char array into integer array because the input is integer 
		for(int i=0;i<arrSplit.length;i++) {// this for loop will convert the char array into int array
			intArray[i]=Integer.parseInt(arrSplit[i]);// because as its a char array the ascii value of digit start from 48=0,49=1 and so on
		}
		
		     System.out.println("This is Entered Integer data: ");
		     for(int i=0;i<arrSplit.length;i++) {
						System.out.print(intArray[i]+" "+"\n");
			}
		     int[] sortedArray= new int[intArray.length];
					sortedArray=utility.bubblesort(intArray);
		
		  
		     
		     		OrderedList list = new OrderedList();
	     			
						for(int i=0;i<sortedArray.length;i++) {//the array is sorted now this is putting the sorted value in the linkedlist
							list=OrderedList.insertAtEnd(list,sortedArray[i]);
						}
						
							System.out.println("this is sorted linkedlist\n");
							utility.printlist(list);//this will print sorted array
							System.out.println("Enter the number u want to pop\n");
							Scanner scanner= new Scanner(System.in);
		     				int n=scanner.nextInt();
		     			
		     				
		
		     					list=OrderedList.pop(list,n);
		     				
		     				int[] integerArray	=utility.listToIntArray(list);
		     				String string=Utility.intArraytoString(integerArray);
		     				
		     				
		     				
		     			BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter("/home/kumar/Desktop/dir/String44.txt"));
		     				bufferedWriter.write(string);
		     				bufferedWriter.close();
		     				utility.printlist(list);
	}
	}

