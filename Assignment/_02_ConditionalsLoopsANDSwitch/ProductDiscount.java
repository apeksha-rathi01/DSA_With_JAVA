package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class ProductDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double originalPrice, discountPercent, discountDecimal, discountAmount, FinalAmount = 0;
        System.out.print("Please Enter the Product Original Price: ");
        originalPrice = sc.nextDouble();
        System.out.print("Please Enter the Discount(%) on Product: ");
        discountPercent = sc.nextDouble();

        if(discountPercent > 0){
            discountDecimal = discountPercent / 100;
            discountAmount = originalPrice * discountDecimal;
            FinalAmount = originalPrice - discountAmount;

            System.out.println("Discount Amount is: "+discountAmount);
            System.out.println("Final Amount is: "+FinalAmount);

        }else{
            System.out.println("No Discount is Applied!");
            System.out.println("Final Amount is: "+originalPrice);
        }

    }
}
