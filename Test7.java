package com.vcube.lab;

public class Test7 {
	public static void main(String[] args) {
       int a = 6657;
       System.out.println("number of thousands in given number is:"+a/1000);
       System.out.println("number of hunderds in given number is:"+(a%1000)/100);
       System.out.println("number of tens in given number is:"+(a%100)/10);
       System.out.println("number of ones in given number is:"+(a%10));
	}
}
