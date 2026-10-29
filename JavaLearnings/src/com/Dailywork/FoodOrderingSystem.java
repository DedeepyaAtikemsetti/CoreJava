package com.Dailywork;

import java.util.Scanner;

public class FoodOrderingSystem {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc=new Scanner(System.in);
	 String opt;
	 int totalBill=0;
	 do {
     System.out.println("The menu is");
     System.out.println("1 -> Pizza - 200 Rs");
     System.out.println("2 -> Burger - 120 Rs");
     System.out.println("3 -> Biryani - 180 Rs");
     System.out.println("4 -> Noodles - 100 Rs");
     
     System.out.println("Choose an Item: ");
     int item=sc.nextInt();
     System.out.println("Enter the Quantity of the Item Selected: ");
     int quantity=sc.nextInt();
     switch(item) {
     case 1 ->totalBill+=200*quantity;
     case 2 ->totalBill+=120*quantity;
     case 3 ->totalBill+=180*quantity;
     case 4 ->totalBill+=100*quantity;
     default -> System.out.println("Enter a valid item...");
     }
     System.out.println("Do you want to continue ordering, click Y for yes and N for no");
     opt=sc.next();
	 }
     while(opt.equalsIgnoreCase("y"));
	 System.out.println("The total Bill is: "+totalBill);
}
	
}
