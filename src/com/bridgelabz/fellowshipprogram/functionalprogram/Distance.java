package com.bridgelabz.fellowshipprogram.functionalprogram;
import java.io.*;
import java.util.*;
public class Distance {
public static void main(String args[]) {
	int x1,y1;
	int x2,y2;
	double sum;
	System.out.println("please enter first  points");
	Scanner sc= new Scanner(System.in);
	x1=sc.nextInt();//let say point a(0,0) i.e is a(x1,y1) and point b(5,6) i.e is b(x2,y2)then 
	//sqrt((x2-x1)^2 +(y2-y1)^2)
	y1=sc.nextInt();
	System.out.println("please enter second points");
	x2=sc.nextInt();
	y2=sc.nextInt();
	sum=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1), 2));
	System.out.println("Encludien distance formula from point (0,0) to  " + "("+x1+","+y1+")" +"  is " +sum);
	
}
}
