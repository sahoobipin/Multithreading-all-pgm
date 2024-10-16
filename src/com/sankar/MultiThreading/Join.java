package com.sankar.MultiThreading;

public class Join extends Thread {
	static Thread t;
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				t.join();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		 t=Thread.currentThread();
		Join j=new Join();
		j.start();
		//j.join();
		for(int i=1;i<=5;i++) {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
