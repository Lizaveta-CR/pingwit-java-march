package com.pingwit.core.les_3.classwork;

public class IfElse {

    public static void main(String[] args) {
        /*
        if (condition) {
     //block of code to be executed if the condition = true
        } else {
        //logic
        }
         */

        int x = 10;
        int y = 20;

        if (x < y) {
            System.out.println("Hello");
        } else {
            System.out.println("else");
        }

        if (x < 8) {
            System.out.println("x < 8");
        } else if (x < 9) {
            System.out.println("x < 9");
        } else {
            System.out.println("default: " + x);
        }

        System.out.println("After if-else ... ");

        String result = isEven(x);
        System.out.println(result);
    }

    private static String isEven(int number) {
        String result = number % 2 == 0
            ? "Even"
            : "Not even";
        return result;
    }
}
