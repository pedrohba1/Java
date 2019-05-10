package com.company;

import java.util.Date;

public class Lancamento implements Imprimivel {
    private Date data;
    private double valor;
    private Boolean debito = false;  //subtrai em conta
    private Boolean credito = false; //adiciona em conta


    public Boolean getCredito() {
        return credito;
    }

    public Date getData() {
        return data;
    }

    public Boolean getDebito() {
        return debito;
    }

    public double getValor() {
        return valor;
    }

    public Lancamento (double valor, Boolean credito, Boolean debito){
        this.valor = valor;
        this.credito = credito;
        this.debito = debito;
    }


    @Override
    public void mostrarDados() {
        if(debito == true){
            System.out.println("debito: " + this.getValor());
        }
        if(credito == true){
            System.out.println ("crédito" + this.getValor());
        }

    }
}
