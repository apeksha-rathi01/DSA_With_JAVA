package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** ELECTRICITY-BILL ***");
        System.out.println("Step 1: For Calculating Total Unit Consumed.");
        System.out.print("Please enter Current Reading: ");
        double current = sc.nextDouble();
        System.out.print("Please enter Previous Reading: ");
        double previous = sc.nextDouble();;

        double Unit = current - previous;
        double bill = 0;

        if(Unit <= 100){
            bill = Unit * 1.5;
        }else if(Unit <=200){
            bill = 100 * 1.5 + (Unit - 100) * 2.5;
        }else{
            bill = 100 * 1.5 + 100 * 2.5 + (Unit - 200) * 4.0;
        }
        bill += 100;

        System.out.println("Total Unit Consumed is: "+Unit);
        System.out.println("Total Electricity Bill is: "+bill);

    }
}
