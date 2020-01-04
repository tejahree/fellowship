package com.bridgelabz.fellowshipprogram.datastructure;

import java.io.BufferedWriter;
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
public static String intArraytoString(int[] integerArray) {
	String strArray[] = new String[integerArray.length];
String convertedString;
	for (int i = 0; i < integerArray.length; i++)
		strArray[i] = String.valueOf(integerArray[i]);
	convertedString=Arrays.toString(strArray);
	return convertedString ;
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
