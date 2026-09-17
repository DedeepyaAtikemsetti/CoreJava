package com.learnmethods;

public class Day27 {
    static void largest(int a) {
    System.out.print("The largest digit in "+a+" is: ");
    	int lar=0;
    	while(a>0) {
    		int rem=a%10;
    		if(rem>lar) {
    			lar=rem;
    		}
    		a=a/10;
    	}
    	System.out.println(lar);
    }
    
    static void smallest(int a) {
    	System.out.print("The smallest digit in "+a+" is: ");
    	int small=10;
    	while(a>0) {
    		int rem=a%10;
    		if(rem<small) {
    			small=rem;
    		}
    		a=a/10;
    	}
    	System.out.println(small);
    }
    
    static void zeroes(int a) {
    	System.out.print("Number of zeroes in "+a+" is: ");
    	int zeroes=0;
    	while(a>0) {
    		if ((a%10)==0) {
    			zeroes+=1;
    		}
    		a=a/10;
    	}
    	System.out.println(zeroes);
    }
    
    public static void main(String[] args) {
		largest(19409);
		smallest(3458);
		zeroes(9008);

	}

}
