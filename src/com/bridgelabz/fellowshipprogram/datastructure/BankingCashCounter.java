package com.bridgelabz.fellowshipprogram.datastructure;

import java.util.Scanner;




public class BankingCashCounter {
static class QueueImplement{
		
		static int[] queue=new int[10];
		static	int f=-1,r=-1;
		
		static int capacity=10;
		static	int count;

		
		static	void enqueue(int value) {
			
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
					
			
		
		static	void dequeue() {
				if(isEmpty()) {
					System.out.println("Queue is empty\n");
				}else {
					int element=queue[f];
					System.out.println("value is been deleted "+ element);
					f++;
					capacity++;
					print();
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
		/*static int addlogic(int value) {
			
			
			enqueue(value);
			
			return capacity;
			
		}
		static void dequelogic(){
			dequeue();
			print();
		}*/
	public static void main(String[] args) {
		QueueImplement q= new QueueImplement();
        int balance=50000;int cash=0;
		Scanner sc=new Scanner(System.in);
		int c=10;

		while(c!=0) {
			
	System.out.println("BANKING CASH COUNTER\n");
	System.out.println("1.ADD IN QUEUE\n");
	System.out.println("2.DEQUEUE FORM QUEUE\n");
	
	int option=sc.nextInt();
	
	switch(option) {
	case 1:System.out.println("Enter acc number\n");
			int value=sc.nextInt();			
			q.enqueue(value);
			System.out.println("1.deposit\n");
			System.out.println("2.widthdraw\n");
			System.out.println("3.exit\n");
			int opt=sc.nextInt();
			switch(opt) {
			case 1:System.out.println("enter the amount\n");
					cash=sc.nextInt();
					balance=balance+cash;
					System.out.println("Balance is: "+balance);
					break;
					
			case 2:if(balance==0)
					System.out.println("zero balance\n");
					else {
							System.out.println("enter the amount\n");
							cash=sc.nextInt();
							balance=balance-cash;
							System.out.println("Balance is: "+balance);
						}
					}
			c--;
			break;
	case 2:q.dequeue();	
			c++;
			break;
	}
	
	}
}

}
