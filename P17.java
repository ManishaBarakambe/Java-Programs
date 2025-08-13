package chapter1;

import java.util.Scanner;
import java.util.Arrays;

public class P17 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	     
	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();

	  
	        int[] arr = new int[n];

	    
	        System.out.println("\nEnter the elements:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            arr[i] = sc.nextInt();
	        }

	     
	        Arrays.sort(arr);

	        System.out.println("\nSorted Array in Ascending Order:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	        sc.close();
	    }
	}