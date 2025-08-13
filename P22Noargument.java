package chapter1;

class Car {
    String brand;
    int year;

    Car() {
        brand = "Toyota";
        year = 2020;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class P22Noargument {
    public static void main(String[] args) {
        
        Car c1 = new Car();
        c1.display();
    }
}