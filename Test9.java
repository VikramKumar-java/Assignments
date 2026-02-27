package com.vcube.lab;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the length of rectangle:");
		double l = scanner.nextDouble();
		System.out.println("enter the breadth of rectangle:");
		double b = scanner.nextDouble();
		System.out.println("Area of rectangle is:" + getRectangleArea(l, b));
		System.out.println("enter the radius of a circle:");
		double r = scanner.nextDouble();
		System.out.println("Area of circle is :" + getCircleArea(r));
		System.out.println("enter the base of the triangle :");
		double b1 = scanner.nextDouble();
		System.out.println("enter the height of the triangle:");
		double h = scanner.nextDouble();
		System.out.println("Area of the triangle is :" + getTriangleArea(b1, h));
		System.out.println("enter the side of the square:");
		double s = scanner.nextDouble();
		System.out.println("Area of square is :" + getSquareArea(s));

		scanner.close();
	}

	static double getRectangleArea(double l, double b) {
		return 0.5 * l * b;

	}

	static double getCircleArea(double r) {
		return Math.PI * r * r;

	}

	static double getTriangleArea(double h, double b) {
		return 0.5 * h * b;

	}

	static double getSquareArea(double s) {
		return s * s;
	}

}
