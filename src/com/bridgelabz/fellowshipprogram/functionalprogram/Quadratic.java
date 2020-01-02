package com.bridgelabz.fellowshipprogram.functionalprogram;
import java.util.*;
public class Quadratic {
public static void main(String args[]) {
	
	int a,b,c;
	double x1,x2;
	System.out.println("please enter the value of a,b&c to find quadratic value ");
	Scanner sc= new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	
	double delta;
	delta= (b*b) - (4*a*c);
	System.out.println(delta);
	x1=((-b)+(Math.sqrt(delta)))/(2*a);
	x2=((-b)-(Math.sqrt(delta)))/(2*a);
	System.out.println("The square root are "+x1+"  and  "+x2);
}
}
