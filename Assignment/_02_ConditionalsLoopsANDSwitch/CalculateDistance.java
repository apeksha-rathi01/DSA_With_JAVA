package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class CalculateDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the (x1 & y1) for Point-1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Please enter the (x2 & y2) for Point-2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double result = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.println("Distance Between Point-1 & Point-2 is: "+result);
    }
}
