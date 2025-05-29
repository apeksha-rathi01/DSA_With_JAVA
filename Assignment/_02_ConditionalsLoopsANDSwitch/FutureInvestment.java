package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class FutureInvestment {
    /*
    Future Value (FV) = P × (1 + r)^t
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Principal Amount: ");
        double P = sc.nextDouble();
        System.out.print("Please enter the Annual Interest Rate (%): ");
        double r = sc.nextDouble();
        System.out.print("Please enter the Time (in years): ");
        double t = sc.nextDouble();

        // Convert percentage to decimal
        r = r / 100;

        futureInvest(P, r, t);
    }

    static void futureInvest(double P, double r, double t) {
        double FV = P * Math.pow((1 + r), t);
        System.out.printf("Future Investment is: ₹%.2f\n", FV); // Rounded to 2 decimal places
    }
}
