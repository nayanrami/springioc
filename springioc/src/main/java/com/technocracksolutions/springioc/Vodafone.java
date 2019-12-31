package com.technocracksolutions.springioc;

public class Vodafone implements Sim{

	public Vodafone() {
		System.out.println("Vodafone Constructor Called...");
	}
	
	public void calling() {
		System.out.println("Calling Through Vodafone");		
	}

	public void data() {
		System.out.println("Data Through Data");		
	}

}
