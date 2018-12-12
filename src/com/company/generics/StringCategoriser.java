package com.company.generics;

public class StringCategoriser implements Categoriser<String, String> {

    public String categorise(String input){
        if (input.length() == 0){
            return "";
        }
        return input.substring(0, 1);
    }
}
