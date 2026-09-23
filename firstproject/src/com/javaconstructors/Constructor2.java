package com.javaconstructors;

public class Constructor2 {
	static int count_of_objects;

	Constructor2() {
		count_of_objects += 1;
	}

	public static void main(String[] args) {
		Constructor2 c2 = new Constructor2();
		Constructor2 c3 = new Constructor2();
		Constructor2 c4 = new Constructor2();
		System.out.println("Number of objects created is :" + count_of_objects);
	}
}
