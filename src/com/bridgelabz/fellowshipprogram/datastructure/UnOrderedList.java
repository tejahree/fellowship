package com.bridgelabz.fellowshipprogram.datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UnOrderedList {
	Node head;
public static class Node{
   String data;
   Node next;
   Node(String str){
	   data=str;
	   next=null;
   }
}
   
/**
 * This method is used to insert a node at the end of 
 * Linked List
 * 
 * @param list-> input link list 
 * @param data-> data of the new node that needs to be added
 * @return list-> modified list
 */

public static UnOrderedList insertAtEnd(UnOrderedList list ,String data) {
	   Node new_node=new Node(data);
	   new_node.next=null;
	   
	   if(list.head==null) {
		   list.head=new_node;
	   }else {
		   Node last=list.head;
		   while(last.next!=null) {
			   last=last.next;
		   }
		   last.next=new_node;
	   }
	   return list;
   }
/**
 * @param list
 * @param data
 * @return
 */
   public static UnOrderedList pop(UnOrderedList list ,String string ) {
	   Node currnode=list.head;
	  // Node last=list.head;
	   Node prev=null;
	  
	   if((currnode!=null) && ((currnode.data).equals(string))) {
		   list.head=currnode.next;
		   System.out.println("Value is been deleted");
	   }
	     while((currnode!=null) && (!(currnode.data).equals(string))) {
	    	prev=currnode;
	    	currnode=currnode.next;
	     }if(currnode!=null) {
	    	 prev.next=currnode.next;
	    	 System.out.println("Value is been deleted\n");
	     }
	     if(currnode==null) {
	    	 System.out.println("value not found\n");
list=insertAtEnd(list,string);
	     }
		
	   return list;
   }
   
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
   

public static void main(String[] args) throws IOException {
	
	BufferedReader rr= new BufferedReader(new FileReader("/home/admin1/Desktop/dir/String44.txt"));
Scanner sc=new Scanner(System.in);
	String s=rr.readLine();
System.out.println("string\n");
System.out.println(s+"\n");
String[] stringarray= s.split(" ");
UnOrderedList list= new UnOrderedList();
for(int i=0;i<stringarray.length;i++) {
	list=insertAtEnd(list,stringarray[i]);
}

printlist(list);
System.out.println("Enter the string to be pop\n");
String string = sc.next();
list=pop(list,string);
printlist(list);
}

}
