package chapter1;

import java.util.Scanner;
public class P13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int year = sc.nextInt();
		if(year % 4 == 0) {
			System.out.println("Year is leap year");
		} else {
			System.out.println("Year is non leap");
		}
	}

}