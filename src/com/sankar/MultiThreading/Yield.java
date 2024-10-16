package com.sankar.MultiThreading;

public class Yield extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	public static void main(String[] args)throws InterruptedException {
		Yield y=new Yield();
		y.start();
		Thread.yield();
		for(int i=10;i<=14;i++) {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
