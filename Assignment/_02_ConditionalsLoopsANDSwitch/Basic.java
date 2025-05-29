package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Geometry Operations: \n" +
                "1. Area \n2. Perimeter \n3. Volume \n4. Curved Surface Area \n5. Total Surface Area ");
        System.out.print("Enter Your Choice (1-5): ");
        int geometry = sc.nextInt();

        switch (geometry) {
            case 1:
                System.out.println("*** AREA ***");
                System.out.println("Choose shape for Area: \n" +
                        "1. Circle\n" +
                        "2. Triangle\n" +
                        "3. Rectangle\n" +
                        "4. Isosceles Triangle\n" +
                        "5. Parallelogram\n" +
                        "6. Rhombus\n" +
                        "7. Equilateral Triangle");
                int areaChoice = sc.nextInt();

                switch (areaChoice) {
                    case 1:
                        System.out.println("Enter radius for circle: ");
                        double radius = sc.nextDouble();
                        System.out.println("Area of Circle is: " + (Math.PI * radius * radius));
                        break;
                    case 2:
                        System.out.println("Enter base and height for triangle: ");
                        double base = sc.nextDouble();
                        double height = sc.nextDouble();
                        System.out.println("Area of Triangle is: " + (0.5 * base * height));
                        break;
                    case 3:
                        System.out.println("Enter length and width for rectangle: ");
                        double length = sc.nextDouble();
                        double width = sc.nextDouble();
                        System.out.println("Area of Rectangle is: " + (length * width));
                        break;
                    case 4:
                        System.out.println("Enter base and height for isosceles triangle: ");
                        double base1 = sc.nextDouble();
                        double height1 = sc.nextDouble();
                        System.out.println("Area of Isosceles Triangle is: " + (0.5 * base1 * height1));
                        break;
                    case 5:
                        System.out.println("Enter base and height for parallelogram: ");
                        double base2 = sc.nextDouble();
                        double height2 = sc.nextDouble();
                        System.out.println("Area of Parallelogram is: " + (base2 * height2));
                        break;
                    case 6:
                        System.out.println("Enter diagonals d1 and d2 for rhombus: ");
                        double d1 = sc.nextDouble();
                        double d2 = sc.nextDouble();
                        System.out.println("Area of Rhombus is: " + (0.5 * d1 * d2));
                        break;
                    case 7:
                        System.out.println("Enter side for equilateral triangle: ");
                        double side = sc.nextDouble();
                        System.out.println("Area of Equilateral Triangle is: " + ((Math.sqrt(3) / 4) * side * side));
                        break;
                    default:
                        System.out.println("Invalid Shape Choice!");
                }
                break;

            case 2:
                System.out.println("*** PERIMETER ***");
                System.out.println("Choose shape for Perimeter: \n" +
                        "1. Circle\n" +
                        "2. Equilateral Triangle\n" +
                        "3. Parallelogram\n" +
                        "4. Rectangle\n" +
                        "5. Square\n" +
                        "6. Rhombus");
                int periChoice = sc.nextInt();

                switch (periChoice) {
                    case 1:
                        System.out.println("Enter radius for circle: ");
                        double radius = sc.nextDouble();
                        System.out.println("Perimeter of Circle is: " + (2 * Math.PI * radius));
                        break;
                    case 2:
                        System.out.println("Enter side for equilateral triangle: ");
                        double side = sc.nextDouble();
                        System.out.println("Perimeter of Equilateral Triangle is: " + (3 * side));
                        break;
                    case 3:
                        System.out.println("Enter base and side for parallelogram: ");
                        double base = sc.nextDouble();
                        double side2 = sc.nextDouble();
                        System.out.println("Perimeter of Parallelogram is: " + (2 * (base + side2)));
                        break;
                    case 4:
                        System.out.println("Enter length and width for rectangle: ");
                        double length = sc.nextDouble();
                        double width = sc.nextDouble();
                        System.out.println("Perimeter of Rectangle is: " + (2 * (length + width)));
                        break;
                    case 5:
                        System.out.println("Enter side for square: ");
                        double side1 = sc.nextDouble();
                        System.out.println("Perimeter of Square is: " + (4 * side1));
                        break;
                    case 6:
                        System.out.println("Enter side for rhombus: ");
                        double side3 = sc.nextDouble();
                        System.out.println("Perimeter of Rhombus is: " + (4 * side3));
                        break;
                    default:
                        System.out.println("Invalid Shape Choice!");
                }
                break;

            case 3:
                System.out.println("*** VOLUME ***");
                System.out.println("Choose shape for Volume:\n1. Cone\n2. Prism\n3. Cylinder\n4. Sphere\n5. Pyramid");
                int volChoice = sc.nextInt();

                switch (volChoice) {
                    case 1:
                        System.out.print("Enter radius and height for cone: ");
                        double coneR = sc.nextDouble();
                        double coneH = sc.nextDouble();
                        System.out.println("Volume of Cone is: " + ((1.0 / 3) * Math.PI * coneR * coneR * coneH));
                        break;
                    case 2:
                        System.out.print("Enter base area and height for prism: ");
                        double baseArea = sc.nextDouble();
                        double prismHeight = sc.nextDouble();
                        System.out.println("Volume of Prism is: " + (baseArea * prismHeight));
                        break;
                    case 3:
                        System.out.print("Enter radius and height for cylinder: ");
                        double cylR = sc.nextDouble();
                        double cylH = sc.nextDouble();
                        System.out.println("Volume of Cylinder is: " + (Math.PI * cylR * cylR * cylH));
                        break;
                    case 4:
                        System.out.print("Enter radius for sphere: ");
                        double sphereR = sc.nextDouble();
                        System.out.println("Volume of Sphere is: " + ((4.0 / 3) * Math.PI * Math.pow(sphereR, 3)));
                        break;
                    case 5:
                        System.out.print("Enter base area and height for pyramid: ");
                        double pyBase = sc.nextDouble();
                        double pyHeight = sc.nextDouble();
                        System.out.println("Volume of Pyramid is: " + ((1.0 / 3) * pyBase * pyHeight));
                        break;
                    default:
                        System.out.println("Invalid shape choice!");
                }
                break;

            case 4:
                System.out.println("*** CURVED SURFACE AREA ***\n1. Cylinder");
                int csaChoice = sc.nextInt();

                switch (csaChoice) {
                    case 1:
                        System.out.print("Enter radius and height: ");
                        double rCyl = sc.nextDouble();
                        double hCyl = sc.nextDouble();
                        System.out.println("Curved Surface Area of Cylinder: " + (2 * Math.PI * rCyl * hCyl));
                        break;
                    default:
                        System.out.println("Invalid shape choice!");
                }
                break;

            case 5:
                System.out.println("*** TOTAL SURFACE AREA ***\n1. Cube");
                int tsaChoice = sc.nextInt();

                switch (tsaChoice) {
                    case 1:
                        System.out.print("Enter side: ");
                        double cubeSide = sc.nextDouble();
                        System.out.println("Total Surface Area of Cube: " + (6 * cubeSide * cubeSide));
                        break;
                    default:
                        System.out.println("Invalid shape choice!");
                }
                break;

            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
        }

        sc.close();
    }
}