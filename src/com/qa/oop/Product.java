package com.qa.oop;

public class Product {
	String name;
	int price;
	String category;
	int rating;
	int discountPercentage;
	boolean isAvailable;

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

	double productDiscountPrice() {
		return (price * discountPercentage / 100);
	}

	double productFinalPrice() {
		return price - productDiscountPrice();

	}

}
