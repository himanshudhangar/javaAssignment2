package com.practice2_ifelse;
import java.util.Scanner;
public class PalindroneNo {

	public static void main(String[] args) {
	int num, x,i,rem;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	num=sc.nextInt();
	x=num;
	for(i=0;num>0;num/=10) {
		rem=num%10;
		i=(i*10)+rem;
	}
	if(i==x) {
		System.out.println(x+"is a palindrone number");
	}
	else {
		System.out.println(x+"is not palindrom number");
	}
	
	
	
	}

}
