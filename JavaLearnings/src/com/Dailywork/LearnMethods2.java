package com.Dailywork;

public class LearnMethods2 {
    static void removezeroes(int a)
    {int reverse=0;
    System.out.println("After removing all zeroes from " + a);
    	while(a>0) {
    		int rem=a%10;
    		if(rem!=0){
    			reverse=(reverse*10)+rem;
    		} 
    		a=a/10;
    	}
    	while(reverse>0) {
    		int rem=reverse%10;
    		a=a*10+rem;
    		reverse=reverse/10;
    	}
    	System.out.println(a);
    }
    static void differenceOfEvenAndOdd(int a) {
    	System.out.println("The difference of odd digits and even digits of "+a);
    	int evensum=0;
    	int oddsum=0;
    	while(a>0) {
    		int rem=a%10;
    		if(rem%2==0) {
        	evensum+=rem;	
        	}
    		else {
    			oddsum+=rem;
    		}
    		a=a/10;
    	}
    	System.out.println(evensum-oddsum);
    	
    }
    static void digitsInAscending(int a) {
    	int rem1=0;
    	int rem=a%10;
    	int flag=1;
    	a=a/10;
    	while(a>0) {
    		rem1=a%10;
    		if(rem1>rem) {
    			flag=0;
    			break;
    		}
    		a=a/10;
    		rem=rem1;
    	}
    	if(flag==1) {
    		System.out.println("Yes! All digits in Ascending Order");
    	}
    	else{
    		System.out.println("No, All digits not in Ascending Order");
    	}
    }
    static void digitsInDescending(int a) {
    	int rem=a%10;
    	a=a/10;
    	int flag=1;
    	int rem1=0;
    	while(a>0) {
    		rem1=a%10;
    		if (rem1<rem){
    			flag=0;
    			break;
    		}
    		rem=rem1;
    		a=a/10;
    	}
    	if(flag==1) {
    		System.out.println("Yes! All digits are in Descending order");
    	}
    	else {
    		System.out.println("No, All digits are not in Descending order");
    	}
    }
    static void larAndSmall(int a) {
    	System.out.println("The smallest and largest digits in "+a);
    	int rem=0;
    	int lar=0;
    	int small=10;
    	while(a>0) {
    		rem=a%10;
    		if(rem>lar) {
    			lar=rem;
    		}
    		if(rem<small) {
    			small=rem;
    		}
    		a=a/10;
    	}
    	System.out.println(small+","+lar);
    }
    static void repeatedDigitSum(int a) {
    	System.out.println("The repaeted sum of digits in "+a);
    	int rem=0;
    	int sum=0;
    	do{
    		sum=0;
    		while(a>0) {
    			rem=a%10;
    			sum+=rem;
    			a=a/10;
    		}
    		a=sum;
    	}
    	while(sum>10);
    	System.out.println(sum);
    }
	public static void main(String[] args) {
		removezeroes(12008970);
		differenceOfEvenAndOdd(8906614);
		digitsInAscending(12934);
		digitsInDescending(9287);
		larAndSmall(9802);
		repeatedDigitSum(67867);
	}

}
