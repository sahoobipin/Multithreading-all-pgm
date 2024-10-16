package com.sankar.MultiThreading;

public class DaemonThread extends Thread {
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread");
		}else {
			System.out.println("not Daemon");
		}
	}
	public static void main(String[] args) {
		System.out.println("main thread");
		DaemonThread d=new DaemonThread();
		d.setDaemon(true);
		d.start();
	}
}
