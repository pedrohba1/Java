package com.company;

public class Conta {
    private float saldo;
    private Cliente cliente;
    private final int LIMITE = 10;
    private Lançamento[] lamc;
    private int cont;

    public Conta (Cliente c){
        this.cliente = c;

    }

    public void depositar(float valor){
        Lançamento l = new Lançamento(valor, true);

    }



}


