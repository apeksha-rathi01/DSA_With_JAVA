package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int hcfValue = hcf(n1, n2);
        int lcmValue = lcm(n1, n2, hcfValue);

        System.out.println("HCF of " + n1 + " and " + n2 + " is: " + hcfValue);
        System.out.println("LCM of " + n1 + " and " + n2 + " is: " + lcmValue);
    }

    static int hcf(int n1, int n2) {
        int HCF = 1;
        int min = Math.min(n1, n2);
        for (int i = 1; i <= min; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                HCF = i;
            }
        }
        /*
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (i == j && n1 % i == 0 && n2 % j == 0) {
                    hcf = i;
                }
            }
        }
         */
        return HCF;
    }

    static int lcm(int n1, int n2, int hcfValue) {
        return (n1 * n2) / hcfValue;  // Correct LCM formula
    }
}
