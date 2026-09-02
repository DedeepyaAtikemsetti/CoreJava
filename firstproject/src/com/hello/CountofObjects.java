package com.hello;

public class CountofObjects {
	static int a=0; 
	CountofObjects()
	{
		a=a+1;
	}
	public static void main(String[] args) {
		CountofObjects c1 = new CountofObjects();
		CountofObjects c2 = new CountofObjects();
		CountofObjects c3 = new CountofObjects();
		CountofObjects c4 = new CountofObjects();
		System.out.println(a);

	}

}
