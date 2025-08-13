package chapter1;

import java.util.Scanner;

public class P27 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	  
	        System.out.print("Enter the base of the parallelogram: ");
	        double base = sc.nextDouble();

	        System.out.print("Enter the height of the parallelogram: ");
	        double height = sc.nextDouble();

	      
	        double area = base * height;

	        System.out.printf("Area of the parallelogram is: %.2f\n", area);

	        sc.close();
	    }
	}