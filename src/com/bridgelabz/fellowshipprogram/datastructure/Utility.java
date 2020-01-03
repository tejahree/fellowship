package com.bridgelabz.fellowshipprogram.datastructure;

import java.util.Arrays;




/**
 * @author admin1
 *
 */
public class Utility {
static int[] bubblesort(int[] arr) {
	int temp;
	for(int i=0;i<(arr.length)-1;i++)
		for(int j=0;j<(arr.length)-1;j++) {
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			
		}}
	return arr;
}
/**
 * @author admin1
 *
 */
static int[] intintoarray(int e1) {
	int k=0;
	int[] arr=new int[10];
	while(e1>0) {
		int d=e1%10;
		arr[k]=d;
		e1=e1/10;
		
	}
	return arr;
}
/**
 * @author admin1
 *
 */
static boolean primeornot(int x) {
	int i=1;
	do {
		i++;
	}while(x%i!=0);
	if(x==i) { 
		return true;
	}else {return false;}

}
/**
 * @author 
 *
 */
public static boolean anagramOrNot(char[] str,char[] str1) {
	int n1=str.length;
	int n2=str1.length;
	
	if(n1!=n2)

		return false;
	Arrays.sort(str);
	Arrays.sort(str1);
	for(int i=0;i<n1;i++) 
		if(str[i]!=str1[i])
			return false;
	
	
	
	return true;
}
}
