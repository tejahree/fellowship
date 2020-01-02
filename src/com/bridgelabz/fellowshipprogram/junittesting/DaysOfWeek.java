package com.bridgelabz.fellowshipprogram.junittesting;

import java.util.Scanner;

public class DaysOfWeek {
public static void main(String[] args) {
	int m,d,y,result;
	Scanner sc= new Scanner(System.in);
	
	System.out.println("-------ENTER MONTH----");
	 m=sc.nextInt();
	
	System.out.println("-------ENTER DAY------");
	d=sc.nextInt();
	
	System.out.println("-------ENTER YEAR------");
	y=sc.nextInt();
	
		result=dayofweek(m,d,y);
	
	if(result==0)
		System.out.println("Sunday\n");
	if(result==1)
		System.out.println("Monday\n");
	if(result==2)
		System.out.println("Tuesday\n");
	if(result==3)
		System.out.println("Wednesday\n");
	if(result==4)
		System.out.println("Thursday\n");
	if(result==5)
		System.out.println("Friday\n");
	if(result==6)
		System.out.println("Saturday\n");
}

private static int dayofweek(int m, int d, int y) {
	int year = y - (14 - m) / 12;
    int x = year + year/4 - year/100 + year/400;
    int month = m + 12 * ((14 - m) / 12) - 2;
    int day = (d + x + (31*month)/12) % 7;
	return day;
}
}
