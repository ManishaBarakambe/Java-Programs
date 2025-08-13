package chapter1;

import java.util.Scanner;

public class P21 {
	
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);


	        System.out.print("Enter the number of subjects: ");
	        int n = sc.nextInt();

	        double totalGradePoints = 0;
	        int totalCredits = 0;

	        for (int i = 1; i <= n; i++) {
	            System.out.print("Enter grade point for subject " + i + ": ");
	            double gradePoint = sc.nextDouble();

	            System.out.print("Enter credit for subject " + i + ": ");
	            int credit = sc.nextInt();

	            totalGradePoints += gradePoint * credit;
	            totalCredits += credit;
	        }

	 
	        double cgpa = totalGradePoints / totalCredits;

	 
	        System.out.printf("Your CGPA is: %.2f\n", cgpa);

	        sc.close();
	    }
	}

