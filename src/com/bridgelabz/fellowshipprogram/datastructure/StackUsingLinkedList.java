package com.bridgelabz.fellowshipprogram.datastructure;

import com.bridgelabz.fellowshipprogram.datastructure.QueueUsingLinkedList.Node;

public class StackUsingLinkedList<T> {
	
	public	class Node<T>{	
			T data;
			Node next;
			public Node(T data) {
				this.data=data;
				this.next=null;
			}
		}
	Node top=null;
	public	StackUsingLinkedList(){
		this.top=null;

	}
	public void push(T valueToList) {
		Node node=new Node(valueToList);
		node.next=top;
		this.top=node;
	}
	T pop() {
		T value;
		
		if(isempty()) {
		
			return null;
		}else {
			value=(T) this.top.data;
			this.top=this.top.next;
			
			return value;
		}
	}
	boolean isempty() {
		if(top==null) {
			return true;
			}else {
				return false;
			}
	}
 public void printStack() {
	 if(isempty())
		 System.out.println("stack is empty\n");
	 else {
		 Node currNode=top;
		 while(currNode!=null) {
			 System.out.println(currNode.data);
			 currNode=currNode.next;
		 }
	 }
	 
 }
	
	/*public static void main(String[] args) {
		StackUsingLinkedList st= new StackUsingLinkedList();
		st.push(9);
		st.push(10);
		st.push(11);
		st.push(12);
		st.push(13);
		st.printStack();
		int pop=st.pop();
		System.out.println("value has been deleted: "+pop+"\n");
		st.printStack();
	}*/
	
}
