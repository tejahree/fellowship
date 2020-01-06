package com.bridgelabz.fellowshipprogram.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.fellowshipprogram.datastructure.UnOrderedList.Node;

public class LinkedListUnOrdered {
	
	 static void printlist(UnOrderedList list) {
		   Node last= list.head;
		   System.out.println("Linked list\n");
		   while(last!=null) {//here we cannot write while(list.next!=null) because the last node of list has its next
			   //value null of if list.next!=null then it will not enter into the while loop and the last value of the list 
			   //will not print
			   System.out.println(last.data);
			   last=last.next;
		   }
	   }
	   public static String[] listToIntArray(UnOrderedList list) {
			int size	=size(list);
				String[] StringArray= new String[size];
				int i=0;
				//String string=null;
				Node currNode;//currently it is initilized by default
				currNode=list.head;
				while(currNode!=null) {
				
					StringArray[i]=currNode.data;
					i++;
					if(i==size)
						break;
					currNode=currNode.next;
			}return StringArray;
			}
	   
	   public static int size(UnOrderedList list) {
				int sizeOfList=0;
				Node currNode;//currently it is initilized by default
				currNode=list.head;
			

				while(currNode!=null) {
					sizeOfList++;
				    currNode=currNode.next;
			}
				return sizeOfList;
			}

	   public static void main(String[] args) throws IOException {

		   BufferedReader rr= new BufferedReader(new FileReader("/home/kumar/Desktop/dir/String2.txt"));
		   Scanner sc=new Scanner(System.in);
		   String s=rr.readLine();
		   System.out.println("string\n");
		   System.out.println(s+"\n");
		   String[] stringarray= s.split(" ");
		   UnOrderedList list= new UnOrderedList();
		   for(int i=0;i<stringarray.length;i++) {
			   list=UnOrderedList.insertAtEnd(list,stringarray[i]);
		   }

		   printlist(list);
		   System.out.println("Enter the string to be pop\n");
		   String string = sc.next();
		   list=UnOrderedList.pop(list,string);

		   String[] stringArray	=listToIntArray(list);
		   String convertedStringArray=Utility.stringArrayToString(stringArray);
	

	
		   BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter("/home/kumar/Desktop/dir/String2.txt"));
		   bufferedWriter.write(convertedStringArray);

		   bufferedWriter.close();
		   printlist(list);
}
}

