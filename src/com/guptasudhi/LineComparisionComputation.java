package com.guptasudhi;
import java.util.Scanner;

public class LineComparisionComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Problem");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of X1 co-ordinate ");
		int x1 = input.nextInt();
		System.out.println("Enter the value of X2 co-ordinate ");
		int x2 = input.nextInt();
		System.out.println("Enter the value of Y1 co-ordinate ");
		int y1 = input.nextInt();
		System.out.println("Enter the value of Y2 co-ordinate ");
		int y2 = input.nextInt();
		System.out.println("Enter the value of M1 co-ordinate ");
		int m1 = input.nextInt();
		System.out.println("Enter the value of M2 co-ordinate ");
		int m2 = input.nextInt();
		System.out.println("Enter the value of N1 co-ordinate ");
		int n1 = input.nextInt();
		System.out.println("Enter the value of N2 co-ordinate ");
		int n2 = input.nextInt();
		
		//computing the length of two lines
		double length1=lineLength(x1,y1,x2,y2);
		double length2=lineLength(m1,n1,m2,n2);
		
		if(length1==length2)
			System.out.println("Two lines are equal");
		else if(length1>length2)
			System.out.println("length1 is greater than length2");
		else
			System.out.println("length2 is greater than length1");
	}
	
	public static double lineLength(double x1,double y1,double x2,double y2) {
		double x = Math.pow((x2-x1),2);
		double y = Math.pow((y2-y1),2);
		double length=Math.sqrt(x+y);
		return length;
	}

}
