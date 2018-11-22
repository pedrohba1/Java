package com.company;

public class EstoqueBaixoException extends Exception {

    public String getMessage(){
        return "Estoque insuficiente";
    }


}
