package chapter1;

import java.util.Scanner;
public class P36 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the radius of the cone: ");
	        double radius = sc.nextDouble();

	        System.out.print("Enter the height of the cone: ");
	        double height = sc.nextDouble();

	        double volume = (1.0 / 3) * Math.PI * radius * radius * height;

	        System.out.printf("Volume of the cone is: %.2f\n", volume);

	        sc.close();
	    }
	}