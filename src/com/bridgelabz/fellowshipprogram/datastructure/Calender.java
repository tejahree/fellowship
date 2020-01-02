package com.bridgelabz.fellowshipprogram.datastructure;

import java.util.Scanner;

public class Calender {
	
	private static int day(int month, int i, int year) {//to print the month of year as per calender we have to
		//take the two input from user that is month and year
		//so for printing we required the day from wher we start printing 1 2 and so on 
		//this is find from day method
		//th below is formula to remove day
		int y = year - (14 - month) / 12;
	    int x = y + y/4 - y/100 + y/400;
	    int m = month + 12 * ((14 - month) / 12) - 2;
	    int date = (i + x + (31*m)/12) % 7;
		return date;
		
		
	}
//this below method show whether the year is leap year or not so that the number of day in feb month become 29
	//if it is leap year
		private static boolean isleapyear(int year) {
			if((year%4==0) && (year%100!=4))
				return true;
			if(year%400==0)
				return true;
		
			return false;
		}
	
	
public static void main(String[] args) {
	System.out.println("Enter the month\n");
	Scanner sc= new Scanner(System.in);
	int month= sc.nextInt();
	System.out.println("Enter the year\n");
	int year=sc.nextInt();
	
	//this string array of month gives for index 1 as jan,for index 2 as feb and so on
	//therefor we live blank for first index so that jan start form index 1
	String[] m= {"","january","february","march","april","may","june","july","august","september",
			"october","november","december"};
	
	//the below int array show the number of days in month for jan index i give 31 days and so on
	int[] days= {0,31,28,30,31,30,31,31,31,30,31,30,31};
	
	if(month==2 && isleapyear(year))//this return whether month==2 mean feb vala month in given year is leap year or not
		days[month]=29;//if its return true then we assign month==2 mean feb i.e days[2]==29
	//i.e days [2] will be 29	
	System.out.println("  " +m[month]+"  "+ year);
	System.out.println(" S   M  Tu   W  Th   F  Sa");
	
	int d=day(month,1,year);//this return day
	
	for(int i=0;i<d;i++)
		System.out.print("    ");//this print space fri ith index to  i<d so that the cursor will start printing 1 2 3 form that position
	for(int i=1;i<=days[month];i++) {//this loop start printing days i.e 1 2 3 form that position where the above loop has been stop
		String f=String.format("%2d", i);// this convert string from i so that formating can be done this affect the printing will two digit number like
		//23 24 so for 1 digit it will take two digit like 01 02 and so on
		
		System.out.print(f+"  ");
		
		if(((i+d)%7==0) ||(i==days[month]))
			System.out.println();//this if loop will stop/ move to next line when the i value become the 
		//last day of month i.e id 31==31 and when i=3 and d=4 so (3+4)%7==0 when loop finished printing
		//up to last day of week it will move to next line
	}
}


}
