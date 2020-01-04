package com.bridgelabz.fellowshipprogram.datastructure;

import java.util.HashSet;
import java.util.Set;

import com.bridgelabz.fellowshipprogram.datastructure.PrimeAnagramUsingStack.Stack;

public class PrimeAnagramUsingQueue {
public static class Queue{
		int f=-1,r=-1;
	 OrderedList list= new OrderedList();
	
		OrderedList enqueue(int value) {
		if(list==null) {
			f++;
			list=OrderedList.insertAtEnd(list,value);
		}
		else {
				r++;
				list=OrderedList.insertAtEnd(list,value);
		}
		return list;
			}
}
public static void queueImplement(int[] sortedArray) {
	OrderedList list= new OrderedList();
	Queue queue=new Queue();
	for(int i=0;i<sortedArray.length;i++) {
		list=queue.enqueue(sortedArray[i]);
		}
	System.out.println("this is linkedlist\n");
	Utility.printlist(list);
}
public static void main(String[] args) {
	int[] primeArray= new int[168];
	OrderedList list= new OrderedList();
	primeArray=Utility.returnPrimeNumberArray();
	Set<Integer> passSet=new HashSet<Integer>();
	passSet=anagram(primeArray);
	System.out.println(passSet);
	int size=passSet.size();
	int[] setToArray = new int[size]; 
	int k = 0; 
	for (int x : passSet) {
		setToArray[k++] = x; 
	}
	int[] sortedArray=new int[size];
	sortedArray=Utility.bubblesort(setToArray);
	queueImplement(sortedArray);
}
static Set anagram(int[] arr) {
	Set<Integer> set= new HashSet<Integer>();

		int k=0;
		for(int i=0;i<168;i++  ) {
			for(int j=0;j<168;j++){
				if(i!=j) {
				if(Utility.anagramnumber(arr[i],arr[j])) {
					
						set.add(arr[i]);
						set.add(arr[j]);	
					
				}
				}
			}
		}
		return set;
}
}
