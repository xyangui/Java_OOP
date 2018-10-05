package com.company.interfaces;

public interface Wearable {

    int MAXIMUM = 1000; //所有属性默认 public static final

    void wear();        //所有方法默认 public abstract

    void takeOff();

    default void printToString(){
        //System.out.println(this.toString());
        System.out.println("this is default method");
    }

}
