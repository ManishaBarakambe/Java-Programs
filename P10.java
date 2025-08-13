package chapter1;
import java.util.Scanner;
public class P10 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of values to average: ");
    int count = sc.nextInt();

    double sum = 0;

    for (int i = 0; i < count; i++) {
        System.out.print("Enter number " + (i + 1) + ": ");
        double value = sc.nextDouble();
        sum += value;
    }

    double average = sum / count;

    System.out.println("The average of the values is: " + average);

    sc.close();
	}

}
