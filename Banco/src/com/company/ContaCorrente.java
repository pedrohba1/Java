package com.company;

public class ContaCorrente {
    private String cliente;
    private int num_conta;
    private float saldo;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public void sacar(float valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
        } else
            System.out.println("Saldo Insuficiente!");
    }

    public void mostrarSaldo(){
        System.out.println("Conta Corrente :"+this.getNum_conta());
        System.out.println("      Cliente  :"+this.getCliente());
        System.out.println("      Saldo    :"+this.getSaldo());
    }




}
