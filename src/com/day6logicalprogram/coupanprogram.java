package com.day6logicalprogram;

import java.util.Scanner;

public class coupanprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit");
		int n=sc.nextInt();
		int i,j;
		int [] coupanArray = new int [20];
		int [] numberArray = new int [20];
		for ( i=1; i<=n;i++) {
			for(j=1;j<=n;j++) 
			numberArray[i] =(int) Math.floor(Math.random()*10);
			System.out.println("number" +numberArray[i]);
			coupanArray[j] =numberArray[i];
			System.out.println(+coupanArray[j]);
		}
	}
}




