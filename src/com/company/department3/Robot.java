package com.company.department3;

public abstract class Robot {

    //有抽象方法的类，必须为抽象类
    public abstract void move();

    //抽象类可以有非抽象方法
    public void think(){
        System.out.println("Robot is thinking");
    }
}
