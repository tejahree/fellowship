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
	while(trial!=0) {
		if((cash>0) && (cash<goal)) {
	if(r.nextInt(1000)<500) {
		cash--;
		trial--;
		}
	else {
		cash++;
		trial--;
		}
		}

		if(cash==goal)
			win++;

		if(cash==0)
			loss++;
	
	}
	
	
	
	
	
	System.out.println("win "+win +"and bets " +loss);
	//System.out.println("percentage :--"+(win/trial)*100);
}
}
