package chapter1;

import java.util.Scanner;

public class P25 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the length of the rectangle: ");
	        double length = sc.nextDouble();

	        System.out.print("Enter the width of the rectangle: ");
	        double width = sc.nextDouble();

	        double area = length * width;

	        System.out.printf("Area of the rectangle is: %.2f\n", area);

	        sc.close();
	    }
	}