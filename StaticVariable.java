package com.variable;

public class StaticVariable {
	
	static int a;
	static float b;
	static byte c;
	static String s;
	static String name="muskan";
	static String age="21";
	static String department="bca";
	static {
		System.out.println("student details");
	}
	

	public static void main(String[] args) {
		System.out.println("my name is:"+name);
		System.out.println("my age is:"+age);
		System.out.println("my department is:"+department);
		System.out.println(s);
		

	}

}
