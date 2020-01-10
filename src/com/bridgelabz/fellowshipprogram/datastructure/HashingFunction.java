package com.bridgelabz.fellowshipprogram.datastructure;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashingFunction {
	
public static void addIntoNode(int valueToAdd, OrderedList list,Map<Integer, OrderedList> map) {
	OrderedList list0;
	OrderedList.addAtlist3(list, valueToAdd);
	
		
	printTheList(map);
	}
public static void printTheList(Map<Integer, OrderedList> map) {
	System.out.println();
	System.out.println();
	System.out.println("this is the linked list\n");
	System.out.println();
	for(int i=0;i<11;i++) {
	Utility.printListForHashingFunction(map.get(i), i);
	}
}
public static void searchOperation(int numberToSearch,Map<Integer, OrderedList> map) {
	int mod=numberToSearch%11;
	if(OrderedList.searchValueFromLinkedList(map.get(mod), numberToSearch)) {
	OrderedList.pop(map.get(mod), numberToSearch);
	System.out.println("this is pop linkedlist"+"\n");
	
	Utility.printListForHashingFunction(map.get(mod),mod);
	}else {
		OrderedList.addAtlist3(map.get(mod), numberToSearch);
		System.out.println("this is add value linkedlist"+"\n");
		Utility.printListForHashingFunction(map.get(mod),mod);
	}
}

public static void main(String[] args) throws IOException {
	String stringFromFile;
int[] slot= {0,1,2,3,4,5,6,7,8,9,10};
File file= new File("/home/admin1/tejashree_environment/dir/HashingFunction.txt");
stringFromFile=Utility.fileReader(file);
System.out.println(stringFromFile);
String[] stringArray=Utility.splitingStringByScapeReturnStringArray(stringFromFile);

int[] intArray=Utility.stringArrayToIntArray(stringArray);
for(int k=0;k<intArray.length;k++) {
	System.out.print(intArray[k]+"  "+"\n");
}
OrderedList list0=new OrderedList();
OrderedList list1=new OrderedList();
OrderedList list2=new OrderedList();
OrderedList list3=new OrderedList();
OrderedList list4=new OrderedList();
OrderedList list5=new OrderedList();
OrderedList list6=new OrderedList();
OrderedList list7=new OrderedList();
OrderedList list8=new OrderedList();
OrderedList list9=new OrderedList();
OrderedList list10=new OrderedList();
Map<Integer, OrderedList> map= new HashMap<Integer, OrderedList>();

map.put(0,list0);
map.put(1,list1);
map.put(2,list2);
map.put(3,list3);
map.put(4,list4);
map.put(5,list5);
map.put(6,list6);
map.put(7,list7);
map.put(8,list8);
map.put(9,list9);
map.put(10,list10);
//map.put(0, new OrderedList.Node(0) );
map.get(0);
for(int i=0;i<intArray.length;i++) {
	for(int j=0;j<11;j++) {
	if(intArray[i]%11==slot[j]) {
		addIntoNode(intArray[i],map.get(slot[j]),map);
	}
	}
	
}
System.out.println();
System.out.println("SEARCH OPERATION\n");
System.out.println("Enter the number to Search\n");
Scanner scanner= new Scanner(System.in);
int searchNumber=scanner.nextInt();
searchOperation(searchNumber,map);
}
}
