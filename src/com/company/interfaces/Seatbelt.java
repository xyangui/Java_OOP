package com.company.interfaces;

public class Seatbelt implements Wearable {

    private boolean isWorn = false;

    public Seatbelt(){
    }

    public void wear() {
        this.isWorn = true;
        System.out.println("this is wear method in Seatbelt");
    }

    //必须实现 interface 所有方法
    public void takeOff() {
    }
}
