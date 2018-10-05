package com.company.main;

public class Rook extends Piece {

    public Rook() {
        //super(); //不加 super(); ，同样调用父类无参构造函数 super();

        int public_variable = this.public_variable;       //包内子类可访问
        int protected_variable = this.protected_variable; //包内子类可访问
        int default_variable = this.default_variable;     //包内子类可访问
        //int private_variable = this.private_variable;   //包内子类不可访问
    }

    public Rook(int row, int col) {
        //不加 super(row, col); ，同样调用父类无参构造函数 super();
        super(row, col);

        this.row = row;
        this.col = col;
    }

    @Override  //可以不写，"public + 返回值 + 方法名 + 参数"与父类都相同
    public boolean isValidMove(int row, int col) {
        // 调用父类被覆盖方法：super.方法名()，否则父类方法被覆盖
        return super.isValidMove(row, col) && ((this.row == row) || (this.col == col));
    }

    @Override
    public void print() {
        System.out.println("I am Rook.");
    }
}
