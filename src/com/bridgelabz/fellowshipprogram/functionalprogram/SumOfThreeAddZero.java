package com.bridgelabz.fellowshipprogram.functionalprogram;


public class SumOfThreeAddZero {
 public static	void add(int[] arr,int n) {
		boolean found = true;
		
		for(int i=0;i<n-2;i++) 
		{
			
			for(int j=i+1;i<n-1;j++) 
			{
				for(int k=j+1;k<n;k++) 
				{
					if(arr[i]+arr[j]+arr[k] == 0) 
					{
						
						System.out.print(arr[i]+"  "+arr[j]+"   "+arr[k]);
						
						found=true;
						
					}
				}
			}
		}
		if(found==false) {
			System.out.println("their is no such combination");
		}
		
	}
 public static void main(String[] args) {
	 /*Sysout("enter the number of element");
	  * int n= sc.nectInt();
	  * int arr[]= new arr[n];
	  * for(int i=0;i<n;i++){
	  * a[i]=sc.nextInt(_);
	  * then pass arr[] to add method
	  * }*/
	 int arr[]= {0,-1,2,-3,1};
	 int n=arr.length;
	 add(arr,n);
	 
	 
 }
}
