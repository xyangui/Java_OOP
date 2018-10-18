package com.company.algorithms;

import java.util.ArrayList;

/**
 A game studio is preparing to release Shadow Quest Deluxe for physical distribution,
 and due to the amazing videos, graphics and music, have found that all of its files
 combined adds up to several gigabytes in size, and needs to be shipped on multiple DVDs.
 Each DVD can hold n megabytes of data. There is an integer array s which contains
 the size of each file in megabytes, sorted from largest to smallest – some files are
 hundreds of megabytes and others are just a few megabytes, but no file is larger than n megabytes.
 To save costs, the studio has decided to try to minimise the number of DVDs that the game will
 require by placing the files according to the following algorithm:

 Select the largest file and copy it onto the first disc. For each file thereafter
 (in decreasing order of size), copy it onto the first used disc that it will fit on, and
 if none exists, start a new disc. Continue this process until all files have been copied onto a disc.

 For example if n = 700 and s = 600, 550, 400, 300, 120, 50, the solution is 3 (the DVDs will
 be packed with [600 + 50, 550 + 120, 400 + 300]).

 Write a Java method that calculates the number of DVDs that the studio will end up using:
       public static int num_discs(int n, int[] s);
 Note: This is not necessarily the most efficient method, but that is the method
 the studio has chosen so you must follow it.
 You may use any of a Java classes that are provided in the Appendix.
 */
public class SaveFilesToDVD {
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
