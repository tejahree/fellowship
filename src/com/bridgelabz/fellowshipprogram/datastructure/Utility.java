package com.bridgelabz.fellowshipprogram.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import com.bridgelabz.fellowshipprogram.datastructure.OrderedList.Node;



/**
 * @author admin1
 *
 */
public class Utility {
public static int[] bubblesort(int[] arr) {
	int temp;
	for(int i=0;i<(arr.length)-1;i++)
		for(int j=0;j<(arr.length)-1;j++) {
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			
		}}
	return arr;
}
/**
 * @author admin1
 *
 */
public static int[] frequenceOfNumber(int e1) {
int[] checkFrequencyArray=new int[10];
	while(e1>0) {
		int d=e1%10;
		checkFrequencyArray[d]++;
		e1=e1/10;
		
	}
	return checkFrequencyArray;
}
public static boolean leapYear(int year) {
	if(year%4==0){
		
		if(year%100==0){
			
		if(year%400==0) 
			return true;
		else
			return false;	
		
}
		else
		return false;
		}
	else
		 return true;
}

public static int day(int month, int i, int year) {//to print the month of year as per calender we have to
	//take the two input from user that is month and year
	//so for printing we required the day from wher we start printing 1 2 and so on 
	//this is find from day method
	//th below is formula to remove day
	int y = year - (14 - month) / 12;
    int x = y + y/4 - y/100 + y/400;
    int m = month + 12 * ((14 - month) / 12) - 2;
    int date = (i + x + (31*m)/12) % 7;
	return date;
	
	
}
public static boolean anagramnumber(int e1,int e2) {
	boolean status =true;
	int[] frequencyArrayOne=Utility.frequenceOfNumber(e1);
	int[] frequencyArrayTwo=Utility.frequenceOfNumber(e2);
	
	
	for(int i=0;i<10;i++) {
		if((frequencyArrayOne[i]==frequencyArrayTwo[i]) && (status==true)) 
			status=true;
		else 
			status=false;
	}
	return status;
	
}
/**
 * @author admin1
 *
 */
public static boolean primeornot(int x) {
	int i=1;
	do {
		i++;
	}while(x%i!=0);
	if(x==i) { 
		return true;
	}else {return false;}

}
public static int[] returnPrimeNumberArray() {
	boolean result;
	int i=0;
	int[] array= new int[168];

		for(int x=2;x<=1000;x++) {
			result=Utility.primeornot(x);
				if(result==true) {
					array[i]=x;
					i++;
				}
		}
	return array;
}

/**
 * @author 
 *
 */
public static boolean anagramOrNotForString(char[] str,char[] str1) {
	int n1=str.length;
	int n2=str1.length;
	
	if(n1!=n2)

		return false;
	Arrays.sort(str);
	Arrays.sort(str1);
	for(int i=0;i<n1;i++) 
		if(str[i]!=str1[i])
			return false;
	
	
	
	return true;
}



public static void fileWritter(String data) throws IOException {
	
	BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter("/home/kumar/Desktop/dir/String44.txt"));
	bufferedWriter.write(data);
	bufferedWriter.close();
}
public static String fileReader(File file) throws IOException {
	String string;
	BufferedReader bufferedReader= new BufferedReader(new FileReader(file));
	string = bufferedReader.readLine();
	return  string;
}
public static int size(OrderedList list) {
		int sizeOfList=0;
		Node currNode;//currently it is initilized by default
		currNode=list.head;
	

		while(currNode!=null) {
			sizeOfList++;
		    currNode=currNode.next;
	}
		return sizeOfList;
	}

public static int[] listToIntArray(OrderedList list) {
		int size	=Utility.size(list);
			int[] intArray= new int[size];
			int i=0;
			String string=null;
			Node currNode;//currently it is initilized by default
			currNode=list.head;
			while(currNode!=null) {
			
				intArray[i]=currNode.data;
				i++;
				if(i==size)
					break;
				currNode=currNode.next;
		}return intArray;
		}

public static void printlist(OrderedList list){
	
	
	Node currNode;//currently it is initilized by default
	currNode=list.head;
System.out.println("Linked list: \n");

	while(currNode!=null) {
		System.out.println(currNode.data);

	    currNode=currNode.next;
}
	
}
public static void printListForHashingFunction(OrderedList list,int numberOfList) {
	Node currNode;//currently it is initilized by default
	currNode=list.head;
System.out.println("LinkedList"+numberOfList+"\n");

	while(currNode!=null) {
		System.out.println(currNode.data);

	    currNode=currNode.next;
}
}
public static void printReverseList(OrderedList list) {
	Node headNode,currNode,prevNode,nextNode;
	
	currNode=list.head;
	prevNode=nextNode=null;
	
	while(currNode!=null) {// this loop finds the last node for adding the number 
		nextNode=currNode.next;
		currNode.next=prevNode;
		prevNode=currNode;
		currNode=nextNode;
	}
	headNode=prevNode;
	
	
	while (headNode!=null) {
		
		System.out.println(headNode.data);
		headNode=headNode.next;
	}
}
public static String[] splitingStringByScapeReturnStringArray(String string) {
	String[] stringArray=null;
	stringArray=string.split(" ");
	return stringArray;
}
public static String intArraytoString(int[] integerArray) {
	String strArray[] = new String[integerArray.length];
String convertedString;
	for (int i = 0; i < integerArray.length; i++)
		strArray[i] = String.valueOf(integerArray[i]);
	convertedString=Arrays.toString(strArray);
	return convertedString ;
}
public static int[] stringArrayToIntArray(String[] stringArray) {
	int[] integerArray = new int[stringArray.length];
	for(int i=0;i<stringArray.length;i++) {// this for loop will convert the char array into int array
		integerArray[i]=Integer.parseInt(stringArray[i]);// because as its a char array the ascii value of digit start from 48=0,49=1 and so on
	}
return integerArray;
}
public static String stringArrayToString(String[] stringArray) {

    StringBuffer sb = new StringBuffer();
    for(int i = 0; i < stringArray.length; i++) {
       sb.append(stringArray[i]);
    }
    String string = sb.toString();

	return string;
}

}
