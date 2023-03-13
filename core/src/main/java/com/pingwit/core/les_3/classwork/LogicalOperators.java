package com.pingwit.core.les_3.classwork;

public class LogicalOperators {

    public static void main(String[] args) {
        //& - AND, | - OR - хотя бы 1 true, ! - NOT, && - AND, || - OR - хотя бы 1 true
        boolean a = true;
        boolean b = false;
        boolean c = !a && b;
        System.out.println(!c);
        System.out.println(!b);
        System.out.println();

        System.out.println(!(2 < 5));
        System.out.println(false & (2 > 5));
        System.out.println((7 < 5) & true);
        System.out.println((2 > 5) || true);
        System.out.println((2 < 5) || false);
    }
}
