package com.day6logicalprogram;

import java.util.Scanner;

public class Fibonaciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the limit :");
		
		int n =sc.nextInt();
		System.out.println("the value is " +a);
		System.out.println("the value is " +b);
		for(int i=0;i<=n;i++) {
			c=a+b;
			System.out.println("the value is " +c);
			a=b;
			b=c;
		}

	}

}
