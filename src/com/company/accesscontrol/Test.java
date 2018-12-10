package com.company.accesscontrol;

import com.company.main.Piece;

public class Test {

    public Test(){
        Piece piece = new Piece();
        int public_variable = piece.public_variable;         //包外可访问
        //int protected_variable = piece.protected_variable; //包外不可访问
        //int default_variable = piece.default_variable;     //包外不可访问
        //int private_variable = piece.private_variable;     //包外不可访问
    }
}
