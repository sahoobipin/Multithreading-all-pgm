package com.sankar.MultiThreading;

public class interruptedANDisInterrupted extends Thread {
	public void run() {
		//System.out.println(Thread.interrupted());
		System.out.println(Thread.currentThread().isInterrupted());
		try {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
				Thread.sleep(700);
			} 
		}catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	public static void main(String[] args) {
		interruptedANDisInterrupted i=new interruptedANDisInterrupted();
		i.start();
		i.interrupt();
	}
}
