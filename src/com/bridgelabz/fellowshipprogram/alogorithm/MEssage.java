package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

public class MEssage {


	static boolean name3(String a,String b,String c,String d) {
		String name1,fullname1,contact1,date1;
		 boolean value ;
	name1="\\w+";
	fullname1="\\w+\\s\\w+\\s\\w+";//Any word character, short for [a-zA-Z_0-9]
	contact1="^\\d{10}";
	date1="((([0]{1}[1-9]{1})|([1]{1}[0-9]{1})|([2]{1}[0-9]{1})|([3]{1}[0-1]{1}))/(([0]{1}[1-9]{1})|([1]{1}[0-2]{1}))/([1-9]{1}[0-9]{1}[0-9]{1}[1-9]{1}))";
	if((a.matches(name1))  && (b.matches(fullname1))  && (c.matches(contact1)) && (d.matches(date1)) ) 
		return value =true;
	else 
		return value=false;
	
 
	}	
		
	
	public static void main (String args[]) {
	System.out.println("THIS IS THE GIVEN MESSAGE  :----\n");
	String sr= new String(" Hello <<name>>,");  
System.out.println(sr);
String sr1= new String("We have your full name as <<full name>> in our system.") ; 
System.out.println(sr1);
String sr2= new String("your contact number is 91-xxxxxxxxxx.");
System.out.println(sr2);
String sr3= new String("Please,let us know in case of any clarification");
System.out.println(sr3);
String sr4=new String("Thank you BridgeLabz 01/01/2016.");
System.out.println(sr4);
String sr5= new String("Use Regex to replace name, full name, Mobile#, and Date with proper value.\n");
System.out.println(sr5);

String name,fullname,contact,date;


Scanner sc= new Scanner(System.in);

System.out.println("ENTER NAME,FULL-NAME,CONTACT-NUMBER & DATE\n");
name=sc.nextLine();
fullname=sc.nextLine();
contact=sc.nextLine();
date=sc.nextLine();
name3(name,fullname,contact,date);


System.out.println("THIS IS MODIFIED MESSAGE\n");
									if(name3(name,fullname,contact,date)) {
										System.out.println(sr.replace("<<name>>",name));
										System.out.println(sr1.replace("<<full name>>", fullname));
										System.out.println(sr2.replace("xxxxxxxxxx", contact));
										System.out.println(sr3);
										System.out.println(sr4.replace("01/01/2016", date));
										System.out.println(sr5);
										//sr.replace("xxxxxxxxxx",contact1);
									}	
									else {
										System.out.println("PLEASE ENTER VALIDE INFORMATION\n");
									}
									
									
									}
	
									
	}	

	
