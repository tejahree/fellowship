package com.bridgelabz.fellowshipprogram.functionalprogram;

import java.io.PrintWriter;
import java.util.Scanner;

public class Array {
		public static void main(String args[]) {
				int m,n;
				String s="  ";
				System.out.println("enter the number of rows ");
				PrintWriter p= new PrintWriter(System.out);
				Scanner sc= new Scanner(System.in);
				m=sc.nextInt();
				System.out.println("enter the number of rows ");
				n=sc.nextInt();
				int a[][]= new int[m][n];
				
				for(int i=0;i<m;i++) {
					for(int j=0;j<n;j++) {
							System.out.println("enter the number");
							a[i][j]=sc.nextInt();
					}
				}
				for(int i=0;i<m;i++) {
					for(int j=0;j<n;j++) {
							p.write(a[i][j]+"   ");
					}
					p.println();
					
				}
				p.close();
		}
}
