package com.bridgelabz.fellowshipprogram.datastructure;

import java.io.IOException;
import java.util.Scanner;

public class Parentheses {
	
	 static boolean isparentheses(char exp[]) {//while passing to isparenthese method the array ch 
		Stack stack= new Stack();//as the reason of creating an object of class stack is 
		//while calling the method os stack class we can call using the object st of class stack
		 char element1,element2;
		 
			for(int i=0;i< exp.length;i++) {
			if((exp[i]=='(') ||(exp[i]=='{') ||(exp[i]=='['))//if i th element of char exp contain open parenthese then 
				//pass the that element to push method of class stack
				stack.push(exp[i]);
			
			
			if((exp[i]==')')||(exp[i]=='}') ||(exp[i]==']')) {//if its contain close parentheses the 
				
			 if(stack.isempty())//first check if the stack is empty or not
				 return false;//if it is empty means every open parentheses is been match with
			 //it close parentheses and now the close parenthses is left mean the expresion is 
			 //unbalance
			
			 
			 else 
				element1 =stack.pop();
			 element2=stack.peak();
				 if(((element1=='(') && (element2==')')) ||((element1=='{') && (element2=='}'))||((element1=='[') && (element2==']'))) //if stack is not empty result from ismatching 
				 //function that is result from st.pop and by passing the expresion if it
				 return true;
				
			}
		}
			
		if(stack.isempty())
			return true;
		else
	return false;
	
	}	
	public static void main(String args[]) throws IOException {
		String string;
		System.out.println("Enter the expresion");//take a string output from user 
		Scanner scanner= new Scanner(System.in);
		string= scanner.nextLine();
	
		char[] charArray = new char[string.length()];//create the char array to store the string(expresion)
		//as a seperate character in char array
		for (int i = 0; i < string.length(); i++) { 
			charArray[i] = string.charAt(i); //take every element and convert it to charAt and store into char array
		}
             if(isparentheses( charArray)) {// pass the ch char array to method isparentheses if its return true then
            	 //expresion is balance else not balance
			 System.out.println("balance");
             }
			 else {
				 System.out.println("unbalance");
			 }
	}
	
	
	
	
}
