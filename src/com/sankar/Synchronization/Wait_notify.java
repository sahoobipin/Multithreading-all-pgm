package com.sankar.Synchronization;
class TotalEarning extends Thread{
	int total=0;
	public void run() {
		synchronized(this) {
			for(int i=1;i<=10;i++) {
				total+=100;
				this.notify();
			}
		}
	}
}
public class Wait_notify {
	public static void main(String[] args) throws InterruptedException {
		TotalEarning t=new TotalEarning();
		t.start();
		synchronized(t) {
			t.wait();
		System.out.println("totalEarning="+t.total);
		}
	}
}