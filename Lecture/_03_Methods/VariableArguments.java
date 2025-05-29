package Lecture._03_Methods;
import java.util.*;
public class VariableArguments {
    //Variable Arguments (Varargs)-
    // Variable Arguments in Java simplify the creation of methods that need to take a variable number of arguments.
    public static void main(String[] args) {
        demo("Apeksha","Akanshi","Anushka");
        //demo(); //Shows Error! It can't be empty.
        fun();
        fun(2,3,4,5,6,7,8,9,10);
        multiple(29, "Apeksha Rathi", 50,30,60,20,60);

    }
    static void demo(int ...d){
        System.out.println(Arrays.toString(d));
    }
    static void demo(String ...d){
        System.out.println(Arrays.toString(d));
    }
    static void fun(int ...v){ // It takes a variable numbers of arguments.
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int r, String name, int ...m ){ //VarArgs is always at the end.
        System.out.println("Roll No. is: "+r);
        System.out.println("Name is: "+name);
        System.out.println("Marks is: "+ Arrays.toString(m));
    }
}
