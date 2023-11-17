package com.edu;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur name");
		String name=sc.nextLine();
		System.out.println("my name is"+name);
		System.out.println("enter your age");
		int age=sc.nextInt();
		System.out.println("my age is "+age);
		System.out.println();
		System.out.println("enter your score");
		float percentage=sc.nextFloat();
		System.out.println("MY percentage is "+percentage);
	
		}

}
