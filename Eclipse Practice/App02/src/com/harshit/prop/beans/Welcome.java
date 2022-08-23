package com.harshit.prop.beans;

public class Welcome {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String wish() {
		return "Good Morning "+name+", have a nice day ahead!";
	}
}
