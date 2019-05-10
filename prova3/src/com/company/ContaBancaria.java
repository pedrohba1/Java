package com.company;

import java.util.ArrayList;

abstract class ContaBancaria implements Imprimivel {
    public static int cont = 0;
    public int nmrConta;
    public String nomeCiente;
    public ArrayList<Lancamento> lancs = new ArrayList<Lancamento>();


    public abstract void sacar(double saque);
    public abstract void depositar(double deposito);


    public int getnmrConta() {
        return nmrConta;
    }

    public void setNomeCiente(String nomeCiente) {
        this.nomeCiente = nomeCiente;
    }

    public int getNmrConta() {
        return nmrConta;
    }

    public String getNomeCiente() {
        return nomeCiente;
    }
}
