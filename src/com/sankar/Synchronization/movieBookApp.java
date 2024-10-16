package com.sankar.Synchronization;
class BookTheatreSeats{
	int totalSeats=10;
	synchronized void bookSeats(int seats) {
		if(totalSeats>=seats) {
			System.out.println("seats booked successfully");
			totalSeats=totalSeats-seats;
			System.out.println("Total seats available="+totalSeats);
		}else {
			System.out.println("seats cant booked");
			System.out.println("seats left="+totalSeats);
		}
	}
}
public class movieBookApp extends Thread {
	static BookTheatreSeats b;
	int seats;
	public void run() {
		b.bookSeats(seats);
	}
	public static void main(String[] args) {
		b=new BookTheatreSeats();
		movieBookApp a=new movieBookApp();
		a.seats=3;
		a.start();
		
		movieBookApp c=new movieBookApp();
		c.seats=4;
		c.start();
		
		movieBookApp d=new movieBookApp();
		d.seats=2;
		d.start();
	}
}