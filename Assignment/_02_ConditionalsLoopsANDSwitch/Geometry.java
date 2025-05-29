package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Geometry Operations: \n" +
                "1. Area \n2. Perimeter \n3. Volume \n4. Curved Surface Area \n5. Total Surface Area ");
        System.out.print("Enter Your Choice (1-5): ");
        int geometry = sc.nextInt();

        switch (geometry) {
            case 1 -> {
                System.out.println("*** AREA ***");

                System.out.println("\nEnter radius for circle: ");
                double radius = sc.nextDouble();
                System.out.println("Area of Circle is: " + (Math.PI * radius * radius));

                System.out.println("\nEnter base and height for triangle: ");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                System.out.println("Area of Triangle is: " + (0.5 * base * height));

                System.out.println("\nEnter length and width for rectangle: ");
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                System.out.println("Area of Rectangle is: " + (length * width));

                System.out.println("\nEnter base and height for isosceles triangle: ");
                double base1 = sc.nextDouble();
                double height1 = sc.nextDouble();
                System.out.println("Area of Isosceles Triangle is: " + (0.5 * base1 * height1));

                System.out.println("\nEnter base and height for parallelogram: ");
                double base2 = sc.nextDouble();
                double height2 = sc.nextDouble();
                System.out.println("Area of Parallelogram is: " + (base2 * height2));

                System.out.println("\nEnter diagonals d1 and d2 for rhombus: ");
                double d1 = sc.nextDouble();
                double d2 = sc.nextDouble();
                System.out.println("Area of Rhombus is: " + (0.5 * d1 * d2));

                System.out.println("\nEnter side for equilateral triangle: ");
                double side = sc.nextDouble();
                System.out.println("Area of Equilateral Triangle is: " + ((Math.sqrt(3) / 4) * side * side));

            }
            case 2 -> {
                System.out.println("*** PERIMETER ***");

                System.out.println("\nEnter radius for circle: ");
                double radius = sc.nextDouble();
                System.out.println("Perimeter of Circle is: " + (2 * Math.PI * radius));

                System.out.println("\nEnter side for equilateral triangle: ");
                double side = sc.nextDouble();
                System.out.println("Perimeter of Equilateral Triangle is: " + (3 * side));

                System.out.println("\nEnter base and side for parallelogram: ");
                double base = sc.nextDouble();
                double side2 = sc.nextDouble();
                System.out.println("Perimeter of Parallelogram is: " + (2 * (base + side2)));

                System.out.println("\nEnter length and width for rectangle: ");
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                System.out.println("Perimeter of Rectangle is: " + (2 * (length + width)));

                System.out.println("\nEnter side for square: ");
                double side1 = sc.nextDouble();
                System.out.println("Perimeter of Square is: " + (4 * side1));

                System.out.println("\nEnter side for rhombus: ");
                double side3 = sc.nextDouble();
                System.out.println("Perimeter of Rhombus is: " + (4 * side3));

            }
            case 3 -> {
                System.out.println("*** VOLUME ***");

                System.out.println("\nEnter radius and height for cone: ");
                double radius = sc.nextDouble();
                double height = sc.nextDouble();
                System.out.println("Volume of Cone is: " + ((1.0 / 3) * Math.PI * radius * radius * height));

                System.out.println("\nEnter base area and height for prism: ");
                double baseArea = sc.nextDouble();
                double prismHeight = sc.nextDouble();
                System.out.println("Volume of Prism is: " + (baseArea * prismHeight));

                System.out.println("\nEnter radius and height for cylinder: ");
                double cylRadius = sc.nextDouble();
                double cylHeight = sc.nextDouble();
                System.out.println("Volume of Cylinder is: " + (Math.PI * cylRadius * cylRadius * cylHeight));

                System.out.println("\nEnter radius for sphere: ");
                double sphereRadius = sc.nextDouble();
                System.out.println("Volume of Sphere is: " + ((4.0 / 3) * Math.PI * Math.pow(sphereRadius, 3)));

                System.out.println("\nEnter base area and height for pyramid: ");
                double pyrBase = sc.nextDouble();
                double pyrHeight = sc.nextDouble();
                System.out.println("Volume of Pyramid is: " + ((1.0 / 3) * pyrBase * pyrHeight));

            }
            case 4 -> {
                System.out.println("*** CURVED SURFACE AREA ***");

                System.out.println("\nEnter radius and height for cylinder: ");
                double radius = sc.nextDouble();
                double height = sc.nextDouble();
                System.out.println("Curved Surface Area of Cylinder is: " + (2 * Math.PI * radius * height));

            }
            case 5 -> {
                System.out.println("*** TOTAL SURFACE AREA ***");

                System.out.println("\nEnter side for cube: ");
                double side = sc.nextDouble();
                System.out.println("Total Surface Area of Cube is: " + (6 * side * side));

            }
            default -> System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
