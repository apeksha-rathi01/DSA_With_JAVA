package Lecture._03_Methods;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum1();
//        int result = sum2();
//        System.out.println("Sum is: "+result);

          int result = sum3(20,30); //Actual Parameters
          System.out.println("Sum is: "+result);

    }
    /* SYNTAX FOR METHODS
       return_type name(){
          //body
       return statement;
     */

    static void sum1(){
        Scanner sc = new Scanner(System.in);
        int n1, n2, sum = 0;
        System.out.println("Enter the 1st Number: ");
        n1 = sc.nextInt();
        System.out.println("Enter the 2nd Number: ");
        n2 = sc.nextInt();
        sum = n1 + n2;
        System.out.println("Sum of two number is: "+sum);
    }

    // Return The Value
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        int n1, n2, sum = 0;
        System.out.println("Enter the 1st Number: ");
        n1 = sc.nextInt();
        System.out.println("Enter the 2nd Number: ");
        n2 = sc.nextInt();
        sum = n1 + n2;
        return sum;
    }

    /* SYNTAX FOR Argument-METHODS
       return_type name(arguments/parameters){
          //body
       return statement;
     */

    // Pass the values of numbers when you are calling the method in main.
    //Formal Parameters
    static int sum3(int n1, int n2){
        int sum = n1 + n2;
        return sum;
    }

}
