package com.company;

public class Lançamento {
    private boolean credito; //crébito o drébito
    private float valor;

    public Lançamento(float valor, boolean credito){
        this.valor = valor;
        this.credito = credito;
    }



    public void setValor(float f){
        this.valor = f;
    }
    public float getValor(){
        return this.valor;
    }
}



