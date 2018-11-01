package com.company;

public class EstouroDeLimiteException extends Exception{

    private double saldo;


    public String toString(){
        return "Estouro de limite";
    }
}
