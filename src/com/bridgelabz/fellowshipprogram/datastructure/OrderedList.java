package com.bridgelabz.fellowshipprogram.datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

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

			 
			 //this below function is INSERT FUNCTION
			 			public static OrderedList insert(OrderedList list,int data) {
				
			 					Node new_node= new Node(data);//creating first node or new node in the linkedlist
			 					new_node.next=null;//assigning the null value to the newnode.next 
			 					
			 						if(list.head==null) { // therfor the head node of example2 class is null
			 							list.head=new_node;//adding the first value
			 							
			 						}else {// we have to traverse the list 
			 							Node last = list.head;
			 							while(last.next!=null) {
			 								last=last.next;
			 							}
			 							last.next=new_node;
			 						}
			 						return list;
			 			}
			 			
			 
			 //this below function is POPUP FUNCTION
			 			public static OrderedList pop(OrderedList list, int n) {
			 				Node currnode= list.head;
			 				Node prev=null;
			 				
			 				//case :1
			 				//if the value is the first node  or itself value to be deleted
			 				if(currnode !=null && currnode.data==n) {
			 					list.head=currnode.next;
			 					System.out.println("value is found and deleted");
			 					
			 				}
			 				
			 				//case 2
			 				//if the value is in middle or last or some where else
			 				//currnode!=null mean's we reach till the last node the will loop will 
			 				//run to delet the last node vala value
			 				while(currnode!=null && currnode.data!=n) {
			 					prev=currnode;
			 					currnode=currnode.next;
			 				}if(currnode!=null) {//this loop will delet the value of the node which is been 
			 					//leav by while loop the currnode value
			 					prev.next=currnode.next;
			 					System.out.println("value is found and deleted");
			 				}
			 				
			 				//case 3
			 				//if value is node found
			 				if(currnode==null) {//currnode==null means we reach to the last element and the value
			 					//of the currnode become null that means the value we are searching is the list is not present
			 					System.out.println("value is not in list");
			 					list=insertatposition(list,n);//if value is not then the pass it to method  insertatposition to insert the value 
			 					
			 				}
			 				return list;
			 			}	
			 			
//thi below method is the insert function by pasing list and the value			 			
			 			public static OrderedList insertatposition(OrderedList list,int data) {
			 			    Node newnode=new Node(data);
			 			    
			 			   newnode.next=null;
			 			    //new node is created and the data i.e value is been putted in the newnode
			 			   Node currnode,prev=null;
			 			  currnode=list.head;
			 			  
			 			Node last = list.head;
							while(last.next!=null) {// this loop finds the last node for adding the number 
								last=last.next;//which is greater than every number in list so we have to add number 
							}//at the last node
							//the above while will traverse till last node and return the address of the last node 
							
							//case 1: 
							//this number is smaller than the first node in the list
							//add the number at first position 
			 			if(newnode.data <currnode.data) {
			 				newnode.next=currnode;
			 				list.head=newnode;
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
			 			if(newnode.data>last.data) {
			 			while(currnode.data<newnode.data && currnode.next!=null) 
			 			 {
			 					prev=currnode;
			 	 				currnode=currnode.next;
			 	 			
			 			 }	
			 				
			 				currnode.next=newnode;
			 			System.out.println("new node is add with data as "+data);	
			 			return list;
			 			}
			 			
			 			//case 3:
			 			//adding the number at the middle or except last and the first node of the list
			 			while(currnode.data<newnode.data) {
			 				prev=currnode;
			 				currnode=currnode.next;
			 				
			 			}
			 			prev.next=newnode;
			 			newnode.next=currnode;
			 			System.out.println("new node is add with data as "+data);
			 			return list;
			 			}
			 			
			 			
			 			
			 			public static void printlist(OrderedList list) {
			 					Node currnode;//currently it is initilized by default
			 						currnode=list.head;
			 				System.out.println("Linked list: \n");
			 				
			 					while(currnode!=null) {
			 						System.out.println(currnode.data);
			 					
			 						currnode=currnode.next;
			 				}
			 			}
			 			
			 			
			 			
			public static void main(String args[]) throws IOException {
				
				String str;
				int temp;
				Utility u= new Utility();
				//BufferedReader rr = new BufferedReader(new InputStreamReader(System.in));
				BufferedReader br= new BufferedReader(new FileReader("/home/admin1/Desktop/dir/String2.txt"));
				str = br.readLine();//take the data from file and put it into str varibale of type string
				System.out.println(str);
				String[] arrSplit = str.split(" ");
				for(int i=0;i<arrSplit.length;i++){
				System.out.print(arrSplit[i]+"  "+"\n");	
				}
				System.out.println();
			//	char[] chararray= str.toCharArray(); //  take  every character of the string  and stored it into char array a 
				int intarray[]= new int[arrSplit.length];// this create the array of integer 
				// so that we can convert the char array into integer array because the input is integer 
				for(int i=0;i<arrSplit.length;i++) {// this for loop will convert the char array into int array
					intarray[i]=Integer.parseInt(arrSplit[i]);// because as its a char array the ascii value of digit start from 48=0,49=1 and so on
				}
				
				     System.out.println("This is Entered Integer data: ");
				     for(int i=0;i<arrSplit.length;i++) {
								System.out.print(intarray[i]+" "+"\n");
					}
				     int[] sortedarray= new int[intarray.length];
							sortedarray=u.bubblesort(intarray);
				
				     /*		for(int i=0;i<arrSplit.length-1;i++)//this loop will sort the array using bubble sort
							for(int j=0;j<arrSplit.length-1;j++) {// but it is still an array not a linkedlist
							if(intarray[j]>intarray[j+1]) {
											temp=intarray[j];
											intarray[j]=intarray[j+1];
											intarray[j+1]= temp;
										}
								}*/
				     
				     		OrderedList list = new OrderedList();
			     			
								for(int i=0;i<sortedarray.length;i++) {//the array is sorted now this is putting the sorted value in the linkedlist
									list=insert(list,sortedarray[i]);
								}
								
									System.out.println("this is sorted linkedlist\n");
									printlist(list);//this will print sorted array
									System.out.println("Enter the number u want to pop\n");
									Scanner sc= new Scanner(System.in);
				     				int n=sc.nextInt();
				     			
				     					
				
				     					list=pop(list,n);
				     					printlist(list);
			}
			 
			 
			 
			}

			
			
				
			
				
	
	
