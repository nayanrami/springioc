package com.technocracksolutions.springioc;

public class Airtel implements Sim {
	public Airtel() {
		System.out.println("Airtel Constructor Called...");
	}

	public void calling() {
		System.out.println("Calling Through Airtel");
	}

	public void data() {
		System.out.println("Data Through Airtel");
	}
}
