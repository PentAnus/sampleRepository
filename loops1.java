package com.basic;

public class loops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234567,c=0;
		while(n!=0) {
			//t=n%10;
			n/=10;
			c++;
			//n/=10;
		}
		System.out.println("No. of digits: "+c);

		int n1=1234,rev=0,rem;
		while(n1!=0) {
			rem=n1%10;
			rev=(rev*10)+rem;
			n1/=10;
		}
		System.out.println("Reverse of a number: "+rev);
	}

}
