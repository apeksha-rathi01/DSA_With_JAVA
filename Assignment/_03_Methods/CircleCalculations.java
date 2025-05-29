package Assignment._03_Methods;

import java.util.Scanner;

public class CircleCalculations {
    static void circumference(double radius) {
        double circumference = 2 * Math.PI * radius;
        System.out.printf("Circumference of the circle: %.2f\n", circumference);
    }
     static void area(double radius) {
        double area = Math.PI * radius * radius;
        System.out.printf("Area of the circle: %.2f\n", area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the radius of circle: ");
        double r = sc.nextDouble();
        circumference(r);
        area(r);

    }
}
