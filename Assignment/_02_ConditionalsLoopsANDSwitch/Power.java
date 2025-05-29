package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base Value: ");
        double b = sc.nextDouble();
        System.out.println("Enter the Exponent Value: ");
        double e = sc.nextDouble();
        power(b,e);
    }
    static void power(double base , double exp){
        System.out.println(base+" power "+exp+" is: "+ Math.pow(base,exp));
    }
}
