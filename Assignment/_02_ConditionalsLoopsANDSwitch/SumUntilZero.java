package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num values: ");
        int num, sum = 0;
        while(true){
            num = sc.nextInt();
            if(num == 0)
                break;
            sum += num;
        }
        System.out.println("Inputs num values sum is: "+sum);
    }
}
