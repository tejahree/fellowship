package com.bridgelabz.fellowshipprogram.datastructure;



public class Stack {
	int top=-1;
	char check[]= new char[100];
	
	/**
	 * this push any type of element into stack
	 * @parameter this method pass char or any type object 
	 *@return nothing
	 */
	void push(char x) {//this function will just push the parenthese and not return any things
		if(top==99) {
			System.out.println("Stack is full\n");
			
		}else {
			check[++top]=x;
		}
	}
	
	/**
	 * this pop the first element of stack array
	 * @parameter nothing 
	 *@return nothing
	 */
	char pop() {
		if(top==-1) {
			System.out.println("stack is empty");
			return '\0';
		}else {
			char element=check[top];
			top--;
			return element;
		}
	}
	
	/**
	 * this passes the top element of stack array
	 * @parameter nothing
	 *@return return the top element of stack array
	 */
	char peak() {
		if(top==-1) {
			//System.out.println("stack is empty");
			return '\0';
		}else {
			char element=check[top];
			return element;
		}
		
	}
	
	/**
	 * this check whether the stack is empty or not
	 * @parameter nothing
	 *@return boolean
	 */
	boolean isempty() {
		if(top==-1) {
			return true;
			}else {
				return false;
			}
	}
}
