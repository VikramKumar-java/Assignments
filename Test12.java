package com.vcube.lab;

import java.util.Scanner;

public class Test12 {
	public void welcomeMsg() {
		System.out.println("hii sir good morning:");
	}
	
	public void hello() {
		System.out.println("***************customer bill*********************");
	}

	public void nameOfCompany(String name) {
		System.out.println(name);
	}

	public int carRentalRate(int a, int b, int c) {
		return (a * b) + c;
	}

	public void display(int d) {
		System.out.println("total rental :" + d);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the car rentals name :");
		String name = sc.nextLine();
		System.out.println("enter the car rental rate per day");
		int a = sc.nextInt();
		System.out.println("enter number of days:");
		int b = sc.nextInt();
		System.out.println("enter insurance:");
		int c = sc.nextInt();
		Test12 t = new Test12();
		t.hello();
		t.welcomeMsg();
		t.nameOfCompany(name);
		int d = t.carRentalRate(a, b, c);
		t.display(d);
	}

}
