package com.javaconstructors;

public class Product {
	int productId;
	String productName;
	int price;
	int quantity;

	Product(Product p1, int quantity) {
		productId = p1.productId;
		productName = p1.productName;
		price = p1.price;
		this.quantity = quantity;
	}

	Product(int productId, String productName, int price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public static void main(String[] args) {
		Product p1 = new Product(101, "Nivea", 200, 2);
		Product p2 = new Product(p1, 3);
		p1.totalprice(p2);
		p1.productId = 103;
		p1.productName = "Simple Cleanser";
		p1.details();
		p2.details();
	}

	void totalprice(Product p2) {
		var totalAmount = (price * quantity) + (p2.price + p2.quantity);
		System.out.println("The total Amount used to buy both the products is: " + totalAmount);
	}

	void details() {
		System.out.println("\nProduct details: ");
		System.out.println(
				"Id:" + productId + "\nName: " + productName + "\nPrice: " + price + "\nQuantity: " + quantity);

	}

}
