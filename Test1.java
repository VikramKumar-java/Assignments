package com.vcube.lab;

import java.math.BigInteger;
import java.math.BigDecimal;

public class Test1 {
	BigInteger b1 = new BigInteger("129476293523094595");
	BigInteger b2 = new BigInteger("209467295209886287");

	public static void main(String[] args) {
		System.out.println("main method started");
		Test1 t = new Test1();
		System.out.println(t.b1);
		System.out.println(t.b2);
		System.out.println("****************************");
		System.out.println(t.b1.add(t.b2));
		System.out.println("*****************************");
		System.out.println(t.b1.subtract(t.b2));
		System.out.println("******************************");
		System.out.println(t.b1.divide(t.b2));
		System.out.println("********************************");
		System.out.println(t.b1.mod(t.b2));
		System.out.println("**************************");
		System.out.println(t.b1.multiply(t.b2));

	}

}
