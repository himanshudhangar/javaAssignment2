package com.practice2_ifelse;

public class ReverseWL {

	public static void main(String[] args) {
		int num=1234;
		int r=0;
		while(num!=0) {
			int z=num%10;
			r=r*10+z;
			num=num/10;
		}
		
	
}
}
