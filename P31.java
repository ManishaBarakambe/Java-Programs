package chapter1;

import java.util.Scanner;

public class P31 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter side length of the equilateral triangle: ");
	        double side = sc.nextDouble();
	        double perimeter = 3 * side;
	        System.out.printf("Perimeter of the equilateral triangle: %.2f\n", perimeter);
	        sc.close();
	    }
	}