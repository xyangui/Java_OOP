package com.company.department2;

import com.company.department1.Piece;

public class Bishop extends Piece {

    public Bishop(){
        int public_variable = this.public_variable;       //包外子类可访问
        int protected_variable = this.protected_variable; //包外子类可访问
        //int default_variable = this.default_variable;   //包外子类不可访问
        //int private_variable = this.private_variable;   //包外子类不可访问
    }
}
