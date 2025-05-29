package Lecture._03_Methods;
public class Overloading {
    // Method overloading means having multiple methods with the same name but with different inputs (parameters) in the same class.
    public static void main(String[] args) {
        fun(29);
        fun("Apeksha Rathi");
        int ans = sum(5,6);
        System.out.println(ans);

    }
    static int sum( int a, int b){
        return a+b;
    }
    static int sum( int a, int b, int c){
        return a+b+c;
    }
    static void fun(int a){
        System.out.println(a);

    }
    static void fun(String name){
        System.out.println(name);
    }
}
