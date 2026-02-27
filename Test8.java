package com.vcube.lab;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int reverse=0;
		for(int i =1 ; i>0 ; i++) {
			int digit = a%10;
			
			reverse = reverse*10+digit;
			a = a/10;
			
		}
		System.out.println(reverse);
		scanner.close();
	}
}
