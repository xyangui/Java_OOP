package com.company.department1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /**字符串**************************************************/
        Integer iNum = 3;
        String string = iNum.toString();//整型转字符串
        iNum = Integer.parseInt(string);//字符串转整型

        Float fNum = 5.4f;


        /**数组**************************************************/
        //初始化
        int[] n1 = {3, 5, 9, 7, 4, 1};
        int n2[] = new int[10];

        Arrays.sort(n1); //数组排序
        System.out.print(Arrays.toString(n1));

        String strArray[] = {"str1", "str2", "str3", "str4"};
        String[] strArray2 = new String[10];

        //遍历
        for(int i : n1){
            System.out.println(i);
        }

        for(String str : strArray){
            System.out.println(str);
        }


        /**类*****************************************************/
        int maxAmount = Piece.BOARD_SIZE;// static 只能通过"类名."访问，属性和方法同理

        Piece piece = new Piece();
        int public_variable = piece.public_variable;       //包内可访问
        int protected_variable = piece.protected_variable; //包内可访问
        int default_variable = piece.default_variable;     //包内可访问
        //int private_variable = piece.private_variable;   //包内不可访问

        Rook rook = new Rook();
        rook = new Rook(33,44);

        boolean isValidMove = rook.isValidMove(55,66);

        System.out.println("Game Over");
    }
}
