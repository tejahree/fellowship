package com.bridgelabz.fellowshipprogram.datastructure;

import java.util.Scanner;


public class DequeuePlaindrome {
static class QueueImplement{
		
		static char[] queue=new char[10];
		static	int f=-1,r=-1;
		
		static int capacity=10;
		static	int count;

		
		static	void enqueue(char value) {
			
				if(capacity==0)
					System.out.println("Queue is overflow\n");
				else {
					
					if(f==-1) {
						f++;
						r++;
						queue[r]=value;
						capacity--;
						//System.out.println(f);
						//System.out.println(r); 
						System.out.println("value add sussfully"+"  "
								+ ""+ value+"\n");
						System.out.println("THIS IS QUEUE\n");
						print();
						}
					
					else {
						r++;
						queue[r]=value;
						
						capacity--;
					//	System.out.println(f);
					//	System.out.println(r);
						System.out.println("value add sussfully"+"  "+ value+"\n");
						System.out.println("THIS IS QUEUE\n");
						print();
					}
					}
				}
					
			
		static char removeFront(){
			char element;
			if(isEmpty())
				return '\0';
			else {
				element=queue[f];
				f++;
			return element;
			}
			
		}
		static char removeRare(){
			char element;
			if(isEmpty())
				return '\0';
			else {
				element=queue[r];
				r--;
			return element;
			}
		}
		
		
		static boolean isEmpty() {
				if(r==-1 && f==-1)
				return true;
				else
				return false;
			}
		static void print() {
			for(int i=f;i<=r;i++) {
				System.out.println(queue[i]+ "  ");
			}
		}
		
		
	}	
static boolean isplaindrome(char[] array) {
	QueueImplement q=new QueueImplement();
	boolean status=true;
	for(int i=0;i<array.length;i++) {
		q.enqueue(array[i]);
	}
	while((q.f<q.r)||(q.f==q.r)) {
	char a=q.removeFront();
	char b=q.removeRare();
if((a==b) && status==true ) {
		status= true;
	}
else {
	status = false;
	}
}	
	return status;
	
	
}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String\n");
		
		String s=sc.next();
		char[] ch = new char[s.length()]; 
		for (int i = 0; i < s.length(); i++) { 
	        ch[i] = s.charAt(i); 
	    } 
	//	isplaindrome( ch);
	if(isplaindrome( ch)) {// pass the ch char array to method isparentheses if its return true then
	  	// expresion is balance else not balance
	System.out.println("String is plaindrome");
	   }
		else {
			 System.out.println("String is not plaindrome");
		 }
	}

	
	}
