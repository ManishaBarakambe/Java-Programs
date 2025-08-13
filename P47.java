package chapter1;
import java.util.Scanner;
public class P47 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	
	        System.out.print("Enter total runs scored: ");
	        int totalRuns = sc.nextInt();

	        System.out.print("Enter number of times out: ");
	        int timesOut = sc.nextInt();

	        if (timesOut == 0) {
	            System.out.println("Batting average is undefined (player was never out).");
	        } else {
	            double average = (double) totalRuns / timesOut;
	            System.out.printf("Batting average is: %.2f\n", average);
	        }

	        sc.close();
	    }
	}