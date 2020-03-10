package com.capgemini.march09;

import java.util.Scanner;

public class Long {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number input");
				int n=sc.nextInt();
		long d[]=new long[n];
		
		display(d,n);
		for(int i=0;i<n;i++) {
			System.out.println(d[i]);
			
		}
	}

	public static long[] display(long[] d, int n) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++) {
			d[i]=sc.nextLong();
		}
		return d;
		}
		
	}
	


