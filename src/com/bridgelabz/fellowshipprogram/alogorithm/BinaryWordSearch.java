package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

public class BinaryWordSearch {
  static int toBinary(String[] a,String f) {
	 int l=0,r=a.length-1;
	  while(l<=r) {
		  int m= l+r/2;
		  int res=f.compareTo(a[m]);
		  if(res==0)
			  return 0;
		  if(res>0)
			  l=m+1;
		  else
			  r=m-1;
	  }
	  
	  return -1;
 }
	
	
	public static void main(String args[]) {
	
	String arr[]= {"apple","mango","banana","kiwi","lichi"};
	String find="tamr";
	int result = toBinary(arr,find);
		
	if(result==-1) {
			System.out.println("String is not present");
		}else {
			System.out.println("String is present");
		}
	
	}
}
