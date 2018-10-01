package com.company;


public class ContaEspecial extends ContaCorrente {
    private float limite;

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void sacar(float valor) {
        if (this.getSaldo()+limite >= valor ) {
            this.setSaldo(this.getSaldo() - valor);
        } else
            System.out.println("Saldo Insuficiente!");
    }


}