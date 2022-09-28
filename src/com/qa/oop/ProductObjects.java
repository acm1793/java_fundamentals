package com.qa.oop;

public class ProductObjects {

	public static void main(String[] args) {
		// Creating objects for my Product Class

		Product product;
		product = new Product("Banana", 2, "Fruit", 4, 10, true);
		/*System.out.println("name: " + product.name);
		*System.out.println("price: " + product.price);
		*System.out.println("category: " + product.category);
		*System.out.println("rating " + product.rating);
		*System.out.println("discountPercentage " + product.discountPercentage);
		*System.out.println("isAvailable: " + product.isAvailable);

		*System.out.println("-------------------------------");
		*/
		product.displayProductInformation();
		
		/*product.name = "Banana";
		*product.price = 2;
		*product.category = "Fruit";
		*product.rating = 4;
		*product.discountPercentage = 10;
		*product.isAvailable = true;
		*/
		
		/*System.out.println("Product name: " + product.name);
		*System.out.println("Product price: " + product.price);
		*System.out.println("Product category: " + product.category);
		*System.out.println("Product rating: " + product.rating);
		*System.out.println("Product discount: " + product.discountPercentage);
		*System.out.println("Product availability: " + product.isAvailable);
		*/
		
		System.out.println("-------------------------------");
		
		
		Product product2;
		product2 = new Product("Tomato", 1, "Vegetable", 5, 8, true);
		
		product2.displayProductInformation();
		
		/*product2.name = "Tomato";
		*product2.price = 1;
		*product2.category = "Vegetable";
		*product2.rating = 5;
		*product2.discountPercentage = 8;
		*product2.isAvailable = true;
		*
		*System.out.println("Product name: " + product2.name);
		*System.out.println("Product price: " + product2.price);
		*System.out.println("Product category: " + product2.category);
		*System.out.println("Product rating: " + product2.rating);
		*System.out.println("Product discount: " + product2.discountPercentage);
		*System.out.println("Product availability: " + product2.isAvailable);
		*/
		System.out.println("-------------------------------");
		
		
		
		Product product3;
		product3 = new Product("Cherry", 3, "Fruit", 4, 0, false);
		
		product3.displayProductInformation();
		
		/*product3.name = "Cherry";
		*product3.price = 3;
		*product3.category = "Fruit";
		*product3.rating = 4;
		*product3.discountPercentage = 0;
		*product3.isAvailable = false;
		*
		*System.out.println("Product name: " + product3.name);
		*System.out.println("Product price: " + product3.price);
		*System.out.println("Product category: " + product3.category);
		*System.out.println("Product rating: " + product3.rating);
		*System.out.println("Product discount: " + product3.discountPercentage);
		*System.out.println("Product availability: " + product3.isAvailable);
		*/
		
	}

}