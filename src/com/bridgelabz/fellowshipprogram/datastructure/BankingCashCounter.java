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
						System.out.println("Token Number is added"+"  "
								+ ""+ value+"\n");
						System.out.println("List of TokenNUmber\n");
						print();
						}
					
					else {
						r++;
						queue[r]=value;
						
						capacity--;
					//	System.out.println(f);
					//	System.out.println(r);
						System.out.println("Token Number "+"  "+ value+"is added\n");
						System.out.println("List of TokenNUmber\n");
						print();
					}
					}
				}
					
			
		
		static	void dequeue() {
				if(isEmpty()) {
					System.out.println("Queue is empty\n");
				}else {
					int element=queue[f];
					System.out.println("Next TokenNumber ");
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
		static void addAtLast(int value) {
			r++;
			queue[r]=value;
			
			capacity--;
		//	System.out.println(f);
		//	System.out.println(r);
			System.out.println("TokenNUmber"+"  "+ value+"is added\n");
			System.out.println("List of TokenNumber\n");
			print();
		}
		static void print() {
			for(int i=f;i<=r;i++) {
				System.out.println(queue[i]+ "  ");
			}
		}
		
	}	

	public static void main(String[] args) {
		QueueImplement queue= new QueueImplement();
        int balance=50000;int tokenNumber=500;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number Of Customer in Queue\n");
		int numberofcustomer= scanner.nextInt();
		System.out.println("CASH COUNTER\n");
		//System.out.println("1.Add into Queue\n");
		int amount;
		for(int i=1;i<=numberofcustomer;i++) {
			
			queue.enqueue(tokenNumber++);
			
				}
		while(numberofcustomer!=0) {
		
		
			System.out.println("CASH COUNTER\n");
			System.out.println("1.Diposit\n");
			System.out.println("2.Widthdraw\n");
			System.out.println("Enter the option\n");
			int option=scanner.nextInt();
			switch(option) {
			case 1: System.out.println("Enter Amount for Diposit\n");
				amount=scanner.nextInt();
				balance=balance+amount;
				System.out.println("BALANCE:=  "+balance);
				numberofcustomer--;
				queue.dequeue();
				break;
				
			case 2:System.out.println("Enter Amount for Widthdraw\n");
			amount=scanner.nextInt();
				if(amount<=balance) {
					balance=balance-amount;
					System.out.println("BALANCE:=  "+balance);
					numberofcustomer--;
					queue.dequeue();
					}
				else {
					System.out.println("That much amount is not present");
					
						if((numberofcustomer==1) ||(queue.isEmpty())) {
							System.out.println("Sorry cash is not available\n");
					}else {
						queue.addAtLast(tokenNumber);
						queue.dequeue();
					}
				}
				break;
				
				default:System.out.println("please enter correct option\n");
		}
	
		
}
}

}
