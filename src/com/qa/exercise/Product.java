package com.qa.exercise;

public class Product {
	
	
	String name;
	public int price;
	String category;
	int rating;
	int discountPercentage;
	boolean isAvailable;
	
	static String SELLER_NAME = "John";
	static String CONTACT_NUMBER = "07433447789";
	static String EMAIL_ADDRESS = "johnfruits@gmail.com";

	public Product(String name, int price, String category, int rating, int discountPercentage, boolean isAvailable) {
		System.out.println("Product(arg) is called...");
		this.name = name;
		this.price = price;
		this.category = category;
		this.rating = rating;
		this.discountPercentage = discountPercentage;
		this.isAvailable = isAvailable;
	}

	void displayProductInformation() {
		System.out.println("name: " + name);
		System.out.println("price:" + price);
		System.out.println("category:" + category);
		System.out.println("rating:" + rating);
		System.out.println("discountPercentage:" + discountPercentage);
		System.out.println("isAvailable:" + isAvailable);
	}
	
	void sellerContactDetails() {
		System.out.println("The Seller name is " + SELLER_NAME);
		System.out.println("Contact number: " + CONTACT_NUMBER);
		System.out.println("With email at " + EMAIL_ADDRESS);
	}

	double productDiscountPrice() {
		return (price * discountPercentage / 100);
	}

	double productFinalPrice() {
		return price - productDiscountPrice();

	}
	

}
