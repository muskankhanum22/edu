package com.edu;

import java.util.Scanner;

public class Operations {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num1= sc.nextInt();
		System.out.println("enter second number");
		int num2= sc.nextInt();
		int sum=num1+num2;
		int sub=num1-num2;
		int mul=num1*num2;
		int div=num1/num2;
		System.out.println("sum of two number "+sum);
		System.out.println("sub of two number "+sub);
		System.out.println("mul of two number "+mul);
		System.out.println("div of two number "+div);
		
		
		
	}

}
