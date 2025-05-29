package Lecture._01_JavaProgram;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float num = sc.nextFloat();
//        System.out.println(num);
//        //TypeCasting
//        int num1 = (int)(67.58f);
//        System.out.println(num1);
//
//        //Automatic type promotion in expression
//        int a = 257;
//        byte b = (byte)(a); //257 % 256 = 1 (25 is byte value)
//        System.out.println(b);
//
//        byte c = 40;
//        byte d = 50;
//        byte e = 100;
//        int f = (c*d)/e;
//        System.out.println(f);
//
//        //Automatic type conversion
//        int number = 'a';
//        System.out.println(number);
//        int Number = 'A';
//        System.out.println(Number);
//
//        //UniCode Value
//        System.out.println("Namaste");
//
//        //Type Promotion Rules
//        System.out.println(2 * 35 + 45422.5);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
     }
}
