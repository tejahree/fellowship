package com.bridgelabz.fellowshipprogram.basiccoreprogram;
import java.util.*;
public class FlipCoin {
	public static void main(String args[]) {
		int heads=0;
		int tails=0;
		double randomnum=0.0;
		int c=1;
		System.out.println("enter the number of times to flip the coin\n");
		int flip;
		Scanner sc= new Scanner(System.in);
		flip= sc.nextInt();
		while(c<=flip) {
			randomnum=Math.random();
			if(randomnum<0.5) {
				tails++;
			}
			else {
				heads++;
			}
			c++;
		}
		System.out.println("no.of heads: "+heads+"\n"+"no.of tails: "+tails);
		if(heads!=0 && tails!=0)
		System.out.println("Percentage of heads vs tails:"+ (heads/tails)*100);
	}

}
