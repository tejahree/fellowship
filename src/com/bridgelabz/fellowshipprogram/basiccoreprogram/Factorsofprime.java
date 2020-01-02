package com.bridgelabz.fellowshipprogram.basiccoreprogram;
import java.util.*;
import java.io.*;
public class Factorsofprime {
	
	public static void main(String args[]){
			System.out.println("ENTER THE NUMBER :--\n");
			Scanner sc= new Scanner(System.in);
			int x=sc.nextInt();
			int y=x;
			prime(x,y);//this pass two same value i.e is number because x will be change 
			//for every while loop and y is use to exit the do while loop
	}

	static void prime(int a,int y) {
				int i=2;int pro=1;//pro is initilized to 1 because we are multiplying
				//the i value with every pro value
	
				do {
					while(i<=a ) {//this inner while loop will find the divider i.e i value
						//while i<=a
					if(((a%i)==0)) {//if it is perfect divider 
				
						pro=pro*i;//then multiply i value with pro value
						a=a/i;//again take quotient using div operator and again pass to same method 
						System.out.print(i+ "  ");
						prime(a,y);//this will repeat until a==1
					}
					i++;//if i is not perfect divisor then increase by 1
					}
	}
	while(pro!=y);

}
}
