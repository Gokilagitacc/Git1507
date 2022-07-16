package org.text;

public class Sample {

	public Sample() {
		
		System.out.println("Default Constructor");
		
	}
	
	public Sample(int age) {
		
		System.out.println("Int Parameterized Constructor:  "+ age);
		
	}
	
	public Sample(String name) {
		
		System.out.println("String Parameterized Constructor:  "+ name);
		
	}
	
	public static void main(String[] args) {
		
		Sample s = new Sample();
		Sample s1 = new Sample(25);
		Sample s2 = new Sample("Balaji");
		
		
	}
	
}
