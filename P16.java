package chapter1;

import java.util.Scanner;

public class P16 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	     
	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();
	        System.out.print("Enter number of columns: ");
	        int cols = sc.nextInt();

	        int[][] matrix1 = new int[rows][cols];
	        int[][] matrix2 = new int[rows][cols];
	        int[][] sum = new int[rows][cols];

	     
	        System.out.println("\nEnter elements of Matrix 1:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print("matrix1[" + i + "][" + j + "] = ");
	                matrix1[i][j] = sc.nextInt();
	            }
	        }

	   
	        System.out.println("\nEnter elements of Matrix 2:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print("matrix2[" + i + "][" + j + "] = ");
	                matrix2[i][j] = sc.nextInt();
	            }
	        }

	     
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                sum[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }

	      
	        System.out.println("\nSum of the two matrices:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(sum[i][j] + " ");
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	}