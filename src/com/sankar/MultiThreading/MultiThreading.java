package com.sankar.MultiThreading;

import java.util.Scanner;

public class MultiThreading {
	public static void main(String[] args) {
		Thread t=new Thread();
		t.start();
	}
	class Sum extends Thread
	{
		public void run() {
			Scanner scn=new Scanner(System.in);
			System.out.println("enter a num:");
			int n=scn.nextInt();
			int sum=0;
			while(n>0) {
				int rem=n%10;
				sum+=rem;
				n/=10;
			}
			System.out.println(sum);
			scn.close();
		}
	}
}