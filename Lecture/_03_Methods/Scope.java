package Lecture._03_Methods;
public class Scope {
    public static void main(String[] args) {
        // variables are only accessible inside the region they are created. This is called scope.
        int a = 10;
        int b = 20;
        String name = "Apeksha";

        //Block Scope.
        {
            //int a = 5; // already initialised outside the block in the same method, hence you cannot initialised again, but you can change the value as well of same variable.
            //reassign the origin re variable to some other value, But same value can't assign again.
            a = 50;
            System.out.println("Inside Block "+a);
            name = "Apeksha Rathi";
            System.out.println("Inside Block"+name);
            int c = 65;
            //Values initialised in this block, will remain in this block.
        }
        System.out.println("Outside Block"+a);
        System.out.println("Outside Block"+name);
        //Any thing initialised inside the block you can definately initialised outside the block
        int c = 100;
        System.out.println(c);

        //Scoping in for-loop
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }
        //System.out.println(i); //Show's Error, because we print it outside the block.
    }
    static void random(){ //Function Scope.
        int num = 98;
        System.out.println(num);
    }

    /*
    Anything initialised outside the block you can't initialised again inside the block,
    but anything initialised inside the block you can definately initialised outside the block.
    */
}
