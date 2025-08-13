package chapter1;

import java.util.Scanner;

public class P143D {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	   
	        System.out.print("Enter number of rows: ");
	        int x = sc.nextInt();
	        System.out.print("Enter number of columns: ");
	        int y = sc.nextInt();
	        System.out.print("Enter depth (number of matrices): ");
	        int z = sc.nextInt();

	      
	        int[][][] arr = new int[x][y][z];

	   
	        System.out.println("\nEnter elements of the 3D array:");
	        for (int i = 0; i < x; i++) {
	            for (int j = 0; j < y; j++) {
	                for (int k = 0; k < z; k++) {
	                    System.out.print("arr[" + i + "][" + j + "][" + k + "] = ");
	                    arr[i][j][k] = sc.nextInt();
	                }
	            }
	        }

	  
	        System.out.println("\n3D Array Elements:");
	        for (int i = 0; i < x; i++) {
	            System.out.println("Matrix " + (i + 1) + ":");
	            for (int j = 0; j < y; j++) {
	                for (int k = 0; k < z; k++) {
	                    System.out.print(arr[i][j][k] + " ");
	                }
	                System.out.println();
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	}
		




