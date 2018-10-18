package com.company.main;

import com.company.algorithms.RectEncryption;
import com.company.algorithms.SaveFilesToDVD;
import com.company.access.Bishop;
import com.company.abstractclass.AerialRobot;
import com.company.appendix.UseArrayList;
import com.company.appendix.UseHashMap;
import com.company.interfaces.Clothing;
import com.company.interfaces.Seatbelt;
import com.company.interfaces.Wearable;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //JOptionPane.showInputDialog("input data");
        //JOptionPane.showMessageDialog(null,"Message");

        /**字符串**************************************************/
        Integer iNum = 3;
        String string = iNum.toString();//整型转字符串
        iNum = Integer.parseInt(string);//字符串转整型

        Float fNum = 5.4f;

        String str1 = "str1";
        String str2 = "str1";
        boolean isEqual1 = str1 == str2;
        boolean isEqual2 = str1.equals(str2);
        String str3 = new String("str1");
        boolean isEqual3 = str1 == str3;
        boolean isEqual4 = str1.equals(str3);


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


        /**类-封装继承*****************************************************/
        int maxAmount = Piece.BOARD_SIZE;// static 只能通过"类名."访问，属性和方法同理

        Piece piece = new Piece();
        int public_variable = piece.public_variable;       //包内可访问
        int protected_variable = piece.protected_variable; //包内可访问
        int default_variable = piece.default_variable;     //包内可访问
        //int private_variable = piece.private_variable;   //包内不可访问

        Rook rook = new Rook();
        rook = new Rook(33,44);

        boolean isValidMove = rook.isValidMove(55,66);

        /**类-多态*****************************************************/
        Piece[] pieceArray = new Piece[3];
        pieceArray[0] = new Piece();
        pieceArray[1] = new Rook();
        pieceArray[2] = new Bishop();

        for(Piece piece1 : pieceArray){
            piece1.print();
        }

        /**类-抽象类*****************************************************/
        //Robot robot = new Robot();//抽象类不能实例化
        AerialRobot aerialRobot = new AerialRobot();

        /**接口*****************************************************/
        Clothing clothing = new Clothing("arm");
        clothing.wear();

        Seatbelt seatbelt = new Seatbelt();
        seatbelt.wear();

        clothing.printToString();
        seatbelt.printToString();

        //多态的一种表现形式
        Wearable[] wearableArray = new Wearable[2];
        wearableArray[0] = clothing;
        wearableArray[1] = seatbelt;

        for(Wearable wearable : wearableArray){
            wearable.wear();
            wearable.takeOff();
            wearable.printToString();
        }

        /**ArrayList*****************************************************/
        UseArrayList.main(5);
        /**HashMap*****************************************************/
        UseHashMap.main();

        /**algorithms*****************************************************/
        SaveFilesToDVD.main();
        RectEncryption.main();

        /**结束*****************************************************/
        System.out.println("Game Over");
    }
}
