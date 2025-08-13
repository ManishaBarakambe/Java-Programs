package chapter1;

public class P15 {
	    public static void main(String[] args) {
	        int[] numbers = {12, 7, 9, 20, 33, 18, 5, 44};

	        System.out.println("Even numbers in the array:");
	        for (int num : numbers) {
	            if (num % 2 == 0) {
	                System.out.print(num + " ");
	            }
	        }

	        System.out.println("\nOdd numbers in the array:");
	        for (int num : numbers) {
	            if (num % 2 != 0) {
	                System.out.print(num + " ");
	            }
	        }
	    }
		

	}
