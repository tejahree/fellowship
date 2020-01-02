package com.bridgelabz.fellowshipprogram.junittesting;
import java.util.*;
public class VendingMachine {
   public static void countNote(int amount) {
	   int note[]= {2000,500,200,100,50,20,10,5,1};
	   int noteNumber[]=new int[9];
	   for(int i= 0;i<9;i++) {
		   if(amount >= note[i]) {
			   noteNumber[i]=amount/note[i];
			   amount=amount-noteNumber[i]*note[i];
		   }
	   }
	   System.out.println("currency of notes are:");
	   System.out.println("NOTES"+":"+"NO.OF NOTES");
	  
	   for(int i=0;i<9;i++) {
		   if(noteNumber[i]!=0)
		   System.out.println(note[i]+":"+noteNumber[i]);
	   }
   }
	
	
	
	
	
 public static void main(String args[])
 {
	 int amount;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Amount to be return by vending machine:");
	amount= sc.nextInt();
	 countNote(amount);
 }
}
