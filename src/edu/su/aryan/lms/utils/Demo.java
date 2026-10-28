package edu.su.aryan.lms.utils;

public class Demo {
    public static void main(){
            System.out.println("\n\t===Swaping Numbers Using Different Approaches===");
        SwapNumbers sn;
        sn = (a, b) -> {
            System.out.println("\n===Swaping Numbers Using Temporary Variable===");
            System.out.println("\tBefore Swap: First Number is " + a + " and Second Number is " + b);

            // using temp variable 
            int temp;                                         
            temp = a;
            a = b;
            b = temp;

           System.out.println("\tAfter Swap: First Number is " + a + " and Second Number is " + b);
        };
        sn.swap(10, 20);

        sn = (a, b) -> {
            System.out.println("\n===Swaping Numbers Using Arithmetic operator(+,-)===");
            System.out.println("\tBefore Swap: First Number is " + a + " and Second Number is " + b);

            //using arithmetic operators(+,-)
            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("\tAfter Swap: First Number is " + a + " and Second Number is " + b);
        };
        sn.swap(67, 69);

        sn = (a, b) -> {
            System.out.println("\n===Swaping Numbers Using Bitwise Operators(XOR)===");
            System.out.println("\tBefore Swap: First Number is " + a + " and Second Number is " + b);

            // using bitwise operators(XOR)
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;

            System.out.println("\tAfter Swap: First Number is " + a + " and Second Number is " + b);
        };
        sn.swap(100, 200);

    }
}