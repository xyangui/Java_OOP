package com.company.interfaces;

public class Clothing implements Wearable {

    private String bodyPart;

    public Clothing(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    public void wear() {
        //System.out.format("%s is worn on your %s.\n", this.getClass().getName(), this.bodyPart);
        System.out.println("this is wear method in Clothing");
    }

    //必须实现 interface 所有方法
    public void takeOff() {
        System.out.println("this is takeOff method in Clothing");
    }
}
