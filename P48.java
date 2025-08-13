package chapter1;
import java.util.Scanner;
public class P48 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        double num1 = sc.nextDouble();

	        System.out.print("Enter second number: ");
	        double num2 = sc.nextDouble();

	        System.out.print("Choose operation (+, -, *, /, %): ");
	        char operator = sc.next().charAt(0);

	        double result;

	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                System.out.printf("Result: %.2f\n", result);
	                break;
	            case '-':
	                result = num1 - num2;
	                System.out.printf("Result: %.2f\n", result);
	                break;
	            case '*':
	                result = num1 * num2;
	                System.out.printf("Result: %.2f\n", result);
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.printf("Result: %.2f\n", result);
	                } else {
	                    System.out.println("Error: Division by zero.");
	                }
	                break;
	            case '%':
	                if (num2 != 0) {
	                    result = num1 % num2;
	                    System.out.printf("Result: %.2f\n", result);
	                } else {
	                    System.out.println("Error: Modulus by zero.");
	                }
	                break;
	            default:
	                System.out.println("Invalid operator.");
	        }

	        sc.close();
	    }
	}