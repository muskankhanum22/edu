package com.variable;

public class LocalVariable {
	int a;
	float b;
	String s;
	char u;
	byte h;
	String name="muskan";
	String department="bca";
	int age =20;
	String address="jp nagar";
	String email="khanumm22@mail.com";
	String number="678996543";

	
	
	
	

	public static void main(String[] args) {
		int a=10;
		System.out.println("local variable "+a);
		float b=220.4f;
		System.out.println(b);
		String firstName="Muskan";
		String lastName="Khanum";
		int age=21;
		System.out.println(firstName +" "+lastName);
		System.out.println("my age is "+age);
		LocalVariable ob = new LocalVariable();
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.s);
		System.out.println(ob.h);
		System.out.println("NAME: "+ob.name);
		System.out.println("department: "+ob.department);
		System.out.println(ob.age);
		System.out.println(ob.email);
		System.out.println(ob.address);
		System.out.println(ob.number);
		

	}

}
