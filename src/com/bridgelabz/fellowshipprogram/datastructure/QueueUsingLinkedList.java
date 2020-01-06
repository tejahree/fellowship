package com.bridgelabz.fellowshipprogram.datastructure;

public class QueueUsingLinkedList {
public	class Node{
//	Node node= new Node();
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	Node front,rare;
    int count=0;
	public QueueUsingLinkedList() {
		this.front=null;
		this.rare=null;
	}
	public void enqueue(int valueToList) {
		Node node=new Node(valueToList);
		if(this.front==null) {
			this.front=node;
			this.rare=node;
			node.next=null;
			count++;
		}else {
			this.rare.next=node;
			this.rare=node;
			count++;
		}
	}
	public int dequeue() {
		Node prev=null;
		Node temp;
		int deletedValue=0;
		if(isEmpty())
			System.out.println("QueueLinkedList is empty\n");
		else {
			temp=this.front;
			while(this.front.next!=null) {
				prev=this.front;
				this.front=this.front.next;
			}
		deletedValue=this.rare.data;
		this.rare=prev;
		this.rare.next=null;
		count--;
		this.front=temp;
		}
		return deletedValue;
	}
	public boolean isEmpty() {
		if(this.front==null )
			return true;
		else
		return false;
	}
	public void printQueueLinkedList() {
		while(this.front!=null) {
			System.out.println(this.front.data+" ");
			this.front=this.front.next;
		}
	}
	
	/*public static void main(String[] args) {
	QueueUsingLinkedList queue= new QueueUsingLinkedList();
	queue.enqueue(18);
	queue.enqueue(16);
	queue.enqueue(19);

	queue.enqueue(17);

	queue.dequeue();
	queue.printQueueLinkedList();
	}*/
}
