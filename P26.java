package chapter1;


import java.util.Scanner;

public class P26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the equal sides (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter the length of the base (b): ");
        double b = sc.nextDouble();

        if (b >= 2 * a) {
            System.out.println("Invalid dimensions for an isosceles triangle.");
        } else {
            
            double height = Math.sqrt(a * a - (b / 2) * (b / 2));

            double area = 0.5 * b * height;

            System.out.printf("Area of the isosceles triangle is: %.2f\n", area);
        }

        sc.close();
    }
}