package com.vcube.lab;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the name");
		String name = scanner.nextLine();
		Test11 t = new Test11();
		String a = t.show(name);
		System.out.println(a);

		scanner.close();
	}

	public String show(String abc) {
		return abc;

	}

}
