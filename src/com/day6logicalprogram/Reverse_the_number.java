package com.day6logicalprogram;

import java.util.Scanner;

public class Reverse_the_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number :");
		int num=sc.nextInt();
		int sum=0,a,org;
		org=num;
		while(num!=0) {
			a=num%10;
			sum=sum*10+a;
			num=num/10;
			System.out.println("reversed number is :" +sum);
		}
	}
}
