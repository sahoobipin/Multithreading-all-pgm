package com.sankar.MultiThreading;

public class Sleep extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+":"+Thread.currentThread().getName());
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Sleep s=new Sleep();
		s.start();
		Sleep s2=new Sleep();
		s2.start();
//		MyT t=new MyT();
//		t.run();
	}
}
class MyT extends Thread{
	public void run() {
		for(int i=11;i<=15;i++) {
			System.out.println(i+":"+Thread.currentThread().getName());
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}