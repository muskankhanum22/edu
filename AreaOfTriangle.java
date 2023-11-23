package operators;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("AREA OF TRIANGLE");
		System.out.println("enter the height :");
		double b=sc.nextDouble();
		System.out.println("enter the base");
		double h=sc.nextDouble();
		double area=b*h*0.5;
		System.out.println("area of triangle"+area);
		
		

	}

}
