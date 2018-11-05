package com.company.algorithms;

public class DoubleLoop {

    public static void main() {

//        c语言版本
//        int *x1;
//
//        int length = 4;
//
//        x1 = (int*)malloc(sizeof(int) * length);
//        x1[0] = 1;
//        x1[1] = 2;
//        x1[2] = 3;
//        x1[3] = 4;
//
//        x1Length = sizeof(x1)/sizeof(int);  //判断数组元素个数
//
//        char *buffer;
//        int lenth = strlen(buffer); //判断字符串长度
//
//        用完后释放内存
//        free(x1);

        int[] x1 = {1, 2, 3, 4};
        int[] y1 = {1, 2, 3, 4};

        int x1Length = x1.length;
        int y1Length = y1.length;

        //拿 x1 每个元素分别与 y1（或x1） 的每个元素比较
        for (int i = 0; i < x1Length; i++) {
            for (int j = 0; j < y1Length; j++) {
                //arr[i]
                //arr[j]
            }
        }

        int[] arr = {12, 23, 34, 56, 56, 56, 78};
        int arrLength = arr.length;

        //每次排除一个，放在尾部
        for (int i = 0; i < arrLength; i++) {
            for (int j = 0; j < arrLength - i; j++) {
                //从 0 到（长度 - i）扫描
                //arr[i]
                //arr[j]
            }
        }

        //每次排除一个，放在头部
        for (int i = 0; i < arrLength; i++) {
            for (int j = i; j < arrLength; j++) {
                //从 i 到尾部扫描
                //arr[i]
                //arr[j]
            }
        }

        //每次排除一个，放在头部
        for (int i = 0; i < arrLength; i++) {
            for (int j = arrLength - 1; j > i; j--) {
                //从尾部到 i 扫描
                //arr[i]
                //arr[j]
            }
        }

    }
}
