package com.company.department1;

public class Piece {

    /**
     * static：全局变量
     * final：常量
     * 常量名全部大写
     */
    public static final int BOARD_SIZE = 32;

    public int public_variable;
    protected int protected_variable;
    int default_variable;
    private int private_variable;

    protected int row;
    protected int col;

    public Piece() { //不能加 void ，否则 new Piece(); 时不调用此构造函数

        public_variable = 11;
        protected_variable = 22;
        default_variable = 33;
        private_variable = 44;

        this.row = 99;
        this.col = 88;
    }

    //同样的方法名，不同的参数，即重载，overload，也是多态的一种表现形式
    public Piece(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public boolean isValidMove(int row, int col) {
        return row >= 0 && row < BOARD_SIZE &&
                col >= 0 && col < BOARD_SIZE;
    }

    public void print() {
        System.out.println("I am Piece.");
    }
}
