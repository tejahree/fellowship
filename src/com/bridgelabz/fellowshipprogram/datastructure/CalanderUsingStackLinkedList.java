package com.bridgelabz.fellowshipprogram.datastructure;

import java.util.Scanner;

public class CalanderUsingStackLinkedList {
	public static void main(String[] args) {
		Week week=new Week();
		WeekDay weekDay;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter month\n");
		int month=scanner.nextInt();
		System.out.println("enter year\n ");
		int year= scanner.nextInt();
		//System.out.println("enter the week\n");
		//int weekNumber=scanner.nextInt();
		String[] m= {"","january","february","march","april","may","june","july","august","september",
				"october","november","december"};
		int[] days= {0,31,28,30,31,30,31,31,31,30,31,30,31};
		if(month==2 && Utility.leapYear(year)) {//this return whether month==2 mean feb vala month in given year is leap year or not
			days[month]=29;
		}
		int d=Utility.day(month,1,year);
		
		for(int i=days[month];i>=1;i--) {
			String f=String.format("%2d", i);
			weekDay=new WeekDay(" ", f);
			week.stackObject.push(weekDay);
		}
		for(int i=d-1;i>=0;i--) {
			weekDay=new WeekDay("", "  ");
			week.stackObject.push(weekDay);
		}
		
		System.out.println("   S   M  Tu   W  Th   F  Sa");
		for(int i=0;i<=days[month];i++) {
	for(int j=0;j<7;j++) {
		weekDay=week.stackObject.pop();
		if(weekDay  !=null) {
		System.out.print("  "+weekDay.date);
		}
		
	}
	System.out.println();
		}	
		
		
		}
}
