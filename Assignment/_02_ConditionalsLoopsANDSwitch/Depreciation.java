package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class Depreciation {
    //Depreciation means a reduction in the value of an asset over time.
    //This happens due to wear and tear, usage, or becoming outdated.
    /* FORMULA:
    DEPRECIATION = (Original Value - Salvage Value) / Useful Life;
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Original Value: ");
        double original = sc.nextDouble();
        System.out.print("Enter the Salvage Value: ");
        double salVage = sc.nextDouble();
        System.out.print("Enter the Useful Life (Years): ");
        double useful = sc.nextDouble();
        depreciation(original,salVage,useful);

    }
    static void depreciation(double original, double salVage, double useful){
        double DepVal = (original - salVage) / useful;
        System.out.println("Depreciation Value is: "+DepVal);
    }
}
