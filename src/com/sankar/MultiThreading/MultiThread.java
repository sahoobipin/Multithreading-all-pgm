package com.sankar.MultiThreading;

public class MultiThread extends Thread {
	public void run() {
		System.out.println("run:"+Thread.currentThread().getName());
		System.out.println("thread task");
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MultiThread m=new MultiThread();
		m.start();
		MultiThread m2=new MultiThread();
		m2.start();
		System.out.println("main:"+Thread.currentThread().getName());
	}
}
