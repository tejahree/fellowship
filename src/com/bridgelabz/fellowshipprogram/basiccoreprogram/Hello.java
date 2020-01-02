package com.bridgelabz.fellowshipprogram.basiccoreprogram;
import java.util.*;
import java.io.*;
public class Hello {
	public static void main(String args[]){
		System.out.println("Hello <<Username>>,How are you?\n");
		String s= new String("Hello <<Username>>,How are you?"); 
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER YOUR NAME\n ");
		String s1=sc.nextLine();
		s=s.replaceAll("<<Username>>", s1);
		System.out.println(s);

}}
