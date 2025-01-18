package com.beans;

import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel implements Sim{

	@Override
	public String calling() {
		return "calling from airtel";
	}

	
}
