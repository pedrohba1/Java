package com.company;

public class ContaBancaria {
    private String nome;
    private double saldo = 0;
    private double limite;


    public String getNome() {
        return nome;
    }

    public ContaBancaria(String nome, double limite){
        this.nome = nome;
        this.saldo = 0;
        this.limite = limite;
    }

    public ContaBancaria(){
        this.nome = null;
        this.saldo = 0;
        this.limite = 0;
    }


    public void depositar(double dinheiro) throws EstouroDeLimiteException{
     if(dinheiro < 0){
         IllegalArgumentException e = new IllegalArgumentException();
         throw e;
     }

    this.saldo += dinheiro;
    }


    public double getLimite() {
        return limite;
    }

    public void sacar(double dinheiro) throws EstouroDeLimiteException {

        if(dinheiro < 0){
            IllegalArgumentException e = new IllegalArgumentException();
            throw e;
        }

       else if (this.saldo < dinheiro){
            EstouroDeLimiteException e1 = new EstouroDeLimiteException();
            throw e1;
        }

        else {
            this.saldo -= dinheiro;
        }
    }




    public double getSaldo() {
        return saldo;
    }


}
