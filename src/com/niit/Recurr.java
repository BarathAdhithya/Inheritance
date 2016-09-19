package com.niit;

public class Recurr {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] fib = new int[6];
		fib[0]=0;
		fib[1]=1;
		for(int k=2;k<5;k++){
			fib[k] = fib[k-1] + fib[k-2];
			}
		for(int k=0;k<5;k++){
			System.out.println(fib[k]);
		}
			
	

	}

}
