package com.bridgelabz.fellowshipprogram.logicalprogram;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CouponNumbers {
public static void main(String[] args) {
	Random r= new Random();
	int ran=0;
	System.out.println("Enter the number of distinct coupon numbers to bew generate\n");
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	Set<Integer> set= new HashSet<Integer>();
	while(set.size()!=n) {
		int result=r.nextInt(1000);
		ran++;
				if(set.isEmpty()) {
					set.add(result);
					
				}
					else {
							if(set.contains(result)) {
								result=r.nextInt(1000);
								ran++;
								set.add(result);
								
							}else {
								set.add(result);
							}
						}		
				}
	
	System.out.println(set);
	System.out.println("Number of time random function is call: "+ ran);
}


}
