package com.company.algorithms;

public class DoubleLoop {

    public static void main() {

//        c语言版本
//        int *x1;
//
//        int x1Length = 4;
//
//        x1 = (int*)malloc(sizeof(int) * x1Length);
//        x1[0] = 1;
//        x1[1] = 2;
//        x1[2] = 3;
//        x1[3] = 4;
//
//        用完后释放内存
//        free(x1);

        int[] x1 = {1, 2, 3, 4};
        int[] y1 = {1, 2, 3, 4};

        int x1Length = x1.length;
        int y1Length = y1.length;

        for (int i = 0; i < x1Length; i++) {
            for (int j = 0; j < y1Length; j++) {
                //TODO
            }
        }

        int[] arr = {12, 23, 34, 56, 56, 56, 78};
        int arrLength = arr.length;
        
        for (int i = 0; i < arrLength; i++) {
            for (int j = 0; j < arrLength - i; j++) {
                //arr[i]
                //arr[j]
            }
        }

        for (int i = 0; i < arrLength; i++) {
            for (int j = i; j < arrLength; j++) {
                //arr[i]
                //arr[j]
            }
        }

        for (int i = 0; i < arrLength; i++) {
            for (int j = arrLength - i; j > 0; j--) {
                //arr[i]
                //arr[j + i -1]
            }
        }

    }
}
