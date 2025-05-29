package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        /*
        Compound Interest means:
        👉 You earn interest not only on your original money,
        but also on the interest you earned earlier.
        So each year, your money grows faster because you get "interest on interest."
        FORMULA:
        Compound Interest(CI) = A − P;
        Where, A = P × ( 1 + ( r / 100))^t

         */
        //P = Principal amount (initial money).
        //r = Annual interest rate (%).
        //t = Time (in years).
        //A = Final amount (total money after interest)

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Principal Amount: ");
        double P = sc.nextDouble();
        System.out.print("Please enter the Annual Interest Rate: ");
        double r = sc.nextDouble();
        System.out.print("Please enter the Time (in years): ");
        double t = sc.nextDouble();

        double A = P * Math.pow((1 + (r/100)),t);
        compInterest(A,P);
    }
    static void compInterest(double A, Double P){
        System.out.println("Compound interest is: %.2f\n "+ (A-P));

    }
}
