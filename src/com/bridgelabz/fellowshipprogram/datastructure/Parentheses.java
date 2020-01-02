package com.bridgelabz.fellowshipprogram.datastructure;

import java.io.IOException;
import java.util.Scanner;

public class Parentheses {
	
	
static	class Stack{
		int top=-1;
		char check[]= new char[100];
		
		void push(char x) {//this function will just push the parenthese and not return any things
			if(top==99) {
				System.out.println("Stack is full\n");
				
			}else {
				check[++top]=x;
			}
		}
		
		
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
		char peak() {
			if(top==-1) {
				//System.out.println("stack is empty");
				return '\0';
			}else {
				char element=check[top];
				return element;
			}
			
		}
		
		boolean isempty() {
			if(top==-1) {
				return true;
				}else {
					return false;
				}
		}
	}
	 

	
	static boolean isparentheses(char exp[]) {//while passing to isparenthese method the array ch 
		Stack st= new Stack();//as the reason of creating an object of class stack is 
		//while calling the method os stack class we can call using the object st of class stack
		 char element1,element2;
		 
			for(int i=0;i< exp.length;i++) {
			if(exp[i]=='(')//if i th element of char exp contain open parenthese then 
				//pass the that element to push method of class stack
				st.push(exp[i]);
			
			
			if(exp[i]==')') {//if its contain close parentheses the 
				
			 if(st.isempty())//first check if the stack is empty or not
				 return false;//if it is empty means every open parentheses is been match with
			 //it close parentheses and now the close parenthses is left mean the expresion is 
			 //unbalance
			
			 
			 else 
				element1 =st.pop();
			 element2=st.peak();
				 if((element1=='(') && (element2==')'))//if stack is not empty result from ismatching 
				 //function that is result from st.pop and by passing the expresion if it
				 return true;
				
			}
		}
		if(st.isempty())
			return true;
		else
	return false;
	}
	
	public static void main(String args[]) throws IOException {
		String s;
		System.out.println("Enter the expresion");//take a string output from user 
		Scanner sc= new Scanner(System.in);
		s= sc.nextLine();
	
		char[] ch = new char[s.length()];//create the char array to store the string(expresion)
		//as a seperate character in char array
		for (int i = 0; i < s.length(); i++) { 
            ch[i] = s.charAt(i); //take every element and convert it to charAt and store into char array
		}
             if(isparentheses( ch)) {// pass the ch char array to method isparentheses if its return true then
            	 //expresion is balance else not balance
			 System.out.println("balance");
             }
			 else {
				 System.out.println("unbalance");
			 }
	}
	
	
	
	
}
