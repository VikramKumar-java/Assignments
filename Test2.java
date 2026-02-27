package com.vcube.lab;

class Book {
	int bookId;
	String title;
	String author;
	int price;
}
class Book1{
	int bookId;
	String title;
	String author;
	int price;
}
class Book2 {
	int bookId;
	String title;
	String author;
	int price;
}
class Book3 {
	int bookId;
	String title;
	String author;
	int price;
}
public class Test2 {

	public static void main(String[] args) {
		int discount = 10;

		Book b1 = new Book();
		b1.bookId = 121;
		b1.title="abc";
		b1.author="xyz";
		b1.price=200;
		System.out.println(b1.bookId);
		System.out.println(b1.title);
		System.out.println(b1.author);
		System.out.println(b1.price);
		
		Book b2 = new Book();
		b2.bookId = 122;
		b2.title="abc";
		b2.author="xyz";
		b2.price=250;
		
		System.out.println(b2.bookId);
		System.out.println(b2.title);
		System.out.println(b2.author);
		System.out.println(b2.price);
		
		Book b3 = new Book();
		b3.bookId = 123;
		b3.title="abc";
		b3.author="xyz";
		b3.price=300;
		
		System.out.println(b3.bookId);
		System.out.println(b3.title);
		System.out.println(b3.author);
		System.out.println(b3.price);
		
		Book b4 = new Book();
		b4.bookId = 123;
		b4.title="abc";
		b4.author="xyz";
		b4.price=300;
		
		System.out.println(b4.bookId);
		System.out.println(b4.title);
		System.out.println(b4.author);
		System.out.println(b4.price);
		
		System.out.println("**********************************");
		int totalPrice = b1.price+b2.price+b3.price+b4.price;
		System.out.println("total price is :"+ totalPrice);
		int discountPrice = (totalPrice * discount) / 100;
		int finalPrice = totalPrice-discountPrice;
		System.out.println("total price is :"+finalPrice);


	}

}
