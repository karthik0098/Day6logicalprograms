package com.day6logicalprogram;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,count=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		for (i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
			if(count==2) {
				System.out.println("its is a prime number");
			}
			else
				System.out.println("its not a prime number");
		
	}

}
