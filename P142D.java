package chapter1;

import java.util.Scanner;

public class P142D {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
			System.out.println("Enter number of rows:");
			int rows=s.nextInt();
			System.out.println("Enter number of columns:");
			int cols=s.nextInt();
			int[][]array=new int[rows][cols];
			 System.out.println("Enter elements of the array:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                System.out.print("Element [" + i + "][" + j + "]: ");
		                array[i][j] = s.nextInt();
		            }
		        }

		   System.out.println("\nThe 2D array is:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                System.out.print(array[i][j] + "\t");
		            }
		            System.out.println();
		        }

		        s.close();
		}
				
	}

