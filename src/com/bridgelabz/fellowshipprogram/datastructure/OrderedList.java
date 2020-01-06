package com.bridgelabz.fellowshipprogram.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.fellowshipprogram.datastructure.OrderedList.Node;

		
		public class OrderedList {
			
				 Node head;// it is by default asign as null
			 public static class Node{
				   int data;
				   Node next;
				   
				   Node(int d){
						data= d;
						next=null;
					}
				   
					
				   
			 }

			 
			 /**
			  * this is the method to insert the new node at the end of the linked list 
			  * @param list -> it pass the empty list   
			  * @param data -> it pass value of intarray as per index
			  * @return linked list
			  */
			 	
			 			
			 /**
			  * this is the method pop the value from the linkedlist as per position from end or first  
			 * @param list -> it pass the  list   
			* @param data -> it pass value or data that to removed from list
			* @return modified linked list
		 */ 
	
			 		
			public static OrderedList pop(OrderedList list, int n) {
			 			Node currNode= list.head;
			 			Node prevNode=null;
			 		
			 				//case :1
			 				//if the value is the first node  or itself value to be deleted
			 				
			 				if(currNode !=null && currNode.data==n) {
			 					list.head=currNode.next;
			 					System.out.println("value is found and deleted");
			 					return list;
			 				}
			 				
			 				//case 2
			 				//if the value is in middle or last or some where else
			 				//currnode!=null mean's we reach till the last node the will loop will 
			 				//run to delet the last node vala value
			 				while(currNode!=null && currNode.data!=n) {
			 					prevNode=currNode;
			 					currNode=currNode.next;
			 				}if(currNode!=null) {//this loop will delet the value of the node which is been 
			 					//leav by while loop the currNode value
			 					prevNode.next=currNode.next;
			 					System.out.println("value is found and deleted");
			 				}
			 				
			 				//case 3
			 				//if value is node found
			 				if(currNode==null) {//currNode==null means we reach to the last element and the value
			 					//of the currNode become null that means the value we are searching is the list is not present
			 					System.out.println("value is not in list");
			 					list=insertatposition(list,n);//if value is not then the pass it to method  insertatposition to insert the value 
			 					
			 				}
			 				return list;
			 			}	
			 			 /**
						  * this is the method to insert the not finded node in the end or middle or in first  of the linked list 
						  * @param list -> it pass the list   
						  * @param data -> it pass value or data to add in the new node 
						  * @return added newnode linked list
						  */			 			
			 			
			 public static OrderedList insertatposition(OrderedList list,int data) {
			 			    Node newNode=new Node(data);
			 			    
			 			   newNode.next=null;
			 			    //new node is created and the data i.e value is been putted in the newnode
			 			   Node currNode,prevNode=null;
			 			  currNode=list.head;
			 			  
			 			Node last = list.head;
							while(last.next!=null) {// this loop finds the last node for adding the number 
								last=last.next;//which is greater than every number in list so we have to add number 
							}//at the last node
							//the above while will traverse till last node and return the address of the last node 
							
							//case 1: 
							//this number is smaller than the first node in the list
							//add the number at first position 
			 			if(newNode.data <currNode.data) {
			 				newNode.next=currNode;
			 				list.head=newNode;
			 				System.out.println("new node is add with data as "+data);
			 				return list;//after adding first value return the list 
			 				//this list will goes to popup function and from popup function it goes to main function
			 				//and from main its goes to print function for print the value
			 			}
			 			
			 			//case 2: 
			 			//adding the number at last postion or last node of the inkedlist
			 			//as the first while loop givs us the last node address we see if the last node vala
			 			//data is smaller then the newnode vala data then we again traverse till last 
			 			//to find the 
			 			if(newNode.data>last.data) {
			 			while(currNode.data<newNode.data && currNode.next!=null) 
			 			 {
			 					prevNode=currNode;
			 					currNode=currNode.next;
			 	 			
			 			 }	
			 				
			 			currNode.next=newNode;
			 			System.out.println("new node is add with data as "+data);
			 		
			 			return list;
			 			}
			 			
			 			//case 3:
			 			//adding the number at the middle or except last and the first node of the list
			 			while(currNode.data<newNode.data) {
			 				prevNode=currNode;
			 				currNode=currNode.next;
			 				
			 			}
			 			prevNode.next=newNode;
			 			newNode.next=currNode;
			 			System.out.println("new node is add with data as "+data);
			 			return list;
			 			}
			 			
	 /**
	 * this is the method print the linked list 
 * @param list -> it pass the list   
	 * @throws IOException 
 * 
 * 
 **/	public static OrderedList insertAtEnd(OrderedList list,int data) {
		
					Node newNode= new Node(data);//creating first node or new node in the linkedlist
					newNode.next=null;//assigning the null value to the newnode.next 
		
					if(list.head==null) { // therfor the head node of example2 class is null
						list.head=newNode;//adding the first value
				
					}else {// we have to traverse the list 
						Node last = list.head;
						while(last.next!=null) {
							last=last.next;
						}
						last.next=newNode;
					}
						return list;
 				}		
			 			
}

			
			
				
			
				
	
	
