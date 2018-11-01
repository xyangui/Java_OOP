package com.company.algorithms;

/**
 * In this question you will implement the rectEncryption encryption algorithm.
 * The algorithm takes a line of text and converts it to a rectangle of width
 * n characters, as below. All characters are converted to upper case, with
 * spaces replaced by the # symbol, and * characters added to fill up the rectangle.
 * The text is then encrypted by reading down the columns from top to bottom.
 *
 * Write the public String rectEncryption(String text, int n) method that implements
 * this algo- rithm. You may define any additional classes/methods you feel you need.
 *
 * Example:
 * Input: rectEncryption("We have to wait so long for Game of Thrones!", 8)
 * Rectangular form:
 * WE#HAVE#
 * TO#WAIT#
 * SO#LONG#
 * FOR#GAME
 * #OF#THRO
 * NES!****
 * Output: WTSF#NEOOOOE###RFSHWL##!AAOGT*VINAH*ETGMR*###EO*
 */
public class RectEncryption {

    public static void main(){

        String input = "We have to wait so long for Game of Thrones!";

        String output = rectEncryption(input,8);

        input = "We have to wait so long for Game of Thro";

        output = rectEncryption(input,8);
    }

    public static String rectEncryption(String text, int k){

        String outPut = "";

        //确认行数
        int numRow = text.length()/k;

        int numStar = k - text.length() % k; //最后一行*的数量

        if(text.length() % k != 0){
            numRow = numRow + 1;
        }

        text = text.toUpperCase(); //全部变成大写
        text = text.replaceAll(" ","#"); //用#代替空格

        //在字符串最后加上相应数量的*
        for(int i = 0; i < numStar; i++){
            text = text + "*";
        }

        //循环遍历 重新排序
        for(int i = 0; i < k; i += 1){
            for(int j = i; j < text.length(); j += k){
                outPut = outPut + text.charAt(j);
            }
        }

        return outPut;
    }



}
