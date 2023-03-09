package com.pingwit.core.les_2.classwork;

public class TypeCasting {

    public static void main(String[] args) {
        //automatic
        byte myByte = 120;
        short myShort = myByte;

        byte myByte2 = 120;
        byte myByte3 = 30;
        float sumOfBytes = myByte2 + myByte3;

        //manual
        myByte = (byte) myShort;
        System.out.println(myByte);

        // 200 - 256 = -56
        myShort = 200;
        myByte = (byte) myShort;
        System.out.println(myByte);

        double myDouble = 33.67;
        int myInt = (int) myDouble;
        System.out.println("myInt = " + myInt);

        char c = 1000;
        int x = c;

        double d = x;

        String myString = "Hello, someone!";
        //byte -> Byte, int -> Integer, char -> Character, short -> Short, boolean -> Boolean ...
        Byte carSpeed = 25;
        String carSpeedStr = carSpeed.toString();
        System.out.println(carSpeedStr);
        byte carSpeedByteValue = carSpeed.byteValue();

        Short toyPower = 10000;
        short toyPowerStr = toyPower.shortValue();
        System.out.println();
        System.out.println(toyPowerStr);
    }
}
