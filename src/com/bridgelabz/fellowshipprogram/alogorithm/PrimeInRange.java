package com.bridgelabz.fellowshipprogram.alogorithm;

public class PrimeInRange {
	
	public static void main(String args[]) {
		boolean result;
		System.out.println("So prime number are: ");
	for(int x=2;x<=1000;x++) {
		result=primeornot(x);
		if(result==true)
		System.out.println(x+"  ");
	}
		
	}
	
	static boolean primeornot(int x) {
		int i=1;
		do {
			i++;
		}while(x%i!=0);
		if(x==i) { 
			return true;
		}else {return false;}
	
	}
}
