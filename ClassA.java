package javaPrograms;

public class ClassA {
	public ClassA() {
		System.out.println("I am in class A");
	}
	public ClassA(int a) {
		System.out.println("Value of a is:" +a);
	}

	public static void main(String[] args) {
		
		ClassA a=new ClassA();
		ClassA x=new ClassA();

	}

}
