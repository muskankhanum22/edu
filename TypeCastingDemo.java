package com.edu;
// implicict casting converting lower data type to higher data type and explict higher to low
public class TypeCastingDemo {

	public static void main(String[] args) {
		int a=100;
		long b=a;
		System.out.println("implicit type casting "+b);
		byte c=12;
		int d=c;
		System.out.println(d);
		byte e=80;
		long f=e;
		System.out.println(f);
		long g=1000;
		int h=(int) g;
		System.out.println(h);
		double y=200.2;
		float x=(float) y;
		System.out.println(x);
		

	}

}
