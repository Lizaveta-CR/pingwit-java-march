package com.pingwit.core.les_3.classwork;

public class SwitchExample {

    public static void main(String[] args) {
        /*
        switch (expression) {
         case x:
         //code
         break;
          case y:
         //code
         break;
         ....
         default:
         //code
        }
        //code...
         */

        int x = 30;

        switch (x) {
            case 27:
                System.out.println("case 1");
                break;
            case 30:
                System.out.println("case 2");
                break;
            case 23:
                System.out.println("case 23");
                break;
            default:
                System.out.println("default");
        }
        System.out.println("===");
        switch (x) {
            case 1 -> System.out.println("case 1");
            case 2 -> System.out.println("case 2");
            case 22 -> System.out.println("case 22");
            default -> System.out.println("default");
        }
    }
}
