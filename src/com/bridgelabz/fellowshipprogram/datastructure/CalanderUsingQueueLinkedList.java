
package com.bridgelabz.fellowshipprogram.datastructure;

import java.util.Scanner;

public class CalanderUsingQueueLinkedList {
	private static boolean isleapyear(int year) {
		if((year%4==0) && (year%100!=4))
			return true;
		if(year%400==0)
			return true;
	
		return false;
	}
public static void main(String[] args) {
	Week week=new Week();
	WeekDay weekDay;
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter month\n");
	int month=scanner.nextInt();
	System.out.println("enter year\n ");
	int year= scanner.nextInt();
	
	String[] m= {"","january","february","march","april","may","june","july","august","september",
			"october","november","december"};
	int[] days= {0,31,28,30,31,30,31,31,31,30,31,30,31};
	
	System.out.println("  " +m[month]+"  "+ year+"\n");
	
	if(month==2 && isleapyear(year)) //this return whether month==2 mean feb vala month in given year is leap year or not
		 days[month]=29;
	
	int d=Utility.day(month,1,year);
	for(int i=0;i<d;i++) {
		weekDay=new WeekDay("", "  ");
		week.object.enqueue(weekDay);
	}
	for(int i=1;i<=days[month];i++) {
	
		String f=String.format("%2d", i);
		weekDay=new WeekDay(" ", f);
		week.object.enqueue(weekDay);
	}
	
	
	System.out.println("   S   M  Tu   W  Th   F  Sa");
	for(int i=0;i<=days[month];i++) {
for(int j=0;j<7;j++) {
	weekDay=week.object.dequeue();
	if(weekDay  !=null) {
	System.out.print("  "+weekDay.date);
	}
	
}
System.out.println();
	}	
	/*for(int i=1;i<=5;i++) {
	for(int j=0;j<7;j++) {
		weekDay=week.object.dequeue();
		if(weekDay!=null &&i==weekNumber) {
			System.out.print("  "+weekDay.date);
		}
		
	}
	System.out.println();
	
	}	*/
	
	}
}

