package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class LargestUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num, max = Integer.MIN_VALUE;;
        while(true){
            num = sc.nextInt();
            if(num == 0)
                break;
            //max = Math.max(num,max);
            if(num > max){
                max = num;
            }
        }
        if(max == Integer.MIN_VALUE) {
            System.out.println("No number is enter: ");
        }else{
            System.out.println("Inputs num Largest value is: "+max);
        }
    }
}
