package com.bridgelabz.fellowshipprogram.logicalprogram;

import java.util.Scanner;

public class Stopwatch {

	public static void main(String[] args) {
		
	String srt,stp;
	
	System.out.println("enter srt to start stopwatch\n");
	Scanner sc=new Scanner(System.in);
	srt=sc.next();
	long time=System.currentTimeMillis();

	System.out.println("enter stp to stop stopwatch\n");
	stp=sc.next();
	long time2=System.currentTimeMillis();
	
	System.out.println("eplasetime is "+((time2-time))/1000+"s");
	
	}
}
