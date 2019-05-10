package com.company;

public class ContaEspecial extends ContaBancaria  {
    private double limite = 300;
    private double limiteGasto = 0;
    private double saldo = 0;
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteGasto() {
        return limiteGasto;
    }

    public void setLimiteGasto(double limiteGasto) {
        this.limiteGasto = limiteGasto;
    }

    public void sacar(double valor) {
        if (this.getSaldo() >= valor ) {
            this.setSaldo(this.getSaldo() - valor);
        }
         if (this.getSaldo() < valor){
             if(this.limite >= valor && valor <= (this.limite -this.limiteGasto)) {
                 this.setLimiteGasto(this.getLimiteGasto() + valor);
             }
             else System.out.println("seu limite estourou!");
         }
    }


    public void depositar (double valor){
        this.saldo += valor;
    }


    public ContaEspecial(double limite){
        this.setLimite(limite);
        this.nmrConta = cont++;
    }

    @Override
    public void mostrarDados() {


        System.out.println("Nome do cliente: "+ this.getNomeCiente());
        System.out.println("Número da conta: " + this.getnmrConta());
        System.out.println("saldo: R$" + this.getSaldo());
        System.out.println("limite: R$" + this.getLimite());
        System.out.println("limite gasto R$ "+ this.getLimiteGasto());
        System.out.println("lançamentos:");

        for(Lancamento lac : this.lancs){
            lac.mostrarDados();
        }

    }
}

