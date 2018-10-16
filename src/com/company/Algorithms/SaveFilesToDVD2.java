package com.company.Algorithms;

import java.util.ArrayList;

public class SaveFilesToDVD2 {
    public static void main() {
        int n = 700;
        int[] s = {600, 550, 400, 300, 120, 50};

        int numDiscs = num_discs(n, s);
    }

    public static int num_discs(int n, int[] s) {

        int numDiscs = 0;
        ArrayList<Integer> remainArrayList = new ArrayList<Integer>(); //存储每张盘剩余空间数

        for (int i = 0; i < s.length; i++){

            int required = s[i];
            boolean isDone = false;

            for (int j = 0; j < remainArrayList.size(); j++){

                Integer remain = remainArrayList.get(j);
                if(remain >= required){

                    remain = remain - required;
                    remainArrayList.set(j, remain);
                    isDone = true;
                    break;
                }
            }

            if(!isDone){
                Integer m = n - s[i];
                remainArrayList.add(m);
            }
        }

        numDiscs = remainArrayList.size();

        return numDiscs;
    }
}
