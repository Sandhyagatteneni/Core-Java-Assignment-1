package com.assignmentone;

public class Shape {

	public void area(int s) {
		int area = s*s;
		System.out.println("Area of square = "+area);
	}
	public void perimeter(int s) {
		double perimeter = 4*s;
		System.out.println("Perimeter of square = "+perimeter);
	}
	public void area(double l, double b) {
		double area = l*b;
		System.out.println("Area of rectangle = "+area);
	}
	public void perimeter(int l, int b) {
		double perimeter = 2*(l+b);
		System.out.println("Perimeter of rectangle = "+perimeter);
	}

}	
