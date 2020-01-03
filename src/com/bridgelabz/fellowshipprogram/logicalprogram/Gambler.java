
	
	package com.bridgelabz.fellowshipprogram.logicalprogram;

import java.util.Random;
import java.util.Scanner;

public class Gambler {
public static void main(String[] args) {
	System.out.println("enter the $stake,$goal and no.of time to repeat\n");
	Scanner sc= new Scanner(System.in);
Random r= new Random();
	int stake=sc.nextInt();
	int goal=sc.nextInt();
	int trial=sc.nextInt();

	int loss=0,win=0;
	int cash;
	
	
	cash=stake;
	for(int i=0;i<trial;i++){
	
	if(r.nextInt(1000)<500) {
		cash--;
		
		}
	else {
		cash++;
		
		}
		

		if(cash==goal)
			win++;

		if((cash==0 )|| (cash<goal))
			loss++;
	
	}
	
	
	
	
	
	System.out.println("win "+win +"and loss " +loss);
	//System.out.println("percentage :--"+(win/trial)*100);
}
}

