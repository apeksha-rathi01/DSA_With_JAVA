package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        HOW TO CALCULATE COMMISSION PERCENTAGE:-
        COMMISSION PERCENTAGE = (COMMISSION AMOUNT / TOTAL SALE AMOUNT) * 100;
         */
        System.out.print("Please Enter the COMMISSION AMOUNT: ");
        double comAmt = sc.nextDouble();
        System.out.print("Please Enter the TOTAL SALE AMOUNT: ");
        double saleAmt = sc.nextDouble();
        commission(comAmt,saleAmt);
        sc.close();
    }
    static void commission(double comAmt, double saleAmt){
        if(saleAmt != 0){
            double comPercent = (comAmt / saleAmt) * 100;
            System.out.println("COMMISSION PERCENTAGE is: "+comPercent+"%");
        }else{
            System.out.println("ERROR! Sale Amount Value is ZERO");
        }
    }
}
