package com.company.enumdemo;

public class UseEnum {
    public static void main() {

        EnumDemo demo1, demo2;
        demo1 = EnumDemo.FRIDAY;
        demo2 = EnumDemo.MONDAY;

        int result = demo1.compareTo(demo2);


        EnumDemo demo3;

        switch (demo1) {
            case MONDAY:
                demo3 = EnumDemo.MONDAY;
                break;
            case FRIDAY:
                demo3 = EnumDemo.FRIDAY;
                break;
        }
    }
}
