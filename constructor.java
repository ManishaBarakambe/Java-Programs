package javaPrograms;

public class constructor {

	public constructor(){
		System.out.println("I am default constructor");
	}
	
	public constructor(int a) {
		System.out.println("I am parameterized constructor");
	}
	public static void main(String[] args) {
		constructor c=new constructor();
		constructor a=new constructor(67); 
		
	}

}
