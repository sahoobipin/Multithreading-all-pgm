package com.sankar.Synchronization;
class BookTheatreSeat{
	int totalSeats=10;
	 void bookSeats(int seats) {
		System.out.println("hi:"+Thread.currentThread().getName());
		System.out.println("hi:"+Thread.currentThread().getName());
		System.out.println("hi:"+Thread.currentThread().getName());
		System.out.println("hi:"+Thread.currentThread().getName());
		synchronized(this) {
		if(totalSeats>=seats) {
			System.out.println("seats booked successfully");
			totalSeats=totalSeats-seats;
			System.out.println("Total seats available="+totalSeats);
		}else {
			System.out.println("seats cant booked");
			System.out.println("seats left="+totalSeats);
		}
		}
		System.out.println("hi:"+Thread.currentThread().getName());
		System.out.println("hi:"+Thread.currentThread().getName());
		System.out.println("hi:"+Thread.currentThread().getName());
		System.out.println("hi:"+Thread.currentThread().getName());
	}
}
public class movieBookApp2 extends Thread {
	static BookTheatreSeat b;
	int seats;
	public void run() {
		b.bookSeats(seats);
	}
	public static void main(String[] args) {
		b=new BookTheatreSeat();
		movieBookApp2 a=new movieBookApp2();
		a.seats=3;
		a.start();
		
		movieBookApp2 c=new movieBookApp2();
		c.seats=4;
		c.start();
		
		movieBookApp2 d=new movieBookApp2();
		d.seats=2;
		d.start();
	}
}