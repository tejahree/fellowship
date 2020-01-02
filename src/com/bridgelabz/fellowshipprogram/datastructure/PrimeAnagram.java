package com.bridgelabz.fellowshipprogram.datastructure;

public class PrimeAnagram {
	public static void main(String args[]) {
		boolean result;
		int i=0;
		int[] arr= new int[168];
		System.out.println("So prime number are: ");
	for(int x=2;x<=1000;x++) {
		result=primeornot(x);
		if(result==true) {
		
			arr[i]=x;
		i++;
		}
		
	}
	for(int j=0;j<168;j++) {
		System.out.println(arr[j]);
	}
int[] primeanagram = anagram(arr);
	// primeanagram	=;
	 
	System.out.println("this is angram array\n");
	for(int l=0;l<100;l++) {
		//if(primeanagram[l]!=primeanagram[l+1])
		System.out.println(primeanagram[l]);
	}
	}
	
	
	
	static int[] anagram(int[] arr) {
		int[] anagram= new int[100];
		int k=0;
		for(int i=0;i<168;i++  ) {
		for(int j=0;j<168;j++){
			if(anagramnumber(arr[i],arr[j])) {
				anagram[k]=arr[i];
				k++;
				anagram[k]=arr[j];
				k++;
			}
		}
		}
		return anagram;
	}
	static boolean anagramnumber(int e1,int e2) {
		boolean status =true;
		int[] arr=Utility.intintoarray(e1);
		int[] arr2=Utility.intintoarray(e2);
		Utility u= new Utility();
		int[] sortarr1=Utility.bubblesort(arr);
		int[] sortarr2=Utility.bubblesort(arr2);
		for(int i=0;i<10;i++) {
			if((sortarr1[i]==sortarr2[i]) && (status==true)) 
				status=true;
			else 
				status=false;
		}
		return status;
		
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
