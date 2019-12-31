package com.technocracksolutions.springioc;

public class Jio implements Sim{
	public Jio() {
		System.out.println("Jio Constructor Called...");
	}
	public void calling() {
		System.out.println("Calling Through Jio");		
	}

	public void data() {
		System.out.println("Data Through Jio");		
	}
}