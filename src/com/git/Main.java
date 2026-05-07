package com.git;

public class Main {
	
	private String name;
	private String address;
	
	private int length;
	private int breadth;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public String display() {
		return name+" "+address;
	}

	@Override
	public String toString() {
		return "Main [name=" + name + ", address=" + address + "]";
	}
	
	
	public int area() {
		return length*breadth;
	}
	

}
