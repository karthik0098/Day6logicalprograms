package com.day6logicalprogram;

import java.util.Scanner;

public class perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,x;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		
		int n=sc.nextInt();
		for(int i=1;i<n;i++) {
			if (n%i==0) {
				x=i;
				System.out.println("the divisior number is " +x);
				sum=sum+i;
			System.out.println("the sum is " +sum);
			}
		
		}
		if (sum == n)
			System.out.println("it is a perfect number");
		else
			System.out.println("it is not a perfect number");
	}
}

